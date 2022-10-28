package com.example.fxlesson4;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBoxBase;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ResourceBundle;

public class RegisterController implements Initializable{
    @FXML
    TextField nameTextField,emailTextField,passTextField;
    @FXML
    Button registerButton, loginButton;
    @FXML
    private ComboBox<String> comBoxGroup, comBoxNumber;

    @FXML
    protected void loginOnClicked(ActionEvent event){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("login-view.fxml"));
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
    protected void registerOnClicked(ActionEvent event){

        try{
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("login-view.fxml"));
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
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        String groups[]={"1f1","1f2","2f1","2f2","3e","4i"};
        String rooms[]={"202","203","204","205","206","207"};

        ObservableList<String> data=FXCollections.observableArrayList(groups);
        ObservableList<String> data1=FXCollections.observableArrayList(rooms);

        comBoxGroup.setItems(data);
        comBoxNumber.setItems(data1);
    }


}

