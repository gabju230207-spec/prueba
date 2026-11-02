package com.eduvinsystems.recursividadfactorial.controller;

import com.eduvinsystems.recursividadfactorial.clases.MiFactorial;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField tfNumero;
    @FXML
    private Label lblResultado;


    @FXML
    void onCalcular(ActionEvent event) {
        MiFactorial factorial2 = new MiFactorial();
        int numeroFactorial = Integer.parseInt(tfNumero.getText());
        lblResultado.setText("EL FACTORIAL DE "+numeroFactorial+" ES: " +factorial2.calcularFactorial(numeroFactorial));
    }

}
