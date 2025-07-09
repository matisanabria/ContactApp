package org.matisanabria;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.matisanabria.services.ContactService;

import java.io.IOException;


public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Scene scene = new Scene(FXMLLoader.load(Main.class.getResource("/org/matisanabria/view/MainView.fxml")));
        String css = this.getClass().getResource("/org/matisanabria/css/style.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setTitle("ContactApp");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}