package ristinolla;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RistinollaSovellus extends Application {


    public static void main(String[] args) {
        launch(RistinollaSovellus.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Ristinolla peli = new Ristinolla();
        Scene nakyma = new Scene(peli.getPeli());
        
        stage.setTitle("RistiNolla");
        stage.setScene(nakyma);
        
        stage.show();
    }

}
