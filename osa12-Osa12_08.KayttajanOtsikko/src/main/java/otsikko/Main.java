package otsikko;

import java.util.Scanner;
import javafx.application.Application;

public class Main {

    public static void main(String[] args) {
        System.out.print("Sovelluksen otsikko? ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println("You entered string "+s);
        Application.launch(KayttajanOtsikko.class, "--otsikko="+s);
    }

}
