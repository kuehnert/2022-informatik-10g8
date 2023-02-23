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

}
