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
        System.out.println("Kau (1) oder Schoki (2)? ");
        String eingabe = tastatur.nextLine();
        if (eingabe == "Kau") {
            if (kaugummies > 0) {
                System.out.println("Hier ein Kau ");
                kaugummies -= 1;
                geld += 1;
            } else {
                System.out.println("Kau sind aus");
            }
        } else {
            // das gleiche in grün
        }
    }
}
