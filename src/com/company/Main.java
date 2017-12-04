package com.company;

import com.company.Aktywa.Spolka;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Main extends Application {

    public Main(){
        System.out.println(1);
        Spolka sp=new Spolka("a",1,1);
        List<Field> privateFields = new ArrayList<>();
        Field[] allFields =Spolka.class.getDeclaredFields();
        for (Field field : allFields) {
            System.out.println(field.getName().toString());
        }
        System.out.println(2);
    }

    private TableView<Spolka> tableView = new TableView<>();

    private ObservableList<Spolka> dataList =
            FXCollections.observableArrayList(
                    new Spolka("January", 100.3,5),
                    new Spolka("January2", 100.5,7));

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Gieuda Symulathor 20017 Pro");


        primaryStage.setScene(new Scene(root, 1500, 1000));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
