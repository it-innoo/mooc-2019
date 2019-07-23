

public class Main {

    public static void main(String[] args) {
        // Testaa ohjelmaasi täällä
YhdenTavaranLaatikko laatikko = new YhdenTavaranLaatikko();
laatikko.lisaa(new Tavara("Saludo", 5));
laatikko.lisaa(new Tavara("Pirkka", 5));

System.out.println(laatikko.onkoLaatikossa(new Tavara("Saludo")));
System.out.println(laatikko.onkoLaatikossa(new Tavara("Pirkka")));    }
}
