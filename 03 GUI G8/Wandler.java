public class Wandler {
    String[] NUMBERS = {
            "", "one", "two", "three", "four", "five", "six", "seven",
            "eight", "nine", "ten", "eleven", "twelve", "thirteen",
            "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
            "nineteen"
        };

    String[] TENS = {
            null, null, "twenty", "thirty", "forty", "fifty", 
            "sixty", "seventy", "eighty", "ninety"
        };

    String[] THOUSANDS = {
            "", " thousand ", " million ", " billion ", " trillion "
        };

    public String toEnglish(int zahl) {
        // 74.074.074.074.074
        if (zahl == 0) {
            return "nought"; // Beendet Methode
        }

        String ausgabe = "";
        int tausender = 0;

        while (zahl > 0) {
            String temp = "";
            int einer = zahl % 10;
            int zehner = zahl / 10 % 10;
            int hunderter = zahl / 100 % 10;
            zahl = zahl / 1000;

            if (hunderter > 0) {
                temp += NUMBERS[hunderter] + " hundred ";
            }

            if (zehner < 2) {
                temp += NUMBERS[zehner * 10 + einer];
            } else {
                temp += TENS[zehner] + "-" + NUMBERS[einer];
            }

            if (temp.length() > 0) {
                ausgabe = temp + THOUSANDS[tausender] + ausgabe;
            }

            tausender += 1;
        }

        return ausgabe;
    }
}
