package com.example.fxlesson4;


import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class wlcmController implements Initializable {

    @FXML
    private ImageView close, max, min;

    @FXML
    private Label Menu;

    @FXML
    private Label MenuClose;
    @FXML
    private AnchorPane mainAnch;

    @FXML
    private AnchorPane slider;

    @Override
    public void initialize(URL location, ResourceBundle rb) {
//
//        close.setOnMouseClicked(event -> {
//            System.exit(0);
//        });



        slider.setTranslateX(-176);
        Menu.setOnMouseClicked(event -> {
            TranslateTransition slide = new TranslateTransition();
            slide.setDuration(Duration.seconds(0.4));
            slide.setNode(slider);

            slide.setToX(0);
            slide.play();

            slider.setTranslateX(-176);

            slide.setOnFinished((ActionEvent e)-> {
                Menu.setVisible(false);
                MenuClose.setVisible(true);
            });
        });

        MenuClose.setOnMouseClicked(event -> {
            TranslateTransition slide = new TranslateTransition();
            slide.setDuration(Duration.seconds(0.4));
            slide.setNode(slider);

            slide.setToX(-176);
            slide.play();

            slider.setTranslateX(0);

            slide.setOnFinished((ActionEvent e)-> {
                Menu.setVisible(true);
                MenuClose.setVisible(false);
            });
        });


    }

    @FXML
    private void min_action(MouseEvent event){
        Stage stage = (Stage) min.getScene().getWindow();
        stage.setIconified(true);
    }
    @FXML
    private void max_action(MouseEvent event){
        Stage stage = (Stage)slider.getScene().getWindow();
        if(stage.isMaximized()){
            stage.setMaximized(false);
        }else{
            stage.setMaximized(true);
        }
    }
    @FXML
    private void close_action(MouseEvent event){
        javafx.application.Platform.exit();
    }
    public void showDashboard(ActionEvent actionEvent) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("dashboard.fxml"));

        try {
            Pane registerPane = fxmlLoader.load();
            mainAnch.getChildren().clear();
            mainAnch.getChildren().add(registerPane);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void add(ActionEvent actionEvent) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("add.fxml"));

        try {
            Pane registerPane = fxmlLoader.load();
            mainAnch.getChildren().clear();
            mainAnch.getChildren().add(registerPane);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
