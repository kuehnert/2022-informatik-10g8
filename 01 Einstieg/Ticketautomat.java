// Lustige Schriftarten: 
// https://www.fontspace.com/font-generator
import java.util.Scanner;

public class Ticketautomat {
    // Daten
    private Scanner tastatur;
    private double ticketpreis; // Kommazahl 
    private double restbetrag;
    private int ticketanzahl; // Ganzzahl
    private boolean eingeschaltet;

    // Funktionen
    public Ticketautomat() {
        tastatur = new Scanner(System.in);
        ticketpreis = 3.75;
        restbetrag = 0;
        ticketanzahl = -1;
        eingeschaltet = true;
    }

    private void bestimmeAnzahl() {
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

    private void einzahlen() {
        // 1. Rechne aus, wie viel der Kunde bezahlen muss
        //    und speichere das in <restbetrag>
        // FALSCH: ticketpreis * ticketanzahl = restbetrag;
        // RICHTIG:
        restbetrag = ticketpreis * ticketanzahl;

        while (restbetrag > 0) {
            String rbs = String.format("%.2f", restbetrag);
            System.out.println("Es fehlen: " + rbs + " €");

            // 2. Lies über Tastatur ein Geldstueck ein
            //    und ziehe das vom <restbetrag> ab
            System.out.print("Wirf einen Betrag ein: ");
            String eingabe = tastatur.nextLine();
            //************************************
            // TODO: Hier brauchen wir
            // double geldstueck = Double.parseDouble(eingabe);
            int geldstueck = Integer.parseInt(eingabe);
            //************************************

            // Und-Operator: a && b => a UND b
            // Oder-Operator: a || b => a ODER b 
            if (geldstueck == 1 || geldstueck == 2 
            || geldstueck == 5 || geldstueck == 10
            || geldstueck == 20|| geldstueck == 50
            ) {
                restbetrag = restbetrag - geldstueck;
            } else {
                System.out.println("Ungueltiges Zahlungsmittel.");
            }
        }

        System.out.println("Ich habe genug Geld: " + (-restbetrag) + " €");
    }

    private void gibWechselgeld() {
        // Gib nur W'geld, wenn notwendig
        // TODO 3: Gib eine sinnvolle Stueckelung an
        // 17€ => 10€ + 5€ + 2€
        // Tipp: Arbeiten Sie erst nur mit 1€, 2€ und 5€
        // Stuecken. 
        String rbs = String.format("%.2f", -restbetrag);
        System.out.println("Rueckgeld: " + rbs + " €");

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
        if (restbetrag <= -1.0) {
            System.out.println("Hier ist 1€");
            restbetrag = restbetrag + 1;
        }
        
        if (restbetrag <= -0.5) {
            System.out.println("Hier sind 50 Cent");
            restbetrag = restbetrag + 0.5;
        }
        
        while (restbetrag <= -0.2) {
            System.out.println("Hier sind 20 Cent");
            restbetrag = restbetrag + 0.2;
        }
        
        if (restbetrag <= -0.1) {
            System.out.println("Hier sind 10 Cent");
            restbetrag = restbetrag + 0.1;
        }

        if (Math.round(restbetrag*100) <= 0.05*100) {
            System.out.println("Hier sind 5 Cent");
            restbetrag = restbetrag + 0.05;
        }
    }

    private void druckeTickets() {
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

    private void begruesse() {
        String preisString = String.format("%.2f", ticketpreis);
        
        System.out.println("❤---------------------------👍");
        System.out.println("Willkommen bei Lauras Reisen");
        System.out.println("❤---------------------------👍");
        System.out.println("Ein Ticket kostet " + preisString + " €.");
    }

    public void druckeMenu() {
        while (eingeschaltet) {
            begruesse();
            bestimmeAnzahl();
            einzahlen();
            gibWechselgeld();
            druckeTickets();
            
            // Aufgabe: Fragen Sie ob es weitere Kunden gibt
            // Bei Eingabe von "1": Beginne von vorne
            // Bei "2": Beende das Programm
            System.out.println("Gibt es weitere Kunden (1 für ja)?");
            String antwort = tastatur.nextLine();
            int antwortZahl = Integer.parseInt(antwort);
            
            if (antwortZahl == 1) { 
                System.out.println("----------------------------\n\n");
            } else {
                eingeschaltet = false;
            }
        }
    }
    
    private void druckeTicket() {
        System.out.println("1x 𝕿𝖎𝖈𝖐𝖊𝖙 𝖋𝖚𝖊𝖗 𝖉𝖊𝖓 𝕸𝖔𝖓𝖘𝖙𝖊𝖗𝖟𝖚g");
        /*
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
        */
    }
}
