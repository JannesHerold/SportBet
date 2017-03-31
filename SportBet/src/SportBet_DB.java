// Standardpaketanwendung - default package application 
//package SportBet;									

// MySQL-Bibliothek für die Verbindung
//-MySQL Library for connection Statementsf
import java.sql.Connection;												
// MySQL-Bibliothek mit Treibern, um eine Verbindung zu einer MySQL-Datenbank zu erhalten 
//-MySQL Library with drivers to get a connection to a MySQL Database
import java.sql.DriverManager;											
// MySQL-Bibliothek für Strings mit SQL-Befehlen
//-MySQL Library for Strings with SQL commands
import java.sql.PreparedStatement;
// MySql-Bibliothek, um alle Informationen aus einer Tabelle auszugeben
//-MySql Library to give all information from a table
import java.sql.ResultSet;
// MySQL-Bibliothek, um die Tabelle als Array-Liste auszugeben
//-MySQL Library to give out the Table as Array List
import java.util.ArrayList;


import java.util.*;

// Start mit der Datenbankklasse, 4 Methoden 
//-start with the Database class, 4 methods
public class SportBet_DB {

	// Methode um die Verbindung mit der MySQL-Datenbank mit dem Namen "SportBet" herzustellen
	//-method that connect to the MySQL database called "SportBet"
				public static Connection getConnection() throws Exception {

					
					    
					
						// Die Folgenden Einträge werden 
						// zum Verbindungsaufbau benötigt
					
					try {
						// lädt den Java MySQL Connector Treiber
						String driver = "com.mysql.jdbc.Driver";
						// Dieser String gibt den Pfad an, wo die MySQL-Datenbank gespeichert ist
						String url = "jdbc:mysql://localhost/sportbet";
						// String, der den Benutzernamen an die Datenbank weitergibt, um Zugriff zu erhalten
						String username = "root";
						// String, der das Passwort an die Datenbank weitergibt, um Zugriff zu erhalten
						String password = "";
						Class.forName(driver);
						// Hier wird mit den Informationen URL, username und password versucht,
						// sich mit der Datenbank zu verbinden
						Connection conn = DriverManager.getConnection(url, username, password);
						// Es wird ausgegeben, das sich das Programm mit der Datenbank verbunden hat
						System.out.println("Verbunden");
						// Gibt die url, username und das password zurück
						return conn;
						// bei bestehenden Fehlern werden diese ausgegeben
					} catch (Exception e) {
						// Gibt aus welcher MySQL Datenbank fehler vorliegt
						System.out.println(e);
					}

						// Gibt keine Werte zurück wenn Fehler auftreten
					return null;
				}

				
					//
				public static void createTable() throws Exception {
						
					
					
					
					
						// Die Folgenden Einträge überprüfen,
						// ob bereits eine Tabelle vorhanden ist.
						// Wenn dies nicht der Fall ist, wird eine neue Tabelle erstellt
				
				
				try {
						Connection con = getConnection();
						PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS logindaten(id int NOT NULL AUTO_INCREMENT, username varchar(255), password varchar(255), PRIMARY KEY (id))");
						create.executeUpdate();


					} catch (Exception e) {
						System.out.println(e);
					} finally {
						System.out.println("Tabelle Erstellt oder Vorhanden!");
					}
				}
	
				
				
				
				
				
	public static Scanner eingabe;

	public static void main(String[] args) throws Exception {




			 createTable();
			 post();
			 get();
	}


			public static ArrayList<String> get() throws Exception {
				try {
					Connection con = getConnection();
					PreparedStatement statement = con.prepareStatement("SELECT username, password FROM logindaten");

					ResultSet result = statement.executeQuery();

					ArrayList<String> array = new ArrayList<String>();
					while (result.next()) {
						System.out.print(result.getString("username"));
						System.out.print(" ");
						System.out.println(result.getString("password"));

						array.add(result.getString("password"));
					}
					System.out.println("Alle Inhalte wurden wiedergegeben");
					return array;

				} catch (Exception e) {
					System.out.println(e);
				}
				return null;

			}

			public static void post() throws Exception{
				eingabe = new Scanner (System.in);
				System.out.print("Benutzername: ");
				String var1 = eingabe.nextLine();
				System.out.print("\nPasswort: ");
				String var2 = eingabe.nextLine();

				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("INSERT INTO logindaten (username, password) VALUES ('" + var1 + "', '" + var2 + "')");
					posted.executeUpdate();
				} catch (Exception e) {
					System.out.println(e);
				} finally {
					System.out.println("Eingabe erfolgreich");
				}
			}

			

			

	}




