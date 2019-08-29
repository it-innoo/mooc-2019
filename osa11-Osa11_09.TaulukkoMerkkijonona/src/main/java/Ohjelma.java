
public class Ohjelma {

    public static void main(String[] args) {
        // Testaa metodiasi täällä
        int rivit = 2;
        int sarakkeet = 3;
        int[][] matriisi = new int[rivit][sarakkeet];
        matriisi[0][1] = 5;
        matriisi[1][0] = 3;
        matriisi[1][2] = 7;
        System.out.println(taulukkoMerkkijonona(matriisi));

        int[][] toinenMatriisi = {
            {3, 2, 7, 6},
            {2, 4, 1, 0},
            {3, 2, 1, 0}
        };

        System.out.println(taulukkoMerkkijonona(toinenMatriisi));
    }

    public static String taulukkoMerkkijonona(int[][] taulukko) {
        StringBuilder sb = new StringBuilder();
        
        for (int rivi = 0; rivi < taulukko.length; rivi++) {
            sb.append("\n");
            for (int sarake = 0; sarake < taulukko[rivi].length; sarake++) {
                sb.append(taulukko[rivi][sarake]);
            }
        }
        
        return sb.toString();
    }
}
