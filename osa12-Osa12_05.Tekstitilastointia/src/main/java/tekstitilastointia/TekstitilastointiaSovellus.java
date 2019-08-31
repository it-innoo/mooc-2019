package tekstitilastointia;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TekstitilastointiaSovellus extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Tekstitilastointia");
        
        BorderPane asettelu = new BorderPane();

        HBox tekstit = new HBox();
        tekstit.setSpacing(10);
        tekstit.getChildren().add(new Label("Kirjaimia: 0"));
        tekstit.getChildren().add(new Label("Sanoja: 0"));
        tekstit.getChildren().add(new Label("Pisin sana on:"));

        asettelu.setCenter(new TextArea());
        asettelu.setBottom(tekstit);
        
        stage.setScene(new Scene(asettelu));
        stage.show();
    }

}
