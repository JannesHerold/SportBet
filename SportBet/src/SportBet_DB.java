import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SportBet_DB {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
		
				// Diese Eintraege werden zum
				// Verbindungsaufbau benoetigt.
				final String hostname = "localhost";
				final String port = "3306";
				final String dbname = "mysql";
				final String user = "root";
				final String password = "";
				Connection conn = null;
				Statement query;
				String sql;
				// Java-Database-Connectivity-Driver (JDBC-Treiber) laden
				try {
				System.out.println("* Treiber laden");
				 Class.forName("org.gjt.mm.mysql.Driver").newInstance();
				 System.out.println(Class.forName("org.gjt.mm.mysql.Driver"));
				 System.out.println(Class.forName("org.gjt.mm.mysql.Driver").newInstance());
				}
				catch (Exception e) {
				System.err.println("Unable to load driver.");
				e.printStackTrace();
				}
				//DB-Verbindung aufbauen
				try {
				 System.out.println("* Verbindung aufbauen");
				 String url = "jdbc:mysql://"+hostname+":"+port+"/"+dbname;
				 conn = DriverManager.getConnection(url, user, password);
				}
				catch (SQLException sqle) {
				System.out.println("SQLException: " + sqle.getMessage());
				System.out.println("SQLState: " + sqle.getSQLState());
				System.out.println("VendorError: " + sqle.getErrorCode());
				sqle.printStackTrace();
				}
				// Tabelle anzeigen
//				try {
//				// SQL-Abfrage generieren
//				query = conn.createStatement();
//				 sql = "SELECT * FROM Fahrzeuge WHERE Abgasnorm='EU5'";
//				 ResultSet result = query.executeQuery(sql);
//				 // Ergebnisstabelle durchsuchen
//				 while (result.next()) {
//				String modell = result.getString("Modell");
//				String hersteller = result.getString("Hersteller");
//				String stammsitz = result.getString("Stammsitz");
//				String abgasnorm = result.getString("Abgasnorm");
//				String info = modell + ", " + hersteller + ", " + stammsitz + ", " + abgasnorm;
//				System.out.println(info);
//				 }
//				}
//				catch (SQLException e) {
//				e.printStackTrace();
//				}
				 // Datenbank-Verbindung beenden
				 System.out.println();
				 System.out.println("* Datenbank-Verbindung beendet");
				 conn.close();

	}

}
