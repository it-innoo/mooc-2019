
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // voit testata luokkaasi täällä

        Pari<String, Integer> pari = new Pari<>("yksi", 1);
        System.out.println(pari.getAvain() + " -> " + pari.getArvo());
    }

}
