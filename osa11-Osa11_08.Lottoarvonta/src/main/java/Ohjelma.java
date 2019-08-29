
import java.util.ArrayList;

public class Ohjelma {

    public static void main(String[] args) {
        Lottorivi rivi = new Lottorivi();
        ArrayList<Integer> lottonumerot = rivi.numerot();

        System.out.println("Lottonumerot:");
        lottonumerot.forEach((numero) -> {
            System.out.print(numero + " ");
        });
        System.out.println("");
    }
}
