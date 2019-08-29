package borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class BorderPaneSovellus extends Application  {


    public static void main(String[] args) {
        launch(BorderPaneSovellus.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane asettelu = new BorderPane();
        asettelu.setTop(new Label("NORTH"));
        asettelu.setRight(new Label("EAST"));
        asettelu.setBottom(new Label("SOUTH"));

        Scene nakyma = new Scene(asettelu);

        stage.setScene(nakyma);
        stage.show();
    }

}
