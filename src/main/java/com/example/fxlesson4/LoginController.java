package com.example.fxlesson4;


import javafx.beans.value.ChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Stack;

public class LoginController {
    @FXML
    TextField emailTextField, passTextField;
    @FXML
    Button registrButton, loginButton;


    @FXML
    protected void registerOnClicked(ActionEvent event){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("register-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(),356,410);
            Stage stage = new Stage();
            stage.setTitle("Registration for our group");
            stage.setScene(scene);
            stage.show();
            ((Node)event.getSource()).getScene().getWindow().hide();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
    @FXML
    protected void loginOnClicked(ActionEvent event){
        String str = emailTextField.getText().toString();
        String strq = passTextField.getText().toString();
        if(str.equals("jomart") && strq.equals("123")){
            try{
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("wlcm.fxml"));
                Scene scene = new Scene(fxmlLoader.load(),600,400);
                Stage stage = new Stage();
                stage.setTitle("Registration for our group");
                stage.setScene(scene);
                stage.show();
                ((Node)event.getSource()).getScene().getWindow().hide();
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }
    }
}