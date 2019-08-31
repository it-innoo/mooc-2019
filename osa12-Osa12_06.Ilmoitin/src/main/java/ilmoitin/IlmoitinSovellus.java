package ilmoitin;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class IlmoitinSovellus extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox asettelu = new VBox();
        
        TextField editor = new TextField();
        Label kopio = new Label();
        Button nappi = new Button("Päivitä");

        nappi.setOnAction((ActionEvent event) -> {
            kopio.setText(editor.getText());
        });
        
        asettelu
            .getChildren()
            .addAll(editor, nappi, kopio);
        
        stage.setScene(new Scene(asettelu));
        stage.show();
    }

}
