// Lustige Schriftarten: 
// https://www.fontspace.com/font-generator
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

        while (restbetrag > 0) {
            System.out.println("Es fehlen: " + restbetrag + " €");

            // 2. Lies über Tastatur ein Geldstueck ein
            //    und ziehe das vom <restbetrag> ab
            System.out.print("Wirf einen Betrag ein: ");
            String eingabe = tastatur.nextLine();
            int geldstueck = Integer.parseInt(eingabe);
            restbetrag = restbetrag - geldstueck;
        }

        System.out.println("Ich habe genug Geld: " + restbetrag+" €");
    }

    public void gibWechselgeld() {
        // Gib nur W'geld, wenn notwendig
        // TODO 3: Gib eine sinnvolle Stueckelung an
        // 17€ => 10€ + 5€ + 2€
        // Tipp: Arbeiten Sie erst nur mit 1€, 2€ und 5€
        // Stuecken. 
        System.out.println("Rueckgeld: " + (-restbetrag) + " €");

        while (restbetrag <= -10) {
            System.out.println("Hier sind 10€");
            restbetrag = restbetrag + 10;
        }

        // Kann nur einen geben
        if (restbetrag <= -5) {
            System.out.println("Hier sind 5€");
            restbetrag = restbetrag + 5;
        }

        while (restbetrag <= -2) {
            System.out.println("Hier sind 2€");
            restbetrag = restbetrag + 2;
        }

        // Kann nur einen geben
        if (restbetrag < 0) {
            System.out.println("Hier ist 1€");
            restbetrag = restbetrag + 1;
        }
    }

    public void druckeTickets() {
        // TODO 2: Drucke die richtige Anzahl von Tickets
        // Idee: Drucke so lange jeweils ein Ticket,
        // solange die <ticketanzahl> größer 0 ist
        // Für jedes gedruckte Ticket ziehe 1 von
        // <ticketanzahl> ab.

        while (ticketanzahl > 0) {
            druckeTicket();
            ticketanzahl = ticketanzahl - 1;
        }        
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
        System.out.println("Nächster Kunde bitte!");
        System.out.println("----------------------------\n\n");
    }

    public void druckeStatus() {

    }

    public void bestimmeAnzahl(int neueAnzahl) {

    }

    public void druckeTicket() {
        // TODO 1: MACHEN SIE DAS HUEBSCH
        System.out.println("                     ,---.           ,---.");
        System.out.println("                    / /'`.\\.--'''--./,''\\ \\");
        System.out.println("                    \\ \\    _       _    / /");
        System.out.println("                     `./  / __   __ \\  \\,'");
        System.out.println("                      /    /_O)_(_O\\    \\");
        System.out.println("                      |  .-'  ___  `-.  |");
        System.out.println("                   .--|       \\_/       |--.");
        System.out.println("                 ,'    \\   \\   |   /   /    `.");
        System.out.println("                /       `.  `--^--'  ,'       \\");
        System.out.println("             .-'''''-.    `--.___.--'     .-'''''-.");
        System.out.println(".-----------/         \\------------------/         \\--------------.");
        System.out.println("| .---------\\         /----------------- \\         /------------. |");
        System.out.println("| |          `-`--`--'                    `--'--'-'             | |");
        System.out.println("| |       _____                 . . . . . o o o o o             | |");
        System.out.println("| |      __|[_]|__ ___________ _______    ____      o           | |");
        System.out.println("| |     |[] [] []| [] [] [] [] [_____(__  ][]]_n_n__][.         | |");
        System.out.println("| |    _|________|_[_________]_[________]_|__|________)<        | |");
        System.out.println("| |      oo    oo 'oo      oo ' oo    oo 'oo 0000---oo\\_        | |");
        System.out.println("| |     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~  | |");
        System.out.println("| |           𝕿𝖎𝖈𝖐𝖊𝖙 𝖋𝖚𝖊𝖗 𝖉𝖊𝖓 𝕸𝖔𝖓𝖘𝖙𝖊𝖗𝖟𝖚g                            | |");
        System.out.println("| |_____________________________________________________________| |");
        System.out.println("|_________________________________________________________________|");
        System.out.println("\n\n");    
    }
}
