import java.util.Random;

public class ArrayGeneratoren {
    public int[] zahlenreihe(int anzahl, int basis) {
        int[] zahlen; // Deklaration
        zahlen = new int[anzahl]; // Initialisierung

        // {6, 12, 18, 24, 30, 36, 42, 48 };
        for (int i = 0; i < anzahl; i = i + 1) {
            zahlen[i] = basis * (i + 1);
        }

        return zahlen;
    }

    /*
     * 1. Erstelle ein Array mit <anzahl> Quadratzahlen
     */
    public int[] reiheQuadratzahlen(int anzahl) {
        int[] zahlen; // Deklaration
        zahlen = new int[anzahl]; // Initialisierung

        for (int i = 0; i < anzahl; i = i + 1) {
            zahlen[i] = anzahl * anzahl;
        }

        return zahlen;
    }

    /*
     * 2. Erstelle ein Array mit <anzahl> 2er-Potenzen
     *    1, 2, 4, 8, 16, 32, 
     */
    public int[] reihePotenzen1(int anzahl) {
        int[] zahlen; // Deklaration
        zahlen = new int[anzahl]; // Initialisierung
        int wert = 1;

        for (int i = 0; i < anzahl; i = i + 1) {
            zahlen[i] = wert;
            wert = wert * 2;
        }

        return zahlen;
    }

    public int[] reihePotenzen2(int anzahl) {
        int[] zahlen; // Deklaration
        zahlen = new int[anzahl]; // Initialisierung
        zahlen[0] = 1;

        for (int i = 1; i < anzahl; i = i + 1) {
            zahlen[i] = 2 * zahlen[i - 1];
        }

        return zahlen;
    }

    public int[] reihePotenzen3(int anzahl) {
        Formelsammlung fs = new Formelsammlung();
        int[] zahlen; // Deklaration
        zahlen = new int[anzahl]; // Initialisierung

        for (int i = 1; i < anzahl; i = i + 1) {
            zahlen[i] = fs.zweierPotenz(i);
        }

        return zahlen;
    }

    /**
     * Erzeuge ein Array mit 100 Zufallszahlen zwischen 0 und 2000
     * und gibt das Array zurück
     */
    public int[] zufallszahlen(int anzahl, int maxWert) {
        // 0. Erstelle einen Zufallszahlengenerator
        Random generator = new Random();

        // 1. Erzeuge ein neues int-Array mit Größe 100
        int[] array = new int[anzahl];

        // 2. Gehe von 0 bis 99 durch das Array und speichere
        //    an jeder Stelle ein zuf. Zahl von 0 bis 1999
        for (int i = 0; i < array.length; i = i + 1) {
            array[i] = generator.nextInt(maxWert);
        }

        // 3. Gib das Array zurück
        return array;
    }

    /**
     * Erzeugt ein Array mit <anzahl>
     * aufsteigenden Zufallszahlen und gibt es zurück
     * 5, 18, 200, 266, 345, 564, 566, 947
     * 1. Setze a[0] auf eine zuf. Zahl
     * 2. Gehe von 1 bis a.length-1 durch das Array
     *    Nimm den Wert vom Vorgänger und addiere
     *    eine zuf. Zahl bis 200
     */
    public int[] zufallszahlenAufsteigend(int anzahl) {
        // 0. Erstelle einen Zufallszahlengenerator
        Random generator = new Random();

        // 1. Erzeuge ein neues int-Array mit Größe 100
        int[] array = new int[anzahl];
        
        array[0] = generator.nextInt(200);
        
        for (int i = 1; i < array.length; i = i + 1) {
            array[i] = array[i - 1] + generator.nextInt(200);
        }
        
        return array;
    }

}
