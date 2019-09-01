/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ristinolla;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

/**
 *
 * @author jukka
 */
public class Ristinolla {
    
    public Parent getPeli() {
        BorderPane peli = new BorderPane();

        Label title = new Label("Vuoro: X");
        title.setFont(Font.font("Monospaced", 40));

        GridPane pelilauta = new GridPane();

        pelilauta.setAlignment(Pos.CENTER);
        pelilauta.setVgap(10);
        pelilauta.setHgap(10);
        pelilauta.setPadding(new Insets(10, 10, 10, 10));

        for (int x = 1; x <= 3; x++) {
            for (int y = 1; y <= 3; y++) {
                Button nappi = new Button(" ");
                nappi.setFont(Font.font("Monospaced", 40));
                pelilauta.add(nappi, x, y);

                nappi.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent e) {
                        String s = title.getText();
                        char vuoro = s.charAt(s.length() - 1);
                        if (" ".equals(nappi.getText())) {
                            nappi.setText(String.valueOf(vuoro));
                            
                            vuoro = vuoro == 'X' ? 'O' : 'X';
                            title.setText("Vuoro: " + vuoro);
                            
                        }
                        
                        if (onkoLoppu(pelilauta)) {
                            title.setText("Loppu!");
                        }
                    }
                });
            }
        }
        
        peli.setTop(title);
        peli.setCenter(pelilauta);
        
        return peli;
    }
    
    private boolean onkoLoppu(GridPane lauta) {
        if (onkoTaynna(lauta)
                || onkoPystyyn(lauta)
                || onkoVaakaan(lauta)
                || onkoVinoon(lauta)
           ) {
            return true;
        }
        return false;
    }
    
    private boolean onkoTaynna(GridPane lauta) {
        for ( Node node : lauta.getChildren() ) {
            if ((( Button ) node).getText().equals(" ")) {
                return false;
            }
        }
        return true;
    }
    
    private boolean onkoPystyyn(GridPane lauta) {
        for (int i = 1; i <= 3; i++) {
            char merkki = getMerkki(1, i, lauta);
            if (merkki == ' ') {
                break;
            }
            if (getMerkki(2, i, lauta) == merkki && getMerkki(3, i, lauta) == merkki) {
                return true;
            }
        }

        return false;
    }

    private boolean onkoVaakaan(GridPane lauta) {
        for (int i = 1; i <= 3; i++) {
            char merkki = getMerkki(i, 1, lauta);
            if (merkki == ' ') {
                break;
            }
            if (getMerkki(i, 2, lauta) == merkki && getMerkki(i, 3, lauta) == merkki) {
                return true;
            }
        }

        return false;
    }
    
    private boolean onkoVinoon(GridPane lauta) {
        char merkki = getMerkki(1, 1, lauta);
        if (merkki == ' ') {
            return false;
        }
        if (getMerkki(2, 2, lauta) == merkki && getMerkki(3, 3, lauta) == merkki) {
            return true;
        }

        merkki = getMerkki(1, 3, lauta);
        if (merkki == ' ') {
            return false;
        }
        if (getMerkki(2, 2, lauta) == merkki && getMerkki(3, 1, lauta) == merkki) {
            return true;
        }
        return false;
    }
    
    private char getMerkki(int rivi, int sarake, GridPane lauta) {
        char merkki = ' ';
        for ( Node node : lauta.getChildren() ) {
            if (GridPane.getRowIndex(node) == rivi && GridPane.getColumnIndex(node) == sarake) {
                merkki = (( Button ) node).getText().charAt(0);
                break;
            }
        }

        return merkki;
    }
}
