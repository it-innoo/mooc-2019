package tekstitilastointia;

import java.util.Arrays;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TekstitilastointiaSovellus extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Tekstitilastointia");
        
        BorderPane asettelu = new BorderPane();
        
        TextArea editor = new TextArea("");
        
        Label chars = new Label("Kirjaimia: 0");
        Label words = new Label("Sanoja: 0");
        Label longs = new Label("Pisin sana on:");

        HBox tekstit = new HBox();
        tekstit.setSpacing(10);
        tekstit.getChildren().add(chars);
        tekstit.getChildren().add(words);
        tekstit.getChildren().add(longs);

        asettelu.setCenter(editor);
        asettelu.setBottom(tekstit);
        
        editor.textProperty().addListener((muutos, vanhaArvo, uusiArvo) -> {
            int merkkeja = uusiArvo.length();
            String[] palat = uusiArvo.split(" ");
            int sanoja = palat.length;
            String pisin = Arrays.stream(palat)
                .sorted((s1, s2) -> s2.length() - s1.length())
                .findFirst()
                .get();

            chars.setText("Kirjaimia: " + merkkeja);
            words.setText("Sanoja: " + sanoja);
            longs.setText("Pisin sana on: " + pisin);
        });
        
        stage.setScene(new Scene(asettelu));
        stage.show();
    }

}
