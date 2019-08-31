package sovellus;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TervehtijaSovellus extends Application  {


    public static void main(String[] args) {
        System.out.println("Hellow world!");
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Label ohjeteksti = new Label("Kirjoita nimesi ja aloita.");
        TextField nimiKentta = new TextField();
        Button aloitusNappi = new Button("Aloita");

        GridPane asettelu = new GridPane();

        asettelu.add(ohjeteksti, 0, 0);
        asettelu.add(nimiKentta, 0, 1);
        asettelu.add(aloitusNappi, 0, 2);

        asettelu.setPrefSize(300, 180);
        asettelu.setAlignment(Pos.CENTER);
        asettelu.setVgap(10);
        asettelu.setHgap(10);
        asettelu.setPadding(new Insets(20, 20, 20, 20));

        Label tervetuloaTeksti = new Label("Tervetuloa");
        
        StackPane tervetuloaAsettelu = new StackPane();
        tervetuloaAsettelu.setPrefSize(300, 180);
        tervetuloaAsettelu.setAlignment(Pos.CENTER);
        tervetuloaAsettelu.getChildren().add(tervetuloaTeksti);

        Scene aloitusNakyma = new Scene(asettelu);
        Scene tervetuloaNakyma = new Scene(tervetuloaAsettelu);

        aloitusNappi.setOnAction((event) -> {
            tervetuloaTeksti.setText("Tervetuloa " + nimiKentta.getText() + "!");
            stage.setScene(tervetuloaNakyma);
        });

        stage.setScene(aloitusNakyma);
        stage.show();
    }
}
