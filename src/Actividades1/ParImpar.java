package Actividades1;

import java.util.Scanner;

public class ParImpar {
    
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        int[] numAleatirio = new int[20];
        int[] vacio = new int[20];
        int c = 0;

        for (int i = 0; i < numAleatirio.length ; i++){
            numAleatirio[i] =+ (int)(Math.random()*101);
            if (numAleatirio[i] % 2 == 0) {
                vacio[c] += numAleatirio[i];
                c += 1;
            }
        }

        for (int i = 0; i < numAleatirio.length ; i++){
            if (numAleatirio[i] % 2 == 1) {
                vacio[c] += numAleatirio[i];
                c += 1;
            }
        }

        for (int i = 0; i < vacio.length ; i++){
            System.out.print(vacio[i] + " ");
        }        

    }
}