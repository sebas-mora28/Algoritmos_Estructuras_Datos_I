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


import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.util.Callback;

import java.io.BufferedReader;


import java.io.*;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Controller implements Initializable {
    public TableView<ObservableList<StringProperty>> Tabla;
    public AnchorPane anchor;
    public MenuItem Open;
    public MenuItem exit;
    public MenuItem about;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void Button_Action(ActionEvent event) {

        //Se crea el buscador de archivos por del objeto FileChooser
        FileChooser fileChooser = new FileChooser();
        fileChooser.setInitialDirectory(new File("C:\\Users"));
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("CSV Files", "*.CSV"));
        File selectedFile = fileChooser.showOpenDialog(null);



        if (selectedFile != null) { //En caso de cerrar el buscador sin seleccionar ningún archivo
            Scanner scanner;
            try {
                scanner = new Scanner(selectedFile);
                if (scanner.hasNext()) { //Verifica si el archivo que se seleccionó se encuentra vacío
                    setTable(Tabla, selectedFile);

                }else{
                    throw new FileNotFoundException();

                }
            } catch (FileNotFoundException e) {
                System.out.print("Error");
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Ocurrió un problema");
                alert.setContentText("El documento que seleccionó esta vacío");
                alert.showAndWait();

            }

        }

    }
    // Se crea tanto las columnas como los valores de la tabla
    private void setTable(TableView<ObservableList<StringProperty>> Table, File selectedFile){
        Table.getItems().clear();
        Table.getColumns().clear();
        try {
            FileReader file = new FileReader(selectedFile);
            BufferedReader file_readed = new BufferedReader(file);
            String titles_line = file_readed.readLine();
            String[] titles  = titles_line.split(",");

            for(int i =0; i<titles.length; i++){
                Table.getColumns().add(createColumn(i, titles[i]));
            }
            PopulateTable(Table, file_readed);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void PopulateTable(TableView<ObservableList<StringProperty>> Table, BufferedReader file_readed) throws IOException {
        String data;
        while ((data = file_readed.readLine()) != null){
            String[] dataValues  = data.split(",");

            for(int index= Table.getColumns().size() ; index < dataValues.length; index++){
                System.out.println("Entra");
                Tabla.getColumns().add(createColumn(index, ""));
            }
            ObservableList<StringProperty> info = FXCollections.observableArrayList();
            for(String value: dataValues){
                info.add(new SimpleStringProperty(value));
            }
            Tabla.getItems().add(info);
        }
    }

    //Se crean el número de columnas dependiendo del archivo que se seleccionó
   private TableColumn<ObservableList<StringProperty>, String> createColumn(int index, String columntitle){
        TableColumn<ObservableList<StringProperty>, String> column = new TableColumn<>();

        String title;
         if(columntitle == null || columntitle.trim().length()==0){
            title = "column" + (index +1);
        }else{ title = columntitle; }
        column.setText(title);
        column.setText(columntitle);
        column.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ObservableList<StringProperty>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<ObservableList<StringProperty>, String> cellDataFeatures) {
                ObservableList<StringProperty> values = cellDataFeatures.getValue();
                if(index >= values.size()){
                    return new SimpleStringProperty("");
                }else{
                    return cellDataFeatures.getValue().get(index);
                }
            }
        });
        return column;
}

    public void exitActionButton(ActionEvent event){
        System.exit(0);
    }

    public void aboutActionButton(ActionEvent event){
        Alert about = new Alert(Alert.AlertType.INFORMATION);
        about.setTitle("");
        about.setHeaderText("About");
        about.setContentText("                  Instituto Tecnológico de Costa Rica\n" +
                "                 Área de Ingeniería en Computadores\n" +
                "             Algoritmos y Estructuras de Datos 1(CE 1103) \n" +
                "\n                   Estudiante: Sebastián Mora Godínez \n" +
                "\n                      Profesor: Isaac Herrera Ramírez \n" +
                "\n                            Segundo Semestre, 2019");
        about.showAndWait();
    }


}


