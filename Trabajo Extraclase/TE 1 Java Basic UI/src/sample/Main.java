package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);

        /*
        String fileName = "C:\\Users\\sebas\\OneDrive\\Attachments\\Desktop\\Hoja.csv";
        File file = new File(fileName);
        try {
            System.out.println("Entra aqui");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
                String data = scanner.next();
                System.out.print(data);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

         */
    }


}
