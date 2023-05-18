package Actividades1;

import java.util.Scanner;

public class Act7_4_3 {
    
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int num[] = new int[10];

        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;
        num[5] = 6;
        num[6] = 7;
        num[7] = 8;
        num[8] = 9;
        num[9] = 10;



        for (int n = 9; n >= 0; n--){
            System.out.print(num[n] + ", ");
        }
        System.out.println();

    }
}
