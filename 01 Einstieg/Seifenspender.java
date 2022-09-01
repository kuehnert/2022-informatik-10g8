public class Seifenspender {
    // Variablen
    private int fuellmenge;
    private int kapazitaet;
    private int ausgabemenge;
    private String duftart;
    private boolean eingeschaltet;
    // ncurses Bibliothek

    // Konstruktor => Wird beim Erzeugen eines Objekts aufgerufen
    // Ein Konstruktor hat kein void 
    // Name ist der der Klasse
    public Seifenspender() {
        kapazitaet = 300; // 300ml
        fuellmenge = 200; // 200ml
        ausgabemenge = 35;
        duftart = "Bergamotte";
        eingeschaltet = false;
    }
    
    // Funktionen
    public void spenden() {
        fuellmenge = fuellmenge - ausgabemenge;
        System.out.println("Ich spende " + ausgabemenge + " ml..... ");
        
    }
    
    public void einschalten() {
        System.out.println("Einschalten");
    }
    
    public void ausschalten() {
        System.out.println("Ausschalten");
    }
    
    public void auffuellen(int menge) {
        System.out.println("Auffuellen");
    }
}
