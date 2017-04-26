/** SportBet Datenbank
 * 
 * Dieser Quellcode stellt eine Verbindung zu einer SQL-Datenbank her und 
 * pr�ft ob eine Tabelle bereits vorhanden ist. Wenn dies nicht der Fall ist,
 * wird eine Tabelle erstellt.
 * 
 * @version 1.2
 * @author Ole Wehmh�rner
 * 
 */



/** Import der verschiedenen Bibliotheken
 */

// MySQL-Bibliothek f�r die Verbindung
import java.sql.Connection;												
// MySQL-Bibliothek mit Treibern, um eine Verbindung zu einer MySQL-Datenbank zu erhalten 
import java.sql.DriverManager;											
// MySQL-Bibliothek f�r Strings mit SQL-Befehlen
import java.sql.PreparedStatement;
// MySql-Bibliothek, um alle Informationen aus einer Tabelle auszugeben
import java.sql.ResultSet;
// MySQL-Bibliothek, um die Tabelle als Array-Liste auszugeben
import java.util.ArrayList;


import java.util.*;

// Start mit der Datenbankklasse, 4 Methoden
public class SportBet_DB {

	
	
	/** 1 Methode - Verbindung mit der MySQL-Datenbank herstellen
	 * 
	 * Methode um die Verbindung mit der MySQL-Datenbank mit dem Namen "SportBet" herzustellen
	 * 
	 * Es wurde in allen 4 Methoden das Try-Catch Kommando benutzt, da dieses einen Codeabschnitt umschliesst und wird daf�r verwendet m�gliche Fehler (exceptions) 
	 * innerhalb dieses Codeabschnittes abzufangen, sodass man darauf reagieren kann. 
	 *
	 * @param ... Beschriebung des 1. Paramters ...
	 * @param ... Beschriebung des 2. Paramters ...
	 * @return ... Beschriebung des R�ckgabewertes ...
 	 */
	
	
				public static Connection getConnection() throws Exception {

					
					    
					
						// Die Folgenden Eintr�ge werden 
						// zum Verbindungsaufbau ben�tigt
					
					try {
						// l�dt den Java MySQL Connector Treiber
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
						// Gibt die url, username und das password zur�ck
						return conn;
						// bei bestehenden Fehlern werden diese ausgegeben
					} catch (Exception e) {
						// Gibt aus welcher MySQL Datenbank fehler vorliegt
						System.out.println(e);
					}

						// Gibt keine Werte zur�ck wenn Fehler auftreten
					return null;
				}

				
				
				
				/** 2 Methode - �berpr�fung und Erstellung einer Tabelle
				 * 
				 * Die Folgenden Eintr�ge �berpr�fen, ob bereits eine Tabelle vorhanden ist.
				 * Wenn dies nicht der Fall ist, wird eine neue Tabelle erstellt
				 * 
				 * @throws Exception
				 */
			
			
				
				public static void createTable() throws Exception {
						
					
					
					
					try {
						// Mit "Connection con = getConnection()" gehen wir sicher,dass wir auch mit der Datenbank verbunden sind
						Connection con = getConnection();
						PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS logindaten(id int NOT NULL AUTO_INCREMENT, username varchar(255), password varchar(255), PRIMARY KEY (id), UNIQUE (username))");
						create.executeUpdate();


					} catch (Exception e) {
						System.out.println(e);
					} finally {
						System.out.println("Tabelle Erstellt oder Vorhanden!");
					}
				}
	
				
				
				/** 3 Methode - Weitergabe des Benutzernamens und des Passwortes an die Tabelle logindaten
				 * 
				 * 
				 * 
				 * 
				 * @throws Exception
				 */
				
				
	public static Scanner eingabe;

	public static void main(String[] args) throws Exception {




			 createTable();
			 post();
			 get();
	}


				/** 4 Methode - Methode, die die gespeicherten Informationen aus der Tabelle ausgibt
				 * 
				 * Diese Methode gibt die gespeicherten Informationen aus der Tabelle logindaten aus der Datenbank Sportbet aus
				 * 
				 * 
				 * @throws Exception
				 */
	
	
	
	
	
				public static ArrayList<String> get() throws Exception {
				try {
					// Mit "Connection con = getConnection()" gehen wir sicher,dass wir auch mit der Datenbank verbunden sind
					Connection con = getConnection();
					// Diese vorbereitete Anweisung, erlaubt es, MySQL-Befehle als String zu verwenden.
					// hier wird eine Select-Anweisung verwendet, um den Benutzername und das Passwort aus der Tabelle logindaten zu erhalten
					PreparedStatement statement = con.prepareStatement("SELECT username, password FROM logindaten");
					// Ergebnisse werden ausgegeben, solange welche vorhanden sind
					ResultSet result = statement.executeQuery();
					// Ein neuer String Array wird f�r den usernamen und das password erstellt
					ArrayList<String> array = new ArrayList<String>();
					// Solange wir Ergebnisse haben, werden diese Ausgegeben
					while (result.next()) {
						// Gibt den username aus 
						System.out.print(result.getString("username"));
						// L�sst eine L�cke zwischen username und passwort
						System.out.print(" ");
						// Gibt das Passwort aus
						System.out.println(result.getString("password"));

						array.add(result.getString("password"));
					}
					// Alle Inhalte der Tabelle werden ausgegeben
					System.out.println("Alle Inhalte wurden wiedergegeben");
					return array;

				} catch (Exception e) {
					System.out.println(e);
				}
				return null;

			}

			

				/** 5 Methode - method that gets the entered username and password from the "regis.Controller" class,
				 *  to push them into the "logindaten" table
				 * 
				 * 
				 * 
				 * 
				 * @throws Exception
				 */
				
				
				
				public static void post() throws Exception{
				eingabe = new Scanner (System.in);
				System.out.print("Benutzername: ");
				String var1 = eingabe.nextLine();
				System.out.print("\nPasswort: ");
				String var2 = eingabe.nextLine();

				try {
					// Zeile nimmt die beiden String Daten var1 und var2 und speichert Sie
					// sie verschl�sselt wegen des SHA1 in die Datenbank ab.
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("INSERT INTO logindaten (username, password) VALUES ('" + var1 + "',SHA1( '" + var2 + "'))");
					posted.executeUpdate();
				} catch (Exception e) {
					System.out.println(e);
				} finally {
					System.out.println("Eingabe erfolgreich");
				}
			}

			

			

	}




