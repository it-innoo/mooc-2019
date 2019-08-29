
public class Ohjelma {

    public static void main(String[] args) {
        // Testaa Taikanelio-luokkaasi täällä

        Taikanelio tn = new Taikanelio(3);
        System.out.println(tn.rivienSummat());
        
        Taikaneliotehdas tt = new Taikaneliotehdas();
        System.out.println(tt.luoTaikanelio(5));
        
    }
}
