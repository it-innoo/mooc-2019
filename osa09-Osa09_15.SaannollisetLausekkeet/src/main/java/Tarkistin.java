

public class Tarkistin {

    public boolean onViikonpaiva(String merkkijono) {
        return merkkijono.matches("ma|ti|ke|to|pe|la|su");
    }
    
    public boolean kaikkiVokaaleja(String merkkijono) {
        return merkkijono.matches("[aeiouyäö]+");
    }
    
    public boolean kellonaika(String merkkijono) {
        return merkkijono.matches("([00|01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]");
    }
}
