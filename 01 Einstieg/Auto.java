public class Auto {
    // Variablen
    private String marke;
    private String modell;
    private String farbe;
    private String kennzeichen;
    
    // Funktionen
    public void hupe() {
        System.out.println(kennzeichen + " Huuuuuuuuuuuup!");
    }
    
    // Setter-Methoden
    public void setKennzeichen(String neuesKennzeichen) {
        kennzeichen = neuesKennzeichen;
    }

    public void setMarke(String neueMarke) {
        marke = neueMarke;
    }
    
    public void setModell(String neuesModell) {
        modell = neuesModell;
    }
    
    public void setFarbe(String neueFarbe) {
        farbe = neueFarbe;
    }
    
    public void druckeSchild() {
        System.out.println("############ Zu Verkaufen ###############");
        System.out.println("# Kennzeichen: " + kennzeichen);
        System.out.println("# Marke: " + marke);
        System.out.println("# Modell: " + modell);
        System.out.println("# Farbe: " + farbe);
        System.out.println("#########################################");
        System.out.println();
        
    }
}
