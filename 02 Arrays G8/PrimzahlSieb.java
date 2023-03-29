import java.util.Arrays;

public class PrimzahlSieb {
    public void sieben() {
        // Deklariere ein Array von Wahrheitswerten
        boolean[] zahlen = new boolean[1001];
        int anzahl = 0;
        
        // Setze alle Werte auf <true>
        for (int i = 2; i < zahlen.length; i = i + 1) {
            zahlen[i] = true;
        }

        for (int zahl = 2; zahl < zahlen.length; zahl = zahl + 1) {
            if (zahlen[zahl] == true) {
                // zahl ist eine Primzahl
                System.out.println(zahl); // Gib sie aus
                anzahl = anzahl + 1;

                // Markiere alle Vielfachen von zahl als <false>
                // Gehe mit einer Schleife von 2*zahl bis zahlen.length
                // in 2er-Schritten durch und markiere alle Stellen
                // als <false>
                for (int i = 2*zahl; i < zahlen.length; i = i + zahl) {
                    zahlen[i] = false;
                }
            }
        }

        // Am Ende: Gib alle Werte aus
        ausgabe(zahlen);
        
        int[] primzahlen = new int[anzahl];
        // Schleife die durch zahlen geht und immer, wenn 
        // ein Wert true ist, wird der aktuelle Index 
        // in primzahlen eingespeichert;
        System.out.println( Arrays.toString(primzahlen) );
    }

    public void ausgabe(boolean[] a) {
        for (int i = 1; i < a.length; i = i + 1) {
            if (a[i] == true) {
                System.out.printf(" %5d", i);
            } else {
                System.out.printf(" %5s", "-");
            }

            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}
