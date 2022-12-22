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
    
    public void ratenUmgekehrt() {
        int unten = 1;
        int oben = 1000;
        int eingabe;
        int versuche = 0;
        
        System.out.println("\n\nWillkommen beim Zahlenraten");
        System.out.println("Denk Dir eine Zahl zwischen "
            + unten + " und " + oben + ".");
        
        // Rate solange, wie Du die Zahl noch nicht geraten hast
        do {
            int mitte = (oben + unten) / 2;
            System.out.print(mitte + "? (1=richtig, "
                + "2=Deine Zahl ist kleiner, " 
                + "3=groesser): ");
            eingabe = tastatur.nextInt();
            versuche = versuche + 1;
            
            if (eingabe == 2) {
                // Benutzerzahl ist kleiner
                // Setze obere Grenze auf mitte - 1
                // da mitte nicht richtig sein kann
                oben = mitte - 1;
            } else if (eingabe == 3) {
                unten = mitte + 1;
            }
        } while (eingabe != 1);
        // Benutzer hat die Zahl geraten
                
        System.out.println("Hurra! Ich bin so schlau");
        System.out.println(versuche + " Versuche habe ich gebraucht");
    }
    
    
    
    
    
    
    
    
}
