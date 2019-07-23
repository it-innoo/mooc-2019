

public class Main {

    public static void main(String[] args) {
        // kirjoita tänne testikoodia
        MuistavaTuotevarasto mtv = new MuistavaTuotevarasto("kahvi",10,5);
        mtv.lisaaVarastoon(5);
        
        mtv.lisaaVarastoon(5);
        mtv.otaVarastosta(7);
        System.out.println(mtv.historia());

    }

}
