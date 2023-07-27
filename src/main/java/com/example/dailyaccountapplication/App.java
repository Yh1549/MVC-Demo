package com.example.dailyaccountapplication;

import com.example.dailyaccountapplication.core.LoadingScene;
import com.example.dailyaccountapplication.db.InitDBService;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {
    public void start(Stage stage) throws Exception {
        LoadingScene loading = new LoadingScene();
        stage.setScene(loading.startLoading());
        stage.show();

        InitDBService.initDB();

        FXMLLoader loadingLoader = new FXMLLoader(App.class.getResource("view/Loading.fxml"));
        FXMLLoader loader = new FXMLLoader(App.class.getResource("view/Home.fxml"));
        var homeScene = new Scene(loader.load());
        var LoadingScene = new Scene(loadingLoader.load());
//        scene.getStylesheets().add(App.class.getResource("view/Home.css").toExternalForm());
        Image icon = new Image(App.class.getResource("img/icon.png").toExternalForm());
        stage.getIcons().add(icon);
        stage.setTitle("stage!!demo!@!");
        stage.setScene(LoadingScene);
        stage.show();
    }
    public static void main(String[] args) {
        Application.launch();
    }
}
