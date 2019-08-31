package sovellus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UseampiNakyma extends Application {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane ekaRuutu = new BorderPane();
        Button ekaNappi = new Button("Tokaan näkymään!");
        ekaRuutu.setTop(new Label("Eka näkymä!"));
        ekaRuutu.setCenter(ekaNappi);

        VBox tokaRuutu = new VBox();
        tokaRuutu.setSpacing(20);
        Button tokaNappi = new Button("Kolmanteen näkymään!");
        tokaRuutu.getChildren().add(tokaNappi);
        tokaRuutu.getChildren().add(new Label("Toka näkymä!"));

        GridPane kolmasRuutu = new GridPane();
        Button kolmasNappi = new Button("Ekaan näkymään!");
        kolmasRuutu.add(new Label("Kolmas näkymä"), 0, 0);
        kolmasRuutu.add(kolmasNappi, 1, 1);

        Scene ekaNakyma = new Scene(ekaRuutu);
        Scene tokaNakyma = new Scene(tokaRuutu);
        Scene kolmasNakyma = new Scene(kolmasRuutu);

        ekaNappi.setOnAction((event) -> {
            stage.setScene(tokaNakyma);
        });

        tokaNappi.setOnAction((event) -> {
            stage.setScene(kolmasNakyma);
        });

        kolmasNappi.setOnAction((event) -> {
            stage.setScene(ekaNakyma);
        });

        stage.setTitle("Useampi Näkymä");
        stage.setScene(ekaNakyma);
        stage.show();
    }
 
}
