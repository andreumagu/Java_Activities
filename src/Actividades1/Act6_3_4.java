package Actividades1;

import java.util.Scanner;

public class Act6_3_4 {
    
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            int num = (int) (Math.random() * 11);
            System.out.print(num + " ");
        }
    }
}
