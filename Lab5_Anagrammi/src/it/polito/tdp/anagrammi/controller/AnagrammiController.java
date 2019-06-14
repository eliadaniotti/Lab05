package it.polito.tdp.anagrammi.controller;

import java.util.List;

import it.polito.tdp.anagrammi.model.Model;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AnagrammiController {
	
	Model model= new Model();

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnCalcola;

    @FXML
    private TextArea txtCorretti;

    @FXML
    private TextArea txtErrati;

    @FXML
    private Button btnReset;
    
    public void setModel(Model model) {
    	this.model=model;
    }
    
    @FXML
    void doCalcola(ActionEvent event) {
    	String parola = txtParola.getText();
    	List<String> anagrammi = model.getAnagrammi(parola);
    	for(String s : anagrammi)
    		txtCorretti.appendText(s + "\n");
    }

    @FXML
    void doReset(ActionEvent event) {

    }

}


