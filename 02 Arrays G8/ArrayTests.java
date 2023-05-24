import java.util.Arrays;

public class ArrayTests {
    private ArrayGeneratoren generator;
    private ArrayOperationen operationen;

    public ArrayTests() {
        System.out.println("Erzeuge Ops & Gen");
        generator = new ArrayGeneratoren();
        operationen = new ArrayOperationen();
    }

    public void testeZahlenreihe() {
        System.out.println("testeZahlenreihe()");

        int[] zahlen = generator.zahlenreihe(2, 50);
        operationen.druckeArray(zahlen);
        operationen.druckeArrayTab(zahlen);

        zahlen = generator.zahlenreihe(20, 6);
        operationen.druckeArrayTab(zahlen);

        zahlen = generator.reihePotenzen3(700);
        operationen.druckeArray(zahlen);   
    }

    public void testeSumme() {
        int[] a = {30, 7, 12, 3};
        long s = operationen.summe(a);
        System.out.println(s + " <=> 52");

        a = new int[]{1000};
        s = operationen.summe(a);
        System.out.println(s + " <=> 1000");

        a = new int[]{};
        s = operationen.summe(a);
        System.out.println(s + " <=> 0");
    }

    public void testeMittelwert() {
        int[] a = {1, 2};
        double mw = operationen.mittelwert(a);
        System.out.println(mw + " <=> 1.5");
    }

    public void testeZufallszahlen() {
        System.out.println("testeZufallszahlen()");
        int[] a = generator.zufallszahlen(10, 200);
        operationen.druckeArray(a);
    }

    public void testeZufallszahlenAufsteigend() {
        System.out.println("testeZufallszahlenAufsteigend()");
        int[] a = generator.zufallszahlenAufsteigend(100);
        operationen.druckeArray(a);
    }

    public void testeFindePleateau() {
        int[] a1 = {143, 143, 236, 405, 475, 498, 604, 658};
        int[] plateau1 = operationen.findePlateau(a1); // => 0, 2
        System.out.print("Erwarte: {0, 2}, Bekommen: ");       
        operationen.druckeArray(plateau1);

        int[] a2 = {143, 236, 405, 405, 405, 475, 498, 604, 658};
        int[] plateau2 = operationen.findePlateau(a2); // => 0, 2
        System.out.print("Erwarte: {2, 3}, Bekommen: ");       
        operationen.druckeArray(plateau2);

        int[] a3 = {143, 236, 405, 475, 498, 604, 658, 658, 658, 658};
        int[] plateau3 = operationen.findePlateau(a3); // => 0, 2
        System.out.print("Erwarte: {6, 4}, Bekommen: ");       
        operationen.druckeArray(plateau3);
    }

    /*
     *  0 = nought (null | oh | love | nil | zero)
    9 = nine
    12 = twelve
    25 = twenty-five
    36 = thirty-six
    8,563  = eight thousand five hundred sixty-three
    26,357 = twenty-six thousand three hundred fifty-seven
    33,000,333,323 = thirty-three billion three hundred thirty-three thousand three hundred twenty-three
     */
    public void testeEnglischeZahlen() {
        int zahl = 0;
        String ergebnis = operationen.toEnglish(zahl);
        System.out.println("zero <=> " + ergebnis);

        zahl = 1;
        ergebnis = operationen.toEnglish(zahl);
        System.out.println("one <=> " + ergebnis);

        zahl = 15;
        ergebnis = operationen.toEnglish(zahl);
        System.out.println("fifteen <=> " + ergebnis);

        zahl = 20;
        ergebnis = operationen.toEnglish(zahl);
        System.out.println("twenty <=> " + ergebnis);

        zahl = 23;
        ergebnis = operationen.toEnglish(zahl);
        System.out.println("twenty-three <=> " + ergebnis);

        zahl = 52;
        ergebnis = operationen.toEnglish(zahl);
        System.out.println("fifty-two <=> " + ergebnis);

        zahl = 99;
        ergebnis = operationen.toEnglish(zahl);
        System.out.println("ninety-nine <=> " + ergebnis);

        zahl = 154;
        ergebnis = operationen.toEnglish(zahl);
        System.out.println("one hundred fifty-four <=> " + ergebnis);

        zahl = 7_623;
        ergebnis = operationen.toEnglish(zahl);
        System.out.println("seven thousand six hundred twenty-three <=> " + ergebnis);

        zahl = 1_000_000;
        ergebnis = operationen.toEnglish(zahl);
        System.out.println("one million <=> " + ergebnis);

        zahl = 1_987_654_321;
        ergebnis = operationen.toEnglish(zahl);
        System.out.println("one million <=> " + ergebnis);
    }

    
}
