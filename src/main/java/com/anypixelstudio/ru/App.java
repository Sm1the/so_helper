package com.anypixelstudio.ru;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;   

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private static int Width = 800;
    private static int Height = 500;
    private static String NameApp = "[SOH] StayOut Helper ";
    private Image appLogo = new Image(getClass().getResourceAsStream("applogo.jpg"));


    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), Width, Height);
        stage.setScene(scene);
        stage.setTitle(NameApp);
        stage.resizableProperty().setValue(Boolean.FALSE);
        stage.getIcons().add(appLogo);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}