package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override // Redefinisanje start metoda klase Application
    public void start(Stage primaryStage) throws Exception{

        // kreiranje okvira i unos njegovih svojstava
        FlowPane pane = new FlowPane();
       pane.setPadding(new Insets(11,12,13,14));
       pane.setHgap(5);
       pane.setVgap(5);

       // postavljanje cvorova u okviru
        pane.getChildren().addAll(new Label("First Name"),
                new TextField(), new Label("MI:"));
        TextField tfMI = new TextField();
        tfMI.setPrefColumnCount(1);
        pane.getChildren().addAll(tfMI, new Label("Last Name:"),
                new TextField());

        // kreiranje scene i njeno postavljanje na pozornicu
        Scene scene = new Scene(pane, 200, 250);
        primaryStage.setTitle("ShowFlowPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
