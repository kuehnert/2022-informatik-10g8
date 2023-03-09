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
}
