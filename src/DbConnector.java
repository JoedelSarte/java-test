import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.MysqlDataSource;

public class DbConnector {
	
	/*
	 * Eto ung way ng pagcreate ng connection sa db meron pang ibang ways sa pagconnect sa db depende sa framework 
	 * na gngamit pero eto ung common na way so nanjan pnapasa natin ung username password tska ung url ung url format is
	 * "address:port/db_name" then irreturn lang natin ung connection so makkita mo sa lahat ng methods natin nagtthrow tayo ng 
	 * SQLException ksi possible na makaencounter tayo ng error kunwari nakadown ung db server di tayo makaconnect dapat mahandle natin
	 * ung scenario na un kaya nagtthrow tayo ng exception. So need mong palitan username and password based sa snet mo sa local instance mo.
	 */
	public Connection getConnection() throws SQLException {
		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setUser("root");
		dataSource.setPassword("Pass123!");
		dataSource.setUrl("jdbc:mysql://localhost:3306/test_db");
		return dataSource.getConnection();
	}
	/*
	 * Eto naman ung paggamit ng preparedStatement ang pnagkaiba ksi ni preparedStatement vs Statement ung nsa pangatlong method
	 * si preparedStatement kaya nyang gumamit ng mga placeholders. Ung mga question marks dun sa property natin na query
	 * ang twag dun is placeholders so sila ung mga properties na pwede nating palitan ng value based dun sa kung ano need natin 
	 * ilagay. So for example eto nga gusto natin maginsert ng another entry sa person na table natin so index based nman sya 
	 * pero sa 1 sya nagsstart unlike sa mga common na array na sa 0 sya nagsstart so aun dba ung 1st index nilagay natin ung name
	 * then address then occupation based dun sa pagkkaarrange dun sa query natin. Then kung mapapansin mo after natin iexecute
	 * ung query tnawag natin si commit ksi snet natin na ung autoCommit na nakafalse para incase na magkaroon ng issue
	 * pwede natn irollback ung mga change.
	 */
	public void insertStatement(Connection conn, Person person) throws SQLException {
		String query = "INSERT INTO person(name, address, occupation) VALUES (?, ?, ?)";
		PreparedStatement stmt = conn.prepareStatement(query);
		stmt.setString(1, person.getName());
		stmt.setString(2, person.getAddress());
		stmt.setString(3, person.getOccupation());
		stmt.execute();
		conn.commit();
	}
	/*
	 * Eto naman ung typical na pagfetch ng data sa db ang gngawa natin is gumagawa tayo ng statement which is un ung query natin 
	 * then after execution ang nirreturn nun na object is resultSet. So si resultSet naman is iterable ibig sabihin pwede natin syang 
	 * iloop ung mga results na nakuha natin. So ayun habang may laman pa ung resultSet habang nagiiterate tayo true lang ung nirreturn nya
	 * tapos pag nahit na natin ung end false na kaya while(rs.next()). Then ung pagkuha naman ng mga values ayan kung mapapansin mo
	 * getInt or getString so depende kung ano ung datatype sa database un dn ung irreturn na type jan sa resultSet then kung mapapansin mo
	 * index based ung gnamit ko kaya rs.getInt(1) pero pwede mo pa dng gamitin ung column name for example rs.getInt("id") so method 
	 * overriding sya. Pero ngayon mas maganda na gamitin ung column name kesa sa index ksi nakakalito pag index based.
	 */
	public void getPerson(Connection conn) throws SQLException {
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM person");
		while(rs.next()) {
			System.out.println("===========================");
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
			System.out.println("===========================");
		}
	}
}
