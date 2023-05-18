package Actividades1;

import java.util.Scanner;
import java.lang.Thread;

public class Act7_4_2_3 {
    
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {

        int num[][] = new int[4][5];

        for (int n = 0; n < 4; n++){
            for (int i = 0; i < 5; i++){
                num[n][i] = (int)(Math.random()*899)+100;
            }
            System.out.println();
        }

        for (int n = 0; n < 4; n++){
            int suma1 = 0;
            Thread.sleep(1000);
            for (int i = 0; i < 5; i++){
                System.out.print("|" + num[n][i]);
                suma1 = suma1 + num[n][i];
            }
            Thread.sleep(1000);
            System.out.print("||" + suma1);
            System.out.println();
        }
        for (int n = 0; n < 5; n++){
            int suma2 = 0;
            for (int i = 0; i < 4; i++){
                suma2 = suma2 + num[i][n];
            }
            Thread.sleep(1000);
            System.out.print("|" + suma2);
        }
    }
}
