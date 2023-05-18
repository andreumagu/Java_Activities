package Actividades1;

import java.util.Scanner;

public class Act6_3_5 {
    
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {
            int num = (int) (Math.random() * 100) + 100;
            System.out.print(num + " ");
        }
    }
}
