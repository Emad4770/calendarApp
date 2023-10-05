/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersianCalander;

import PersianCalander.components.Calendar.Calendar;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.StageStyle;
import static javafx.application.Application.launch;


/**
 *
 * @author Emad47
 */
public class MainCalendar extends Application {

    Button bt;
    public static TextField tf;
    public static Stage stage2;

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("/PersianCalander/FXML/pop.fxml"));
        bt = (Button) root.lookup("#datebtn");
        tf = (TextField) root.lookup("#datetxt");
        Scene scene = new Scene(root);
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.show();
        bt.setOnAction(e -> {
            stage2 = new Stage();
            Calendar root2 = new Calendar();
            Scene scene2 = new Scene(root2);
            scene2.getStylesheets().add(getClass().getResource("/PersianCalander/Main/style.css").toExternalForm());
//            stage2.setResizable(false);
            stage2.setScene(scene2);
            stage2.show();

        });

//        stage2.setOnCloseRequest(c -> {
//            tf.setText(date);
//
//        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
