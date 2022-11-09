import java.util.Scanner;

public class Schleifen {
    public static void weltbevoelkerung() {
        int jahr = 2021;
        double wbv = 7.837;

        // Wachstumsrate von 0,9% 
        double faktor = 1.009;
        // double faktor = 1.0 + 2.0 / 100.0; // 2% Wachstum als Faktor
        System.out.printf("Weltbevoelkerung im Jahr %d: %.2f%n", jahr, wbv);

        while (jahr <= 2101) {
            wbv = wbv * faktor;
            jahr = jahr + 1;
            System.out.printf("Weltbevoelkerung im Jahr %d: %.2f Mrd.%n", jahr, wbv);
        }
    }

    // Aufgaben
    // 1. Zählen von 1 bis 20: 1, 2, 3, ... 20
    public static void aufgabe1() {
        int zahl; // Deklaration
        zahl = 0; // Initialisierung

        while (zahl < 20) {
            zahl = zahl + 1;
            System.out.println(zahl);
        }
    }

    // 2. Zählen von 2 bis 20 in 2er-Schritten: 2, 4, 6, ... 20
    public static void aufgabe2() {
        int zahl; // Deklaration
        zahl = 2; // Initialisierung

        while (zahl <= 20) {
            System.out.println(zahl);
            zahl = zahl + 2;
        }
    }

    // 3. Rückwärts zählen von 10 bis 1: 10, 9, 8, ... 1, Ich komme!
    public static void aufgabe3() {
        int zahl; // Deklaration
        zahl = 11; // Initialisierung

        while (zahl > 1) {
            zahl = zahl - 1;
            System.out.println(zahl);
        }
    }

    // Bonus-4-Aufgabe
    // Sie starten mit einer Zahl zwischen 1 und 100
    // Wenn die Zahl gerade ist, teile sie durch 2
    // Ist sie ungerade, multipliziere sie mit 3 und addiere 1
    // Mache das so lange, bis die Variable den Wert 1 hat
    // - Lies die Zahl vom Benutzer ein
    // - Gib aus, wie viele Schritte dafür notwendig sind
    // - Mache das für alle Zahlen von 1 bis 100
    public static void aufgabe4Eingabe() {
        Scanner tastatur = new Scanner(System.in);
        System.out.println("Zahl zw. 1 und 100: ");
        int benutzerzahl = tastatur.nextInt();
        
        aufgabe4(benutzerzahl);
    }
    
    public static void aufgabe4Alle() {
        // HA: while () {...}
        aufgabe4(1);
        aufgabe4(2);
        aufgabe4(3);
        aufgabe4(4);
        aufgabe4(5);
        // ...
        aufgabe4(100);
    }
    
    public static void aufgabe4(int zahl) {
        System.out.print("Zahl: " + zahl);

        while (zahl > 1) {
            if (zahl / 2 * 2 == zahl) { // gerade
                zahl = zahl / 2;
            } else { // ungerade
                zahl = zahl * 3 + 1;
            }

            System.out.print(zahl + ", ");
        }
        
        System.out.println();
    }
}
