package Actividades1;

import java.util.Scanner;

public class Act7_4_2_1 {
    
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        int num[][] = new int[3][6];

        num[0][0] = 0;
        num[0][1] = 30;
        num[0][2] = 2;
        num[0][5] = 5;
        num[1][0] = 75;
        num[1][4] = 0;
        num[2][2] = -2;
        num[2][3] = 9;
        num[2][5] = 11;


        for (int n = 0; n < 3; n++){
            for (int i = 0; i < 6; i++){
                System.out.print("|" + num[n][i]);
            }
            System.out.println();
        }
    }
}
