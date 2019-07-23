
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RajatutLuvut {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        List<Integer> luetut = new ArrayList<>();

        while (true) {            
            Integer luettu = Integer.valueOf(lukija.nextLine());

            if (0 < luettu) {
            } else {
                break;
            }
            luetut.add(luettu);
        }

        luetut
            .stream()
            .filter(i -> i > 0 && i <= 5)
            .forEach(System.out::println);
    }
}
