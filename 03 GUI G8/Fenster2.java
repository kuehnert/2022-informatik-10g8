import javax.swing.*;
import java.awt.*;

public class Fenster2 {
    public static void main(String[] args) {
        JFrame fenster = new JFrame("Mein 1. Fenster!");
        fenster.setSize(800, 600);
        
        fenster.setLayout(new GridLayout(0, 1));
        
        JLabel lbGruss = new JLabel("Du bist spizze!");
        lbGruss.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 48));
        lbGruss.setHorizontalAlignment(JLabel.CENTER);
        fenster.add(lbGruss);
        
        JLabel lbGruss2 = new JLabel("Ich will eine Pitza");
        lbGruss2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 48));
        lbGruss2.setHorizontalAlignment(JLabel.CENTER);
        fenster.add(lbGruss2);
        
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenster.setVisible(true);
    }
}
