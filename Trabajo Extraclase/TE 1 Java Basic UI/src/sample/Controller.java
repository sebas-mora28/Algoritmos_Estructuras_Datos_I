package sample;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;



import java.io.File;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Executable;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Controller implements Initializable {
    public Button fileChooser;
    public TableView Tabla;
    public AnchorPane anchor;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void Button_Action(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setInitialDirectory(new File("C:\\Users"));
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("CSV Files", "*.CSV"));
        File selectedFile = fileChooser.showOpenDialog(null);


        if (selectedFile != null) {
            Scanner scanner = null;
            try {
                scanner = new Scanner(selectedFile);
                if (!scanner.hasNext()){
                    System.out.print("Error");
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText("Ocurrió un problema");
                    alert.setContentText("El documento que seleccionó esta vacío");
                    alert.showAndWait();
                    return;
                }
                while (scanner.hasNext()) {
                    String data = scanner.next();
                    String[] datos = data.split(",");
                    for(int i=0; i<datos.length; i++){
                        System.out.println("Entra");
                        System.out.println(datos[i]);
                        TableColumn column = new TableColumn(datos[i]);
                        column.setCellFactory(new PropertyValueFactory<>(datos[i]));
                        Tabla.getColumns().addAll(column);
                    }


                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();

            }

        }

    }
    
}


