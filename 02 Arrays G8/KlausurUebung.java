public class KlausurUebung {
    public static int minimumkaputt(int[] a) {
        int minimum = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < minimum) {
                minimum = a[i];
            }
        }

        return minimum;
    }

    public static void testeMinimum() {
        int[] a = new int[] {7, 2, 9, 1, 4}; // 1
        int min = minimumkaputt(a);
        System.out.println(min + " == 1"); 

        a = new int[] {700, 200, 900, 101, 400};
        min = minimumkaputt(a);
        System.out.println(min + " == 101?");

        a = new int[] {2700123, 21354, 900011234, 101101010, 400121};
        min = minimumkaputt(a);
        System.out.println(min + " == 21354?");
    }
}

