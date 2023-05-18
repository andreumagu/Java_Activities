package Actividades1;

import java.util.Scanner;

public class Act7_4_2_8 {
    
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        int[][] tablon = new int[8][8];
        int alfil = 1;
        int posicionX = 0;
        int posicionY = 0;


        System.out.print("Introduzca la posición X del alfil: ");
        posicionX = s.nextInt();
        System.out.print("Introduzca la posición Y del alfil: ");
        posicionY = s.nextInt();

        tablon[posicionY][posicionX] = alfil;

        // ARRIBA IZQUIERDA


        for (int n = 0; n < 6; n++){
            for (int i = 0; i < 10; i++){
                ;
            }
            System.out.println();
        }

        for (int n = 0; n < 6; n++){
            for (int i = 0; i < 10; i++){
            }
        }

    }
}
