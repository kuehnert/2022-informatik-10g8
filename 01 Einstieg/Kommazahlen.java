import java.util.Scanner;

public class Kommazahlen {
    public static void deklaration() {
        // 1. Deklaration (in Mathe: Definition)
        // Wir benötigen eine Variable vom Typ
        // <Datentyp>, welche die Bezeichnung <Variablenname>
        // "Bekanntmachung"
        // Format: <Datentyp> <Variablenname>;
        // Beispiele: 
        //     int ganzzahl;
        //     String freundin;
        double kommazahl;

        // 2. Initialisierung = Erstzuweisung
        // Eine Variable bekommt ihren Ursprungswert 
        // zugewiesen. Notwendig!
        // Format: <Variablenname> = <Ausdruck> 
        kommazahl = 1.0 / 3.0 * 2 * 3.0 * 0.333333333333 * 3.0;

        // 3. Ausgabe
        System.out.println(kommazahl); // Unschön
        System.out.printf("%f   %n", kommazahl); 
        System.out.printf("%.5f %n", kommazahl); 
        System.out.printf("%.2f %n", kommazahl); 
    }

    public static void eingeben() {
        // Import nicht vergessen!
        Scanner s = new Scanner(System.in);

        System.out.print("Gib eine Kommazahl ein: ");
        String eingabe = s.nextLine();
        double zahl = Double.parseDouble(eingabe);
        System.out.printf("%.5f %n", zahl); 
    }

    public static void rechnen() {
        // 1. Lies zwei Kommazahlen ein
        // 2. Gib vier Ergebnisse aus:
        //    - Addiere sie
        //    - Subtrahiere sie
        //    - Multiplizierte sie
        //    - Dividiere sie
    }

    public static void ausgeben() {
        double kommazahl = 2.3;
        kommazahl = 1.0 / 14.0 * kommazahl * 2.5 * 7.0;
        // 3. Ausgabe
        System.out.println(kommazahl);
        // 2.8749999999999996 ==> 2.875
        System.out.printf("0 Kommastellen: %.0f %n", kommazahl);
        System.out.printf("1 Kommastelle:  %.1f %n", kommazahl);
        System.out.printf("2 Kommastellen: %.2f %n", kommazahl);
        System.out.printf("3 Kommastellen: %.3f %n", kommazahl);
        System.out.printf("4 Kommastellen: %.4f %n", kommazahl);
        System.out.printf("5 Kommastellen: %.5f %n", kommazahl);
    }

    public static void rechne() {
        Scanner tastatur;
        tastatur = new Scanner(System.in);

        // 1. Lies eine Zahl ein und speichere sie in zahl1
        System.out.print("Gib eine Zahl ein: ");
        double zahl1 = tastatur.nextDouble();

        // 2. Lies eine 2. Zahl ein und speichere sie in zahl2
        System.out.print("Gib eine 2. Zahl ein: ");
        double zahl2 = tastatur.nextDouble();

        // 3. Addiere beide und speichere es in <summe>
        //    Multipl. beide und speichere es in <produkt>
        //    Subtrh. beide und speichere es in <differenz>
        //    Dividiere beide und speichere es in <quotient>
        double summe = zahl1 + zahl2;
        System.out.printf("%.2f + %.2f = %.2f %n", zahl1, zahl2, summe);
    }   

    public static void annaeherung() {
        int nenner = 1;
        int vorzeichen = 1;
        double summe = 0;
        
        while (nenner <= 1197) {
            summe = summe + 4.0 * vorzeichen / nenner;
            System.out.println(summe);
            
            vorzeichen = -vorzeichen;
            nenner = nenner + 2;
        }
    }
}
