public class ArrayOperationen {
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

    public long summe(int[] zahlen) {
        long summe = 0;

        for (int i = 0; i < zahlen.length; i = i + 1) {
            summe = summe + zahlen[i];
        }

        return summe;
    }

    public double mittelwert(int[] zahlen) {
        double s = summe(zahlen);
        return s / zahlen.length;
    }

    // Aufgabenideen
    // 1. Bestimme die größte Zahl im Array
    // 2. Bestimme die zweitgrößte Zahl im Array
    // 3. Bestimmte, wie viele Elemente im Array > 10 sind

    // Finde Plateau, wo beginnt es? Wie lang ist es?
    // 143, 236, 405, 405, 405, 475, 498, 604, 658
    public int[] findePlateau(int[] array) {
        // 1. Schritt: Finde Start des Plateaus
        int start = 0;

        for (; start < array.length - 1; start += 1) {
            // hat das akt. El. den gleichen Wert
            // wie sein Nachfolger
            if (array[start] == array[start + 1] ) {
                // Springe aus der for-Schleife
                break;
            }
        }
        // start hat den richtigen Wert

        // 2. Bestimme die Länge
        int ende = start + 1;
        while (ende < array.length - 1 && array[ende] == array[ende+1]) {
            ende = ende + 1;
        }

        return new int[]{start, ende - start + 1};
    }

    String[] ENGLISH_NUMBERS = {
            "zero", "one", "two", "three", "four", "five", "six", "seven",
            "eight", "nine", "ten", "eleven", "twelve", "thirteen",
            "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
            "nineteen"
        };
    
        String[] TENS = {
            null, null, "twenty", "thirty", "forty", "fifty", 
            "sixty", "seventy", "eighty", "ninety"
        };

    public String toEnglish(int zahl) {
        if (zahl < ENGLISH_NUMBERS.length) {
            return ENGLISH_NUMBERS[zahl];
        } else if (zahl < 100) {
            int letzte = zahl % 10;
            int vorletzte = zahl / 10 % 10;
            
            if (letzte == 0) {
                return TENS[vorletzte];
            } else {
                return TENS[vorletzte] + "-" + ENGLISH_NUMBERS[letzte];
            }
        }

        return "ERROR: Number too large";
    }

    
    
}