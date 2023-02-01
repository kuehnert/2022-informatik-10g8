public class Array1 {
    /*
     * Ein Array in Java ist eine Datenstruktur, die es ermöglicht, 
     * mehrere Werte des gleichen Datentyps in einer einzigen
     * Variablen zu speichern. Jeder Wert in einem Array wird als 
     * Element bezeichnet und hat einen Index, der seine Position 
     * im Array angibt. Arrays haben eine feste Größe, die bei der 
     * Erstellung des Arrays festgelegt wird und nicht mehr geändert 
     * werden kann.
     */
    public void array1() {
        // Deklaration
        int zahl;
        int[] zahlen;

        // Initialisierung
        zahl = 5;
        zahlen = new int[]{13, 7, 5, 9, 20};

        // Lesender Zugriff
        // System.out.println(      zahl     );

        // Wenn man den Namen des Arrays ausgibt, bekommt
        // man nur seine Speicheradresse
        // System.out.println(     zahlen    );

        System.out.println("Justus' Zahlen");
        druckeArray(zahlen);

        // 8, 2, 4, 6, 21
        zahlen[0] = 8;
        zahlen[1] = 2;
        zahlen[2] = 4;
        zahlen[3] = 6;
        zahlen[4] = 21;
        System.out.println("Raffas Zahlen");
        druckeArray(zahlen);

        // Erhöhe den Wert aller Elemente um eins
        zahlen[0] = zahlen[0] + 1; 
        zahlen[1] = zahlen[1] + 1; 
        zahlen[2] = zahlen[2] + 1; 
        zahlen[3] = zahlen[3] + 1; 
        zahlen[4] = zahlen[4] + 1; 

        System.out.println("Um Eins erhöht");
        druckeArray(zahlen);
    }

    public void array2() {
        int[] maxZahlen;
        maxZahlen = new int[]{3, 7, 18, -1, -1};
        druckeArray(maxZahlen);
    }

    /**
     * Ersetzen Sie die 5 Befehle durch eine while-Schleife
     */
    public void druckeArray(int[] a) {
        System.out.println(  a[0]  );
        System.out.println(  a[1]  );
        System.out.println(  a[2]  );
        System.out.println(  a[3]  );
        System.out.println(  a[4]  );
    }
}
