import java.util.Random;

public class Zufall {
    Random wuerfel;

    public Zufall() {
        wuerfel = new Random();
    }

    public void zufallszahlen() {
        // 0 <= z < 10
        int z = wuerfel.nextInt(10);
        System.out.println(z);

        // 1..6
        int w06 = wuerfel.nextInt(6); // 0..5
        int w6 = wuerfel.nextInt(6) + 1; // 1..6
        System.out.println(w6);
    }

    public void jens() {
        int i = 0;
        int neg = 0; 

        while (i < 100_000) {
            int zuffi = wuerfel.nextInt();

            if (zuffi < 0) {
                neg = neg + 1;
            }

            i = i + 1;
        }

        System.out.println("Von " + i + " Zahlen sind " + neg + " negativ");
        double anteil = 100.0 * neg / i; // 1 / 3
        System.out.println("Prozent: " + anteil);
    }

    // Programmieren Sie folgende Würfel:
    public void wuerfeln() {
        // -) ein 20-seitiger Würfel (0-19)
        int r1 = wuerfel.nextInt(20);

        // a) ein 20-seitiger Würfel (1-20)
        int r2 = wuerfel.nextInt(20) + 1;

        // b) ein Würfel von -10 bis +10 (einschliesslich)
        // Wieviele unterschiedliche Werte sind das?
        int r3 = wuerfel.nextInt(21) - 10;

        // c) ein Würfel von -10 bis +20 (einschliesslich)
        int r4 = wuerfel.nextInt(31) - 10;

        // d) zwei Sechseitige Würfel (2-12) Vorsicht!
        int r5 = wuerfel.nextInt(6) + wuerfel.nextInt(6) + 2;

        // e) drei sechsseitige Würfel (3-18) Vorsicht!
    }

    // HA: 
    // 1. Fertig machen
    // 2. Anzahlen als Prozente ausgeben
    public void wuerfelQualitaet() {
        // Würfeln Sie 102 Mal und 
        // 1) Geben Sie die gewürfelten Zahlen aus
        // 2) Zaehlen Sie mit, wie oft jede Zahl gewuerfelt wurde
        Random generator = new Random();
        int einsen = 0;
        int i = 0;

        while (i < 102) {
            int gewuerfelt = generator.nextInt(6) + 1;
            System.out.println(gewuerfelt);

            if (gewuerfelt == 1) {
                einsen = einsen + 1;
            }
            
            i = i + 1;
        }    
        
        System.out.println("Einsen: " + einsen);
    }

}
