import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ZahlenGUI {
    private Wandler wandler;

    private Font myFont;
    private JFrame fenster;
    private JLabel lbNumber;
    private JButton bKlicker;
    private JTextField tfInput; // einzeilig
    private JTextArea taOutput; // mehrzeilig

    public ZahlenGUI() {
        wandler = new Wandler();
        myFont = new Font(Font.SANS_SERIF, Font.BOLD, 24);
        fenster = new JFrame("Number Converter (c) Mr K.");
        fenster.setSize(800, 600);
        // fenster.setLayout(new GridLayout(0, 1));
        fenster.setLayout(new BoxLayout(fenster.getContentPane(), BoxLayout.Y_AXIS));

        JPanel pOben = new JPanel();
        lbNumber = new JLabel("Number:");
        // lbNumber.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 48));
        lbNumber.setHorizontalAlignment(JLabel.CENTER);
        lbNumber.setFont(myFont);
        pOben.add(lbNumber);

        tfInput = new JTextField("1234");
        tfInput.setHorizontalAlignment(JTextField.RIGHT);
        tfInput.setFont(myFont);
        tfInput.setPreferredSize(new Dimension(200, 30)); 
        tfInput.addKeyListener(new KeyListener() {
                public void keyPressed(KeyEvent e) {}

                public void keyReleased(KeyEvent e) {
                    buttonGeklickt();
                }

                public void keyTyped(KeyEvent e) {}
            });
        pOben.add(tfInput);
        fenster.add(pOben);

        bKlicker = new JButton("Convert");
        bKlicker.setFont(myFont);
        bKlicker.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    buttonGeklickt();
                }
            });
        fenster.add(bKlicker);

        taOutput = new JTextArea("One thousand");
        taOutput.setFont(myFont);
        taOutput.setLineWrap(true);
        taOutput.setWrapStyleWord(true);
        fenster.add(taOutput);
        buttonGeklickt();

        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenster.setVisible(true);
    }

    private void buttonGeklickt() {
        String zahlStr = tfInput.getText();
        try {
            int zahl = Integer.parseInt(zahlStr);
            String ausgabe = wandler.toEnglish(zahl);
            taOutput.setText(ausgabe);
        } catch (NumberFormatException e) {
            taOutput.setText("Ungültige Eingabe");
        }
    }

    public static void main(String[] args) {
        new ZahlenGUI();
    }
}
