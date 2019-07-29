package maatila;


public class Main {

    public static void main(String[] args) {
        // Testaa täällä ohjelmaasi
        Lehma lehma = new Lehma();
System.out.println(lehma);

Eleleva elelevaLehma = lehma;
elelevaLehma.eleleTunti();
elelevaLehma.eleleTunti();
elelevaLehma.eleleTunti();
elelevaLehma.eleleTunti();

System.out.println(lehma);

Lypsava lypsavaLehma = lehma;
lypsavaLehma.lypsa();

System.out.println(lehma);
System.out.println("");

lehma = new Lehma("Ammu");
System.out.println(lehma);
lehma.eleleTunti();
lehma.eleleTunti();
System.out.println(lehma);
lehma.lypsa();
System.out.println(lehma);
    }
}
