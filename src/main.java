import java.sql.Connection;
import java.sql.SQLException;

public class main {

	public static void main(String[] args) throws SQLException {
		/*
		 * 1. Punta ka muna dun sa DBConnector.java then read the comments
		 * 
		 * So ayun ininstantiate lang natin ung connection natin dto sa database then snet natin na nakafalse ung autocommit
		 * para incase na magkaissue pwede natin sya irollback.
		 */
		DbConnector connector = new DbConnector();
		Connection conn = null;
		/*
		 * Eto ung try catch finally block gngamit natin to sa mga cases na alam natin na possible na magkaroon ng issue or exception.
		 * Si sql ksi possible yan magreturn ng mga errors pero lahat ng errors nun nakapaloob sa SQLException mga possible errors
		 * is hindi ka makaconnect sa db ksi nakadown or mali ung credentials na pnrovide mo or di kaya naman may mali sa nirrun mo na
		 * query. So sa try block dto natin illagay ung mga operations na gusto natin gawin for example ung pagcreate ng connections
		 * and pagrun ng mga queries natin. So anong mangyyari pag ung nasa loob ng try block natin eh nagkaroon ng error jan pumapasok
		 * si catch, in scenario na magkaroon ng exception eto ung mga ssundin or ggwin natin so nakalagay dun sa catch block natin na
		 * iprint ung stackTrace para malaman natin kung ano ung error and gusto natin magrollback kung sakaling nagiinsert tayo tapos
		 * nagkaerror gusto natin marollback ung changes na un. Then lastly si finally, si finally is eto ung last na ggawin nya palagi
		 * kaya sya finally hahaha kahit anong mangyari ggawin ng program mo or ieexecute nya ung nasa finally na block kung success man 
		 * ung lahat ng operation mo kay try block or nagkaroon ka ng error at snalo sya ni catch block ang mgging ending pa dn nya is 
		 * si finally. So dto sa gnawa natin ang gngawa lang ni finally is iclose ung connection kay db so icclose nya ung connection
		 * maging successful man ung operation or hindi.
		 */
		try {
			conn = connector.getConnection();
			conn.setAutoCommit(false);
			Person person = new Person();
			person.setName("Name 3");
			person.setAddress("Address 3");
			person.setOccupation("Occ 3");
			connector.insertStatement(conn, person);
			connector.getPerson(conn);
		} catch (SQLException e) {
			e.printStackTrace();
			conn.rollback();
		} finally {
			conn.close();
		}
	}

}
