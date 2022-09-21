import java.util.Scanner;

public class Ticketautomat {
    // Daten
    private Scanner tastatur;
    private int ticketpreis;
    private int restbetrag;
    private int ticketanzahl;

    // Funktionen
    public Ticketautomat() {
        tastatur = new Scanner(System.in);
        ticketpreis = 2;
        restbetrag = 0;
        ticketanzahl = -1;
    }
    
    public void bestimmeAnzahl() {
        System.out.print("Wie viele Tickets? ");
        // Lies eine Zeichenkette über Tastatur ein und
        // speichere sie in <eingabe>
        String eingabe = tastatur.nextLine();
        System.out.println("Deine Eingabe: '" + eingabe + "'");
        
        // Wandle die Zeichenkette <eingabe> in eine
        // Ganzzahl um und speichere sie in <ticketanzahl>
        ticketanzahl = Integer.parseInt(eingabe);
        System.out.println("Du willst: " + ticketanzahl + " Tickets");
    }

    public void einzahlen() {
        // 1. Rechne aus, wie viel der Kunde bezahlen muss
        //    und speichere das in <restbetrag>
        // FALSCH: ticketpreis * ticketanzahl = restbetrag;
        // RICHTIG:
        restbetrag = ticketpreis * ticketanzahl;
        System.out.println("Es fehlen: " + restbetrag + " €");
        
        // 2. Lies über Tastatur ein Geldstueck ein
        //    und ziehe das vom <restbetrag> ab
        System.out.print("Wirf einen Betrag ein: ");
        String eingabe = tastatur.nextLine();
        int geldstueck = Integer.parseInt(eingabe);
        restbetrag = restbetrag - geldstueck;
        
        System.out.println("Es fehlen: " + restbetrag + " €");

        // 3. ???
    }

    public void gibWechselgeld() {

    }
    
    public void druckeTicket() {
    }

    public void druckeTickets() {
    }

    public void begruesse() {
        System.out.println("❤---------------------------👍");
        System.out.println("Willkommen bei Lauras Reisen");
        System.out.println("❤---------------------------👍");
        System.out.println("Ein Ticket kostet "+ticketpreis+"€.");
    }
    
    public void druckeMenu() {
        begruesse();
        bestimmeAnzahl();
        einzahlen();
        gibWechselgeld();
        druckeTickets();
    }

    public void druckeStatus() {

    }

    public void bestimmeAnzahl(int neueAnzahl) {

    }
}
