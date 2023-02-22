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

        maxZahlen = new int[]{3};
        druckeArray(maxZahlen);

        maxZahlen = new int[]{};
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
    /* 
     *       ---------------
     *       | 0 |  1 |  2 |
     *       ├───┼----------
     *       | 7 | 14 | 21 |
     *       ---------------
     *       https://en.wikipedia.org/wiki/Box-drawing_character
     */
    public void druckeArray(int[] a) {
        if (a.length > 0) {
            for (int i = 0; i < a.length - 1; i = i + 1) {
                System.out.print(  a[i] + ", "  );
            }
            System.out.println(a[a.length - 1]);
        }

        System.out.println( "-------------------------" );
    }

    public void druckeZahl(int zahl) {
        if (zahl < 10) {
            // 2 Leerzeichen: zahl ist kleiner als 10
            System.out.print("  " + zahl);
        } else if (zahl < 100) {
            // 1 Leerzeichen
            System.out.print(" " + zahl);
        } else {
            System.out.print(zahl);
        }
    }

    public void druckeArrayTab(int[] a) {
        // 1. Drucke die Indizes mit | getrennt
        for (int i = 0; i < a.length; i = i + 1) {
            System.out.print(  " | " );
            druckeZahl(i);
        }
        System.out.println( " |" );

        // 2. Horizontale Linie |---|---|---|
        for (int i = 0; i < a.length; i = i + 1) {
            System.out.print(  "-|----");
        }
        System.out.println( "-|" );

        // 3. Drucke die Elemente mit | getrennt
        for (int i = 0; i < a.length; i = i + 1) {
            System.out.print(  " | " );
            druckeZahl(a[i]);
        }
        System.out.println( " |" );

        System.out.println( "\n---\n" );
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

        // druckeArrayVerdoppelt(z1);
        // druckeArrayVerdoppelt(z1);
        // druckeArrayVerdoppelt(z1);

        int[] z2 = new int[]{5, 8, 7, 3};
        verdoppeln(z2);
        druckeArrayTab(z2);
        verdoppeln(z2);
        druckeArrayTab(z2);
        verdoppeln(z2);
        druckeArrayTab(z2);

        int[] z3 = new int[]{6,4,3,7,3,5,433,673,24,234};
        druckeArrayTab(z3);
    }

    public void testeZahlenreihe() {
        zahlenreihe(10, 17);
        zahlenreihe(20, 6);
    }

    public void zahlenreihe(int anzahl, int basis) {
        int[] zahlen; // Deklaration
        zahlen = new int[anzahl]; // Initialisierung

        // {6, 12, 18, 24, 30, 36, 42, 48 };
        for (int i = 0; i < anzahl; i = i + 1) {
            zahlen[i] = basis * (i + 1);
        }

        druckeArrayTab(zahlen);
    }

    /*
     * 1. Erstelle ein Array mit <anzahl> Quadratzahlen
     */
    public void reiheQuadratzahlen(int anzahl) {
        int[] zahlen; // Deklaration
        zahlen = new int[anzahl]; // Initialisierung

        for (int i = 0; i < anzahl; i = i + 1) {
            zahlen[i] = anzahl * anzahl;
        }

        druckeArrayTab(zahlen);
    }

    /*
     * 2. Erstelle ein Array mit <anzahl> 2er-Potenzen
     *    1, 2, 4, 8, 16, 32, 
     */
    public void reihePotenzen(int anzahl) {
        int[] zahlen; // Deklaration
        zahlen = new int[anzahl]; // Initialisierung

        for (int i = 0; i < anzahl; i = i + 1) {
            zahlen[i] = -1000;
        }

        druckeArrayTab(zahlen);
    }

}
