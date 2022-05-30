package com.anypixelstudio.ru;

import javafx.application.HostServices;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;


public class PrimaryController{

    private MessageHandler mh = new MessageHandler();
    private StringCollection sc = new StringCollection();

    public TextField userLogin;
    public TextField userPass;
    public ListView userList;

    @FXML
    private TextField nameQuest;
    public HostServices hostServices;

    public void StartGame(){
    }

    public void OptimizationGameHelp(){
        mh.SelectMessage(3,"","");
    }

    public void AccListHelp(){
        mh.SelectMessage(3,"","");
    }

    public void WriteUserAccount(){
        String getUserLogin = userLogin.getText();
        String getUserPass = userPass.getText();
        if(userLogin.getText().equals("") || userPass.getText().equals("")){
            mh.SelectMessage(1, "1", "2");
        }else{
            userList.getItems().add(getUserLogin+getUserPass);
        }
    }

    /////////////////////////////////////////////////////////////2
    public void SearchQuest(){
        String getUserNameQuest = nameQuest.getText();
        if(nameQuest.getText().equals("")){
            mh.SelectMessage(1, "1", "2");
        }else{
            OpenBrowes("www.google.com");
        }  
    }

    public void OpenBrowes(String url) {
      this.getHostServices().showDocument(url);
    }

    private HostServices getHostServices() {
        return null;
    }

}

