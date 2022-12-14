public class Klausuruebung {
    String vorname;

    public void rechnen(int x) {
        System.out.println(2 * x + 1);
    }

    public static void kommazahl() {
        System.out.printf("%.2f", 3.1415);
    }

    // Aufgabe: Gib alle Zahlen zwischen 1 und 500 aus,
    // die durch 5 aber nicht durch 3 teilbar sind

    // Aufgabe: Gib alle Quadratzahlen aus, die zwischen
    // 3000 und 4000 sind

    public static void teilbar() {
        int zaehler = 2000;

        while (zaehler <= 5000) {
            if (zaehler / 18 * 18 == zaehler) { 
                if (zaehler / 24 * 24 == zaehler ) {
                    System.out.print(zaehler + ", ");
                }
            }

            zaehler += 1;
        }
    }

}
