public class Ganzzahlen {
    // Für int: -2_147_483_648 ... 2_147_483_647
    // 
    public static void typen() {
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

    public static void istGerade() {
        int zahl = 300;

        boolean gerade = zahl % 2 == 0;

        if (gerade) {
            System.out.println("Gerade");
        } else {
            System.out.println("Ungerade");
        }
    }
}
