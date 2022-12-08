import java.util.Random;
import java.util.Scanner;

public class Zahlenraten {
    Random generator;
    Scanner tastatur;
    
    public Zahlenraten() {
        generator  = new Random();
        tastatur = new Scanner(System.in);
    }
    
    public void ratenG8() {
        int zufallszahl = generator.nextInt(100) + 1;
        
        System.out.print("Rate meine Zahl: ");
        int geraten = tastatur.nextInt();
        
        if (zufallszahl < geraten) {
            System.out.print("Meine Zahl ist kleiner!");
        }
    }
}
