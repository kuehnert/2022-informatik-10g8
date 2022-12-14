import java.util.Random;
import java.util.Scanner;

public class Zahlenraten {
    Random generator;
    Scanner tastatur;

    public Zahlenraten() {
        generator  = new Random();
        tastatur = new Scanner(System.in);
    }

    // Hausis:
    // 1. Anzahl der Versuche mitzaehlen und Kommentieren
    // 2. Man soll wiederholt spielen können
    public void ratenG8() {
        int zufallszahl = generator.nextInt(100) + 1;
        int geraten = 1;
        
        while (zufallszahl != geraten) {
            System.out.print("Rate meine Zahl: ");
            geraten = tastatur.nextInt();

            if (zufallszahl < geraten) {
                System.out.print("Meine Zahl ist kleiner! ");
            } else if (zufallszahl > geraten) {
                System.out.print("Meine Zahl ist groesser! ");
            } else if (zufallszahl == geraten) {
                System.out.println("Hurra, Du hast sie geraten! ");
            }
        }
    }
}
