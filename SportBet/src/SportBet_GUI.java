import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class SportBet_GUI extends Application {

	public static void main(String[] args){
		
		
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Pane  mainPane= (Pane) FXMLLoader.load(SportBet_GUI.class.getResource("anmeldung.fxml"));
		primaryStage.setScene(new Scene(mainPane));
		primaryStage.setResizable(false);			//feste fenstergröße (fenster kann nicht mehr mit der maus größer oder kleiner gezogen werden)
		
		
		primaryStage.show(); 
	}
	
	}
