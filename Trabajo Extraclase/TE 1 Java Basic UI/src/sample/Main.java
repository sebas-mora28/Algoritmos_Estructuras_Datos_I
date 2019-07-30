/**
 *
 * Instituto Tecnológico de Costa Rica
 * Área de Ingeniería en Computadores
 * Algoritmos y Estructuras de Datos 1(CE 1103)
 *
 * Estudiante: Sebastián Mora Godínez
 *
 * Profesor: Isaac Ramírez Herrera
 *
 * Segundo Semestre, 2019
 */



package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.setTitle("TE I - Java 101: Basic UI Example");
        primaryStage.setResizable(false);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);

    }


}
