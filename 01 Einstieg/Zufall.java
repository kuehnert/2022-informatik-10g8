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
        // a) ein 20-seitiger Würfel (1-20)
        
        
        // b) ein Würfel von -10 bis +10 (einschliesslich)
        // c) ein Würfel von -10 bis +20 (einschliesslich)
        // d) zwei Sechseitige Würfel (2-12) Vorsicht!
        // e) drei sechsseitige Würfel (3-18) Vorsicht!
    }
    
    
    
    
    
    
    
    
    
    
}
