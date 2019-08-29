package nappijatekstielementti;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class NappiJaTekstielementtiSovellus extends Application {


    public static void main(String[] args) {
        launch(NappiJaTekstielementtiSovellus.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Sovellukseni");
        
        Button nappikomponentti = new Button("Tämä on nappi");

        Label tekstikomponentti = new Label("Tekstielementti");

        FlowPane komponenttiryhma = new FlowPane();
        
        komponenttiryhma.getChildren().add(nappikomponentti);
        komponenttiryhma.getChildren().add(tekstikomponentti);

        Scene nakyma = new Scene(komponenttiryhma);

        stage.setScene(nakyma);
        stage.show();
    }

}
