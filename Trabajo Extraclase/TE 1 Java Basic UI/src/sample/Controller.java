package sample;


import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.stage.FileChooser;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public Button fileChooser;
    public TableView Tabla;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void Button_Action(ActionEvent event){
        FileChooser fileChooser = new FileChooser();
        fileChooser.setInitialDirectory(new File("C:\\Users"));
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("CSV Files", "*.CSV"));
        File selectedFile = fileChooser.showOpenDialog(null);

        if (selectedFile != null){
            Tabla.getItems().add(selectedFile.getAbsolutePath());
        }



    }
}
