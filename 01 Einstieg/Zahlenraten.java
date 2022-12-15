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
        int weiter; // 1 bedeutet "weiterspielen"

        // Aeussere Schleife zaehlt Partien
        do {
            int zufallszahl = generator.nextInt(100) + 1;
            int geraten;
            int versuche = 0;

            // Innere Schleife laeuft bis Zahl geraten wurde
            do {
                System.out.print("Rate meine Zahl: ");
                geraten = tastatur.nextInt();
                versuche = versuche + 1;

                if (zufallszahl < geraten) {
                    System.out.print("Meine Zahl ist kleiner! ");
                } else if (zufallszahl > geraten) {
                    System.out.print("Meine Zahl ist groesser! ");
                } else if (zufallszahl == geraten) {
                    System.out.println("Hurra, Du hast sie geraten! ");
                }
            } while (zufallszahl != geraten);

            System.out.printf("Du hast %d geraten. ", versuche);
            if (versuche <= 5) {
                System.out.println("sehr gut (1)");
            } else if (versuche <= 7) {
                System.out.println("gut (2)");
            } else {
                System.out.println("ausreichend (4)");
            }

            System.out.print("Noch einmal spielen (1=ja)? ");
            weiter = tastatur.nextInt();
        } while (weiter == 1);
    }
}
