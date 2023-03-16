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

}
