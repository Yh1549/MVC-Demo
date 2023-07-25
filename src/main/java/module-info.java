module com.example.dailyaccountapplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
//    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.sql;
    requires org.xerial.sqlitejdbc;

    opens com.example.dailyaccountapplication to javafx.fxml;
    opens com.example.dailyaccountapplication.controller to javafx.fxml;
    exports com.example.dailyaccountapplication;
    exports com.example.dailyaccountapplication.controller;
}