package com.example.dailyaccountapplication;

import com.example.dailyaccountapplication.db.InitDBService;
import com.example.dailyaccountapplication.db.SQLiteJDBC;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        SQLiteJDBC.initDb();
        FXMLLoader loader = new FXMLLoader(App.class.getResource("view/Home.fxml"));
        var scene = new Scene(loader.load());
        Image icon = new Image(App.class.getResource("img/icon.png").toString());
        stage.getIcons().add(icon);
        stage.setTitle("stage!!demo!@!");
//        stage.setWidth(1280);
//        stage.setHeight(640);

        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
//        InitDBService.initDB();
//        SQLiteJDBC.initDb();

        Application.launch();
    }
}
