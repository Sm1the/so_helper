package com.anypixelstudio.ru;

import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MessageHandler {

    public void SelectMessage(int selectMessage, String headerMessage, String contentMessage) {
        Stage stage;
        switch (selectMessage) {
            case 1:
                Alert alert = new Alert(Alert.AlertType.WARNING);
                stage = (Stage) alert.getDialogPane().getScene().getWindow();
                stage.getIcons().add(new Image(getClass().getResource("applogo.jpg").toString()));
                alert.setTitle("Предупреждение");
                alert.setHeaderText(headerMessage);
                alert.setContentText(contentMessage + "");
                alert.show();
                break;
            case 2:
                alert = new Alert(Alert.AlertType.ERROR);
                stage = (Stage) alert.getDialogPane().getScene().getWindow();
                stage.getIcons().add(new Image(getClass().getResource("applogo.jpg").toString()));
                alert.setTitle("Ошибка");
                alert.setHeaderText(headerMessage);
                alert.setContentText(contentMessage + "");
                alert.show();
                break;
            case 3:
                alert = new Alert(Alert.AlertType.INFORMATION);
                stage = (Stage) alert.getDialogPane().getScene().getWindow();
                stage.getIcons().add(new Image(getClass().getResource("applogo.jpg").toString()));
                alert.setTitle("Информация");
                alert.setHeaderText(headerMessage);
                alert.setContentText(contentMessage + "");
                alert.show();
                break;
        }
    }
}
