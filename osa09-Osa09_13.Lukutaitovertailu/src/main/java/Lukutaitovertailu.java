
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lukutaitovertailu {
    
    public static void main(String[] args) {
        List<Tulos> tulokset = new ArrayList<>();
        
        try {
            Files
                .lines(Paths.get("lukutaito.csv"))
                .map(osat -> osat.split(","))
                .map(osat -> new Tulos(
                    osat[3].trim(),
                    osat[2].replace("(%)", "").trim(),
                    Integer.valueOf(osat[4]),
                    Double.valueOf(osat[5])))
                .forEach(tulos -> tulokset.add(tulos));
        } catch (IOException e) {
            System.out.println("Virhe: " + e.getMessage());
        }
        
        tulokset.stream()
                .sorted((t1, t2) -> {
                    if (t1.getLukutaitoprosentti() > t2.getLukutaitoprosentti()) {
                        return 1;
                    }
                    if (t1.getLukutaitoprosentti() < t2.getLukutaitoprosentti()) {
                        return -1;
                    }
                    return 0;
                })
                .forEach(t -> System.out.println(t));
    }
}
