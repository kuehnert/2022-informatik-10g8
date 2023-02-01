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
        System.out.println("wuerfelQualitaet");
        int WUERFE = 1_000_000;
        
        // Würfeln Sie WUERFE Mal und 
        // 1) Geben Sie die gewürfelten Zahlen aus
        // 2) Zaehlen Sie mit, wie oft jede Zahl gewuerfelt wurde
        Random generator = new Random();
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        int a4 = 0;
        int a5 = 0;
        int a6 = 0;
        int i = 0;

        while (i < WUERFE) {
            int gewuerfelt = generator.nextInt(6) + 1;
            // System.out.println(gewuerfelt);

            if (gewuerfelt == 1) {
                a1 += 1;
            } else if (gewuerfelt == 2) {
                a2 += 1;
            } else if (gewuerfelt == 3) {
                a3 += 1;
            } else if (gewuerfelt == 4) {
                a4 += 1;
            } else if (gewuerfelt == 5) {
                a5 += 1;
            } else {
                a6 += 1;
            }
            
            i = i + 1;
        }    
        
        double p1 = 100.0 * a1 / WUERFE;
        double p2 = 100.0 * a2 / WUERFE;
        double p3 = 100.0 * a3 / WUERFE;
        double p4 = 100.0 * a4 / WUERFE;
        double p5 = 100.0 * a5 / WUERFE;
        double p6 = 100.0 * a6 / WUERFE;
        
        String s1 = String.format("%.2f", p1);
        String s2 = String.format("%.2f", p2);
        String s3 = String.format("%.2f", p3);
        String s4 = String.format("%.2f", p4);
        String s5 = String.format("%.2f", p5);
        String s6 = String.format("%.2f", p6);
        
        System.out.println("1: " + a1 + " (" + s1 + "%)");
        System.out.println("2: " + a2 + " (" + s2 + "%)");
        System.out.println("3: " + a3 + " (" + s3 + "%)");
        System.out.println("4: " + a4 + " (" + s4 + "%)");
        System.out.println("5: " + a5 + " (" + s5 + "%)");
        System.out.println("6: " + a6 + " (" + s6 + "%)");
    }

}
