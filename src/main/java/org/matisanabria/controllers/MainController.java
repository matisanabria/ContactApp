package org.matisanabria.controllers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.matisanabria.Main;

import java.io.IOException;

public class MainController {

    @FXML
    private void newContactButton(ActionEvent event){
        try {
            // Carga la vista desde el FXML
            Scene scene = new Scene(FXMLLoader.load(Main.class.getResource("/org/matisanabria/view/NewContactView.fxml")));

            // Crea una nueva ventana
            Stage newWindow = new Stage();
            newWindow.setTitle("Nuevo Contacto");
            newWindow.setResizable(false);
            newWindow.setScene(scene);
            newWindow.show();

        } catch (IOException e) {
            e.printStackTrace(); // Imprimí el error si el FXML no se carga bien
        }
    }
    @FXML
    private void exitButton(javafx.event.ActionEvent event){
        Platform.exit();
    }
}
