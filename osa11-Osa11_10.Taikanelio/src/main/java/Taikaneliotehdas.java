
import java.util.ArrayList;
import java.util.List;


public class Taikaneliotehdas {

    public Taikanelio luoTaikanelio(int koko) {

        Taikanelio nelio = new Taikanelio(koko);

        if (koko % 2 == 0) {
            taytaNelio(nelio, koko);
            return nelio;
        }

        // toteuta taikaneliön luominen Siamese method -algoritmilla tänne
        taytaTaikaNelio(nelio, koko);
        return nelio;
    }

    private List<Integer> luoNumerot(int maksimi) {
        ArrayList<Integer> numerot = new ArrayList<>();
        for (int i = 1; i <= maksimi; i++) {
            numerot.add(i);
        }

        return numerot;
    }

    private void taytaNelio(Taikanelio nelio, int koko) {
        List<Integer> numerot = luoNumerot(koko * koko);

        int indeksi = 0;
        for (int i = 0; i < nelio.getLeveys(); i++) {
            for (int j = 0; j < nelio.getKorkeus(); j++) {
                nelio.asetaArvo(j, i, numerot.get(indeksi++));
            }
        }
    }

    private void taytaTaikaNelio(Taikanelio nelio, int koko) {
        List<Integer> numerot = luoNumerot(koko * koko);

        int rivi = 0;
        int sarake = koko / 2;

        for (Integer numero : numerot) {
            nelio.asetaArvo(rivi--, sarake++, numero);

            if (numero % koko == 0) {
                rivi += 2; 
                --sarake;
            } else {
                if (sarake == koko) {
                    sarake -= koko;
                } else if (rivi < 0) {
                    rivi += koko;
                }
            }
        }
    }
}
