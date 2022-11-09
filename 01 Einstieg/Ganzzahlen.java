public class Ganzzahlen {
    // Für int: -2_147_483_648 ... 2_147_483_647
    // 
    public static void typen() {
        // signed
        byte b;
        short s;
        int i;  // -2_147_483_648 ... 2_147_483_647
        long l;
    }

    public static void addieren() {
        int z = 2_147_483_000;
        while (z > 0) {
            z = z + 1;
            System.out.println(z);
        }
    }

    public static void dividieren() {
        System.out.println(0 / 2 * 2 +  "== 0"); 
        System.out.println(1 / 2 * 2 + " == 0"); 
        System.out.println(2 / 2 * 2 + " == 2"); 
        System.out.println(3 / 2 * 2 + " == 2"); 
        System.out.println(4 / 2 * 2 + " == 4"); 
        System.out.println(5 / 2 * 2 + " == 4"); 
        
        System.out.println(1 / 3 + " == 0"); 
        System.out.println(2 / 3 + " == 0"); 
        System.out.println(3 / 3 + " == 1"); 
        System.out.println(4 / 3 + " == 1"); 
    }
    
    public static void istGerade() {
        int zahl = 300;
        // Dividiert man eine Zahl durch 2 und multipliziert
        // das (abgeschnittene) Ergebnis wieder mit 2
        // und das ergibt die ursprüngliche Zahl, 
        // ist sie gerade, sonst nicht
        boolean gerade = zahl / 2 * 2 == zahl;

        if (zahl / 2 * 2 == zahl) {
            System.out.println("Gerade");
        } else {
            System.out.println("Ungerade");
        }
    }
}
