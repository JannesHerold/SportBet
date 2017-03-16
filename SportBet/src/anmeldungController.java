import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class anmeldungController {

    @FXML
    private TextField anmelden_eingabe;

    @FXML
    private TextField passwort_eingabe;

    @FXML
    void anmelde_button(ActionEvent event) throws IOException {
    	Pane  mainPane= (Pane) FXMLLoader.load(anmeldungController.class.getResource("RichtigeStartseite.fxml"));
    	Stage stage = new Stage();
		stage.setScene(new Scene(mainPane));
		
		
		stage.show(); 
		
		stage.setResizable(false);			//feste fenstergröße (fenster kann nicht mehr mit der maus größer oder kleiner gezogen werden)
		((Node)(event.getSource())).getScene().getWindow().hide();	//verbirgt das vorherige Fenster
    }

    @FXML
    void regestrieren_button(ActionEvent event) throws IOException {
    	Pane  mainPane= (Pane) FXMLLoader.load(anmeldungController.class.getResource("registrierung.fxml"));
    	Stage stage = new Stage();
		stage.setScene(new Scene(mainPane));
		
		
		stage.show(); 
		
		stage.setResizable(false);			//feste fenstergröße (fenster kann nicht mehr mit der maus größer oder kleiner gezogen werden)
		((Node)(event.getSource())).getScene().getWindow().hide();	//verbirgt das vorherige Fenster

    }

}
