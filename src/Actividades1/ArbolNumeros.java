package Actividades1;

import java.util.Scanner;

public class ArbolNumeros {
    
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Introduce un numero:");
        int num = s.nextInt();
        System.out.println();
        System.out.println();
        System.out.println();

        int nume = num;

        for (int i = 1; i <= num; i++) {

            nume -= 1;
            
            for (int e = nume; e > 0; e--){
                System.out.print(" ");
            }

            for (int y = 1; y < i ; y++) {
                System.out.print(y);
            }

            System.out.print(i);

            for (int x = i-1; x >= 1; x--) {
                System.out.print(x);
            }
            System.out.println();
        }

    }
}
