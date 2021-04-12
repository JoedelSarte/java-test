import java.sql.Connection;
import java.sql.SQLException;

public class main {

	public static void main(String[] args) throws SQLException {
		DbConnector connector = new DbConnector();
		Connection conn = connector.getConnection();
		conn.setAutoCommit(false);
		try {
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
