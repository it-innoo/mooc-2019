
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class KirjatTiedostosta {
    
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // testaa metodia täällä

    }

    public static List<Kirja> lueKirjat(String tiedosto) {
        
        try {
            // return Files.lines(Paths.get(tiedosto)).collect(Collectors.toList());
            return Files.lines(Paths.get(tiedosto))
                    .map(rivi -> rivi.split(","))
                    .filter(palat -> palat.length >= 4)
                    .map(palat -> new Kirja(
                                    palat[0],
                                    Integer.valueOf(palat[1]),
                                    Integer.valueOf(palat[2]),
                                    palat[3]))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            System.out.println("Virhe: " + e.getMessage());
        }
        
        return new ArrayList<>();
    }
}
