public class ForSchleife {
    // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
    public void whileSchleife() {
        int i = 0;
        while (i < 10) {
            System.out.println( i );
            i = i + 1;
        }
    }
    
    public void forSchleife() {
        for (int i = 0; i < 10; i = i + 1) {
            System.out.println( i );
        }
    }
}
