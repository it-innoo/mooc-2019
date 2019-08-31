package sovellus;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class VitsiSovellus extends Application {


    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // 1. Luodaan päätason asettelu
        BorderPane asettelu = new BorderPane();

        // 1.1. Luodaan päätason asettelun valikko
        HBox valikko = new HBox();
        valikko.setPadding(new Insets(20, 20, 20, 20));
        valikko.setSpacing(10);

        // 1.2. Luodaan valikon napit
        Button vitsi = new Button("Vitsi");
        Button vastaus = new Button("Vastaus");
        Button selitys = new Button("Selitys");

        // 1.3. Lisätään napit valikkoon
        valikko.getChildren().addAll(vitsi, vastaus, selitys);
        asettelu.setTop(valikko);


        // 2. Luodaan alinäkymät ja kytketään ne valikon nappeihin
        // 2.1. Luodaan alinäkymät -- tässä asettelut
        StackPane vitsiAsettelu = luoNakyma("What do you call a bear with no teeth?");
        StackPane vastausAsettelu = luoNakyma("A gummy bear.");
        StackPane selitysAsettelu = luoNakyma("?????");
        
        // 2.2. Liitetään alinäkymät nappeihin. Napin painaminen vaihtaa alinäkymää.
        vitsi.setOnAction((event) -> asettelu.setCenter(vitsiAsettelu));
        vastaus.setOnAction((event) -> asettelu.setCenter(vastausAsettelu));
        selitys.setOnAction((event) -> asettelu.setCenter(selitysAsettelu));

        // 2.3. Näytetään aluksi vitsi
        asettelu.setCenter(vitsiAsettelu);


        // 3. Luodaan päänäkymä ja asetetaan päätason asettelu siihen
        Scene nakyma = new Scene(asettelu);


        // 4. Näytetään sovellus
        stage.setScene(nakyma);
        stage.show();
    }
    
    private StackPane luoNakyma(String teksti) {

        StackPane asettelu = new StackPane();
        asettelu.setPrefSize(300, 180);
        asettelu.getChildren().add(new Label(teksti));
        asettelu.setAlignment(Pos.CENTER);

        return asettelu;
    }
}
