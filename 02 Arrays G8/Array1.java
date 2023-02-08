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
        zahlen = new int[]{13, 7, 5, 9, 20, 111};

        // Lesender Zugriff
        // System.out.println(      zahl     );

        // Wenn man den Namen des Arrays ausgibt, bekommt
        // man nur seine Speicheradresse
        System.out.println( "zahlen: " + zahlen );

        System.out.println("Justus' Zahlen");
        System.out.println("Es sind " + zahlen.length + " Zahlen im Array");
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
        int i = 0;
        while (i < zahlen.length) {
            zahlen[i] = zahlen[i] + 1;
            i = i + 1;
        }

        System.out.println("Um Eins erhöht");
        druckeArray(zahlen);
    }

    public void array2() {
        int[] maxZahlen;
        maxZahlen = new int[]{3, 7, 18};
        druckeArray(maxZahlen);
    }

    /**
     * 2 Aufgaben:
     * 1a. Machen Sie eine Kopie und geben die Zahlen verdoppelt aus
     * 1b. Eine Methode, die jeden Wert in einem Array verdoppelt
     *     {4, 7, 1} => {8, 14, 2}
     * 2. Machen Sie eine 2. Kopie und geben das Array in der Form aus:
     *    3, 7, 18
     */
    // f(x) = 2x
    public void druckeArray(int[] a) {
        System.out.println( "a: " + a );

        for (int i = 0; i < a.length; i = i + 1) {
            System.out.println(  a[i]  );
        }

        System.out.println( "-------------------------" );
    }

    public void druckeArrayVerdoppelt(int[] a) {
        for (int i = 0; i < a.length; i = i + 1) {
            System.out.println(  a[i] * 2 );
        }
    }

    public void verdoppeln(int[] a) {
        for (int i = 0; i < a.length; i = i + 1) {
            a[i] = a[i] * 2;
        }
    }

    public void testeVerdoppelt() {
        int[] z1 = new int[]{5, 8, 7, 3};

        druckeArrayVerdoppelt(z1);
        druckeArrayVerdoppelt(z1);
        druckeArrayVerdoppelt(z1);

        int[] z2 = new int[]{5, 8, 7, 3};
        verdoppeln(z2);
        druckeArray(z2);
        verdoppeln(z2);
        druckeArray(z2);
        verdoppeln(z2);
        druckeArray(z2);
    }

    
}
