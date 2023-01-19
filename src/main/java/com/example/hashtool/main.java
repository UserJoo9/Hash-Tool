package com.example.hashtool;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
public class main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("window.fxml"));
        stage.getIcons().add(new Image("D:\\programming\\java\\Projects\\Hash-Tool\\src\\main\\java\\com\\example\\hashtool\\logo.jpg"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hash Tool");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}