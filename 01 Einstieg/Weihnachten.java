/*
 *                     # 
 *                    ### 
 *                   #####
 *                     #
 *                    ###
 *                   ##O##
 *                  #O#####
 *                 #########
 *                    ###
 *                   #$###
 *                  ####o##
 *                 #########
 *                ###3#######
 *                    $$$
 *                    $$$      
 */
public class Weihnachten {
    // Aufgabe 1
    public void rauten(int anzahl) {
        while (anzahl > 0) {
            System.out.print("#");
            anzahl = anzahl - 1;
        }
    }

    // Aufgabe 2
    // #
    // ##
    // ###
    // ####
    public void zeilen(int anzahl) {
        rauten(1);
        System.out.println();
        rauten(2);
        System.out.println();
        rauten(3);
        System.out.println();
        // ...
    }

    // Aufgabe 3
    //              #
    //             ###
    //            #####

    // Aufgabe 4
    //              #
    //             ###
    //            #####
    //              #
    //             ###
    //            #####
    //              #
    //             ###
    //            #####

    // Aufgabe 5
    //              #
    //             ###
    //            #####
    //             ###
    //            #####
    //           #######
    //          #########

    public static void printTree(int numLines) {
        // Iterate through the number of lines
        for (int i = 1; i <= numLines; i++) {
            // Calculate the number of spaces and asterisks for this line
            int numSpaces = numLines - i;
            int numAsterisks = 2 * i - 1;

            // Print the spaces and asterisks for this line
            for (int j = 0; j < numSpaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < numAsterisks; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

