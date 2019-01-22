import java.util.Random;
import java.util.Scanner;
public class Lotek{

//**************************************************************************************
//** Wykorzystanie biblioteki Random z konstruktorem                                  **
//**************************************************************************************
    static Random rand = new Random();
    int nextInt = rand.nextInt();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tab = new int[6];
        //boolean[] test = new boolean[tab.length];
        //    static Random rand = new Random(6);
        int [] multik = new int[10];
        //Scanner in = new Scanner();
        System.out.println("Wylosuję Ci 3 zakłady na dużego lotka");
        for (byte b = 0; b < 3; b++) {
            for (byte a = 0; a < tab.length; a++) {
               /*int spr;
                do
                    spr = rand.nextInt(tab.length);
                while (test[spr]) ;

                    spr = tab[a];
                    //spr[a] = test[spr];
                    test[spr] = true;
                    // while (test[spr]=);*/


                tab[a] = 1+rand.nextInt(49)-1;


                if (tab[a] == 0) tab[a] = 1+rand.nextInt(49)-1;

                System.out.print(" | " + tab[a]);
            }
            System.out.println();
            // System.out.println("Pewnie się udało");


        }
        System.out.println();
        System.out.println("Pewnie się udało");
        System.out.println();
        System.out.println("Ile losowań multilotka?");
        int z= sc.nextInt();

        for (byte b = 0; b < z; b++) {
            System.out.print("Los nr  |   " + b + "  |  ");
            for (byte a = 0; a < multik.length; a++) {
                multik[a] = 1+rand.nextInt(80);

                if (multik[a] == 0) multik[a] = 1+rand.nextInt(80);

                System.out.print(" | " + multik[a]);

            }
            System.out.println();
        }
    }
}




