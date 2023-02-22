public class Beispiel {
    // 😀 = f
    // f(x) = x * 2
    // banane(x) = x * 2
    // 😀(x) = x * 2
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
}
