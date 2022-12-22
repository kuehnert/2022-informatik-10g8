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
    


}


