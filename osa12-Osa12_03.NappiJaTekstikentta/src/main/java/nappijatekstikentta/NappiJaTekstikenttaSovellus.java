package nappijatekstikentta;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class NappiJaTekstikenttaSovellus extends Application {


    public static void main(String[] args) {
        launch(NappiJaTekstikenttaSovellus.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Sovellukseni");
        
        Button nappikomponentti = new Button("Tämä on nappi");

        TextField tekstikomponentti = new TextField("Tekstikenttä");

        FlowPane komponenttiryhma = new FlowPane();
        
        komponenttiryhma.getChildren().add(nappikomponentti);
        komponenttiryhma.getChildren().add(tekstikomponentti);

        Scene nakyma = new Scene(komponenttiryhma);

        stage.setScene(nakyma);
        stage.show();
    }

}
