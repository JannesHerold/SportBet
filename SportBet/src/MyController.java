import java.awt.Label;
import java.awt.*;
import javafx.scene.control.TextField;
import java.io.IOException;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

public class MyController {

	public static boolean spieltip1;
	public static boolean spieltip2;
	public static boolean spieltip3;
	public static boolean spieltip4;
	public static boolean spieltip5;
	public static boolean spieltip6;
	public static boolean spieltip7;
	public static boolean spieltip8;
	public static boolean spieltip9;
	double einsatzuebrgabe1;
	double einsatzuebrgabe2;
	double einsatzuebrgabe3;
	double einsatzuebrgabe4;
	double einsatzuebrgabe5;
	double einsatzuebrgabe6;
	double einsatzuebrgabe7;
	double einsatzuebrgabe8;
	double einsatzuebrgabe9;

	@FXML
	private TextField einsatz1;

	@FXML
	private TextField einsatz4;

	@FXML
	private TextField einsatz5;

	@FXML
	private TextField einsatz6;

	@FXML
	private TextField einsatz7;

	@FXML
	private TextField einsatz8;

	@FXML
	private TextField einsatz3;

	@FXML
	private TextField einsatz2;

	@FXML
	private TextField einsatz9;

	@FXML
	void bundesliga_1(ActionEvent event) {

	}

	@FXML
	void bundesliga_2(ActionEvent event) {

	}

	@FXML
	void reihe1team1(ActionEvent event) throws IOException {
		spieltip1 = true;
		String spielereinsatz1 = einsatz1.getText();
		einsatzuebrgabe1 = Double.parseDouble (spielereinsatz1);
	}

	@FXML
	void reihe1team2(ActionEvent event) {
		spieltip1 = false;
		String spielereinsatz1 = einsatz1.getText();
		
		einsatzuebrgabe1 = Double.parseDouble(spielereinsatz1);
	}

	@FXML
	void reihe2team1(ActionEvent event) {
		spieltip2 = true;
		String spielereinsatz2 = einsatz2.getText();
		
		einsatzuebrgabe2 = Double.parseDouble(spielereinsatz2);
	}

	@FXML
	void reihe2team2(ActionEvent event) {
		spieltip2 = false;
		String spielereinsatz2 = einsatz2.getText();
		
		einsatzuebrgabe2 = Double.parseDouble(spielereinsatz2);

	}

	@FXML
	void reihe3team1(ActionEvent event) {
		spieltip3 = true;
		String spielereinsatz3 = einsatz3.getText();
		
		einsatzuebrgabe3 = Double.parseDouble(spielereinsatz3);

	}

	@FXML
	void reihe3team2(ActionEvent event) {
		spieltip3 = false;
		String spielereinsatz3 = einsatz3.getText();
		
		einsatzuebrgabe3 = Double.parseDouble(spielereinsatz3);

	}

	@FXML
	void reihe4team1(ActionEvent event) {
		spieltip4 = true;
		String spielereinsatz4 = einsatz4.getText();
		
		einsatzuebrgabe4 = Double.parseDouble(spielereinsatz4);

	}

	@FXML
	void reihe4team2(ActionEvent event) {
		spieltip4 = false;
		String spielereinsatz4 = einsatz4.getText();
		
		einsatzuebrgabe4 = Double.parseDouble(spielereinsatz4);

	}

	@FXML
	void reihe5team1(ActionEvent event) {
		spieltip5 = true;
		String spielereinsatz5 = einsatz5.getText();
		
		einsatzuebrgabe5 = Double.parseDouble(spielereinsatz5);

	}

	@FXML
	void reihe5team2(ActionEvent event) {
		spieltip5 = false;
		String spielereinsatz5 = einsatz5.getText();
		
		einsatzuebrgabe5 = Double.parseDouble(spielereinsatz5);

	}

	@FXML
	void reihe6team1(ActionEvent event) {
		spieltip6 = true;
		String spielereinsatz6 = einsatz6.getText();
		
		einsatzuebrgabe6 = Double.parseDouble(spielereinsatz6);

	}

	@FXML
	void reihe6team2(ActionEvent event) {
		spieltip6 = false;
		String spielereinsatz6 = einsatz6.getText();
		
		einsatzuebrgabe6 = Double.parseDouble(spielereinsatz6);

	}

	@FXML
	void reihe7team1(ActionEvent event) {
		spieltip7 = true;
		String spielereinsatz7 = einsatz7.getText();
		
		einsatzuebrgabe7 = Double.parseDouble(spielereinsatz7);

	}

	@FXML
	void reihe7team2(ActionEvent event) {
		spieltip7 = false;
		String spielereinsatz7 = einsatz7.getText();
	
		einsatzuebrgabe7 = Double.parseDouble(spielereinsatz7);

	}

	@FXML
	void reihe8team1(ActionEvent event) {
		spieltip8 = true;
		String spielereinsatz8 = einsatz8.getText();
		
		einsatzuebrgabe8 = Double.parseDouble(spielereinsatz8);

	}

	@FXML
	void reihe8team2(ActionEvent event) {
		spieltip8 = false;
		String spielereinsatz8 = einsatz8.getText();
		
		einsatzuebrgabe8 = Double.parseDouble(spielereinsatz8);

	}

	@FXML
	void reihe9team1(ActionEvent event) {
		spieltip9 = true;
		String spielereinsatz9 = einsatz9.getText();
		
		einsatzuebrgabe9 = Double.parseDouble(spielereinsatz9);

	}

	@FXML
	void reihe9team2(ActionEvent event) {
		spieltip9 = false;
		String spielereinsatz9 = einsatz9.getText();
		
		einsatzuebrgabe9 = Double.parseDouble(spielereinsatz9);

	}

}
