public class Formelsammlung {
    // Funktion mit Ausgabe
    public void zweierPotenzAusgabe(int x) {
        int wert = 1;

        for (int i = 0; i < x; i = i + 1) {
            wert = wert * 2;
        }

        System.out.println("zweierPotenzAusgabe(): 2^" + x + " = " + wert);
    }

    // f(x) = 2^x
    // f(f(2)) = f(4) = 16
    // Funktion mit Rückgabe
    public int zweierPotenz(int x) {
        int wert = 1;

        for (int i = 0; i < x; i = i + 1) {
            wert = wert * 2;
        }

        return wert;
    }

    public void beispiel() {
        // geht nicht, da VOID (nichts) zurückgegeben wird
        // System.out.println(zweierPotenzAusgabe(10));
        zweierPotenzAusgabe(10);

        zweierPotenz(10); // Keine Ausgabe, sinnlos

        System.out.println( zweierPotenz(10) );
        System.out.println( 1000 * zweierPotenz(2) );
        System.out.println( zweierPotenz(zweierPotenz(2)) );
    }
}
