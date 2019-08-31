package otsikko;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
 
/**
 *
 * @author jukka
 */
public class KayttajanOtsikko extends Application {
    
    @Override
    public void start(Stage stage) {
        Parameters params = getParameters();
        String title = params.getNamed().get("otsikko");
        
        stage.setTitle(title);
        
        BorderPane layout = new BorderPane();
        
        stage.setScene(new Scene(layout, 300, 250));
        stage.show();
    }
}
