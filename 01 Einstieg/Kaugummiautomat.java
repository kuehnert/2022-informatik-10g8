import java.util.Scanner;

public class Kaugummiautomat {
    private Scanner tastatur;
    private int kaugummies;
    private int schoki;
    private int geld;

    public Kaugummiautomat() {
        tastatur = new Scanner(System.in);
        kaugummies = 10;
        schoki = 5;
        geld = 0;
    }

    public void kaufen() {
        System.out.println("Kau oder Schoki? ");
        String eingabe = tastatur.nextLine();
        // == funktioniert nicht bei Strings
        if (eingabe == "Kau") {
            System.out.println("Hier ist eine Million Euro!");
        } else if (eingabe.equals("Kau")) {
            if (kaugummies > 0) {
                System.out.println("Hier ein Kau ");
                kaugummies -= 1;
                geld += 1;
            } else {
                System.out.println("Kau sind aus");
            }
        } else if (eingabe.equals("Schoki")) {
            // das gleiche in grün
            System.out.println("Hier ein Schocki.");
        } else {
            System.out.println("Kennschnisch.");
        }
    }

    public void status() {
        System.out.println("Im Automaten gibt es:");
        System.out.println(kaugummies + " x Kaugummis");
        System.out.println(schoki + " x Schoki");
        System.out.println(geld + " Euro");
    }
}
