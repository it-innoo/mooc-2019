
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TiettyjenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // toteuta ohjelmasi tänne

        List<Integer> luvut = new ArrayList<>();
        System.out.println("Kirjoita syötteitä, \"loppu\" lopettaa.");

        while (true) {
            String rivi = lukija.nextLine();

            if ("loppu".equals(rivi)) {
                break;
            }
            luvut.add(Integer.valueOf(rivi));
        }
        
        System.out.println("Tulostetaanko negatiivisten vai positiivisten lukujen keskiarvo? (n/p)");
        String rivi = lukija.nextLine();
        if (rivi.startsWith("n")) {
            double keskiarvo = luvut.stream()
                .filter(i -> (i < 0))
                 .mapToInt(i -> i)
                .average()
                .getAsDouble();

             System.out.println("Lukujen keskiarvo: " + keskiarvo);
        } else {
            double keskiarvo = luvut.stream()
                .filter(i -> (i > 0))
                 .mapToInt(i -> i)
                .average()
                .getAsDouble();

             System.out.println("Lukujen keskiarvo: " + keskiarvo);
        }
    }
}
