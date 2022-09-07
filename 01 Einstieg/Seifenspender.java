public class Seifenspender {
    // Variablen
    private int fuellmenge;
    private int kapazitaet;
    private int ausgabemenge;
    private String duftart;
    // Wahrheitswert, ist entweder <true> (wahr) oder <false> (unwahr)
    private boolean eingeschaltet;

    // Konstruktor => Wird beim Erzeugen eines Objekts aufgerufen
    // Ein Konstruktor hat kein void 
    // Name ist der der Klasse
    public Seifenspender() {
        System.out.println("Ein Seifenspender ist geboren");
        kapazitaet = 200; // 200ml
        ausgabemenge = 12;
        setFuellmenge(5 * ausgabemenge); 

        duftart = "Bergamotte";
        eingeschaltet = false;
    }

    // Funktionen
    public void spenden() {
        // Wenn er eingeschaltet ist...
        if (eingeschaltet == true) {
            // Spende nur, wenn >35ml enthalten sind
            if (fuellmenge >= ausgabemenge) {
                // Subtrahiere die Ausgabemenge
                fuellmenge = fuellmenge - ausgabemenge;
                System.out.println("Ich spende " + ausgabemenge + " ml..... ");
            } else {
                // wenn fuellmenge nicht ausreicht,
                System.out.println("Ich spende meine letzen "+fuellmenge+" ml!");
                fuellmenge = 0;
            }
        } else {
            // Sonst...
            System.out.println("FEHLER: Der Spender ist AUS!");
        }
        // TODO: Bei 0ml menge gib eine Fehlermeldung aus
    }

    public void einschalten() {
        eingeschaltet = true;        
        System.out.println("Seifenspender ist EINgeschaltet!");
    }

    public void ausschalten() {
        eingeschaltet = false;  
        System.out.println("Seifenspender ist AUSgeschaltet");
    }

    public void auffuellen() {
        System.out.println("Auffuellen bis voll");
    }

    public void setFuellmenge(int menge) {
        // wenn die <menge> nicht zu groß ist...
        if (menge <= kapazitaet) {
            // setze <fuellmenge> auf <menge>
            fuellmenge = menge;
        } else {
            fuellmenge = kapazitaet;
        }

        System.out.println("Fuellmenge ist jetzt " 
            + fuellmenge + " ml");

        // TODO: Verhindere negative <menge>
    }
}
