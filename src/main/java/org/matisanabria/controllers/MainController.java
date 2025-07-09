package org.matisanabria.controllers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainController {



    @FXML
    private void exitButton(javafx.event.ActionEvent event){
        Platform.exit();
    }
}
