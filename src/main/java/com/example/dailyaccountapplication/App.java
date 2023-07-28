package com.example.dailyaccountapplication;

import com.example.dailyaccountapplication.db.InitDBService;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {
    public void start(Stage stage) throws Exception {
        InitDBService.initDB();
        FXMLLoader loader = new FXMLLoader(App.class.getResource("view/Home.fxml"));
        var homeScene = new Scene(loader.load());
        Image icon = new Image(App.class.getResource("img/icon.png").toExternalForm());
        stage.getIcons().add(icon);
        stage.setTitle("stage!!demo!@!");
        stage.setScene(homeScene);
        stage.show();
    }
    public static void main(String[] args) {
        Application.launch();
    }
}
