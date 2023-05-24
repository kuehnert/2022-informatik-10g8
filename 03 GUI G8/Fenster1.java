import javax.swing.*;

public class Fenster1 {
    public static void main(String[] args) {
        JFrame fenster = new JFrame("Mein 1. Fenster!");
        
        fenster.setSize(800, 600);
        
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenster.setVisible(true);
    }
}
