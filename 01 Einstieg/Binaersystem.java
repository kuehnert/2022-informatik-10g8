public class Binaersystem {
    // HA:
    // 1. Finn Fählär
    // 2. Iss Käksä
    
    public static void dezimalZuBinaer(int dezimal) {
        System.out.println("Wandle " + dezimal + " ins Binaersystem um");
        int stelle = 128;

        while (dezimal >= 0) {
            if (dezimal >= stelle) {
                System.out.print("1");
                dezimal = dezimal - stelle;
            } else {
                System.out.print("0");
            }
            
            stelle = stelle / 2;
        }

        System.out.println();
    }
}
