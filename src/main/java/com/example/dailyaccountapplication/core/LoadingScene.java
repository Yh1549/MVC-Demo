package com.example.dailyaccountapplication.core;

import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class LoadingScene{
    private static final int LOADING_TIME_MS = 3000; // 3秒后关闭加载画面

//    public static void main(String[] args) {
//        launch(args);
//    }


    public Scene startLoading() {
        // 创建加载画面布局
        StackPane loadingLayout = new StackPane();
        loadingLayout.setStyle("-fx-background-color: #f0f0f0;");

        // 创建一个旋转的圆圈来表示加载过程
        Circle loadingCircle = new Circle(40, Color.BLUE);

        // 创建旋转动画
        RotateTransition rotateTransition = new RotateTransition(Duration.seconds(2), loadingCircle);
        rotateTransition.setByAngle(360);
        rotateTransition.setInterpolator(Interpolator.LINEAR);
        rotateTransition.setCycleCount(Animation.INDEFINITE);
        rotateTransition.play();

        loadingLayout.getChildren().add(loadingCircle);

        // 创建场景并设置到舞台
        return new Scene(loadingLayout, 200, 200);
//        primaryStage.setScene(scene);
//        primaryStage.setTitle("Loading Screen Example");
//        primaryStage.show();

//        // 使用JavaFX的延迟功能，使加载画面在一定时间后关闭
//        PauseTransition delay = new PauseTransition(Duration.millis(LOADING_TIME_MS));
//        delay.setOnFinished(event -> {
//            primaryStage.close(); // 关闭加载画面
//            // 在这里添加你的主程序逻辑，例如加载主界面或其他内容
//        });
//        delay.play();
    }
}
