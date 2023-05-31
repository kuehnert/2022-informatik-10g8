import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ZahlenGUI {
    private Wandler wandler;
    
    private JFrame fenster;
    private JLabel lbNumber;
    private JButton bKlicker;
    private JTextField tfInput; // einzeilig
    private JTextArea taOutput; // mehrzeilig

    public ZahlenGUI() {
        wandler = new Wandler();
        
        fenster = new JFrame("Number Converter (c) Mr K.");
        fenster.setSize(800, 600);
        fenster.setLayout(new GridLayout(0, 1));

        lbNumber = new JLabel("Number:");
        // lbNumber.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 48));
        lbNumber.setHorizontalAlignment(JLabel.CENTER);
        fenster.add(lbNumber);

        tfInput = new JTextField("1.234");
        fenster.add(tfInput);
        
        bKlicker = new JButton("Convert");
        bKlicker.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                buttonGeklickt();
            }
        });
        fenster.add(bKlicker);

        taOutput = new JTextArea("One thousand");
        fenster.add(taOutput);
        
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenster.setVisible(true);
    }

    private void buttonGeklickt() {
        String zahlStr = tfInput.getText();
        int zahl = Integer.parseInt(zahlStr);
        String ausgabe = wandler.toEnglish(zahl);
        taOutput.setText(ausgabe);
    }

    public static void main(String[] args) {
        new ZahlenGUI();
    }
}
