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
    
    
}
