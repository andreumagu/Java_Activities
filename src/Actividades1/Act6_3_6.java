package Actividades1;

import java.util.Scanner;

public class Act6_3_6 {
    
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        int numRandom = (int)(Math.random()*11);
        System.out.println(numRandom);

        System.out.print("Adivina el número: ");
        int num = s.nextInt();

        for (int i = 0; i < 4; i++) {
            if (num != numRandom){
                System.out.print("Intentalo de nuevo: ");
                num = s.nextInt();
            }else {
                System.out.print("¡Muy bien!");
            }

        }
    }
}
