public class Autohaendler {
    private Auto auto1;
    private Auto auto2;
    private Auto auto3;

    public void hauptprogramm() {
        System.out.println(" ____  __.             .__                          __            ____  __.                              ");     
        System.out.println("|    |/ _|__ __   ____ |  |__   ____   ____________/  |_  ______ |    |/ _|____ ______________   ____   ____  ");
        System.out.println("|      < |  |  \\_/ __ \\|  |  \\ /    \\_/ __ \\_  __ \\   __\\/  ___/ |      < \\__  \\_  __ \\_  __ \\_/ __ \\ /    \\ ");
        System.out.println("|    |  \\|  |  /\\  ___/|   Y  \\   |  \\  ___/|  | \\/|  |  \\___ \\  |    |  \\ / __ \\|  | \\/|  | \\/\\  ___/|   |  \\");
        System.out.println("|____|__ \\____/  \\___  >___|  /___|  /\\___  >__|   |__| /____  > |____|__ (____  /__|   |__|    \\___  >___|  /");
        System.out.println("        \\/           \\/     \\/     \\/     \\/                 \\/          \\/    \\/                   \\/     \\/ ");

        auto1 = new Auto();
        auto1.setFarbe("rot");
        auto1.setKennzeichen("LEV MS-0");
        auto1.setMarke("VW");
        auto1.setModell("ID 3");
        auto1.druckeSchild();

        auto2 = new Auto();
        auto2.setFarbe("blau");
        auto2.setKennzeichen("LEV MS-0");
        auto2.setMarke("VW");
        auto2.setModell("ID 3");
        auto2.druckeSchild();

        auto3 = new Auto();
        auto3.setFarbe("gelb");
        auto3.setKennzeichen("LEV MS-0");
        auto3.setMarke("VW");
        auto3.setModell("ID 3");
        auto3.druckeSchild();
    }
}
