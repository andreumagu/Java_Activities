package Actividades1;

import java.util.Scanner;

public class Act7_4_2_2 {
    
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        int num[][] = new int[4][5];

        for (int n = 0; n < 4; n++){
            for (int i = 0; i < 5; i++){
                System.out.print("Introduzca un número: ");
                num[n][i] = s.nextInt();
            }
            System.out.println();
        }

        for (int n = 0; n < 4; n++){
            int suma1 = 0;
            for (int i = 0; i < 5; i++){
                System.out.print("|" + num[n][i]);
                suma1 = suma1 + num[n][i];
            }
            System.out.print("||" + suma1);
            System.out.println();
        }
        for (int n = 0; n < 5; n++){
            int suma2 = 0;
            for (int i = 0; i < 4; i++){
                suma2 = suma2 + num[i][n];
            }
            System.out.print("|" + suma2);
        }
    }
}
