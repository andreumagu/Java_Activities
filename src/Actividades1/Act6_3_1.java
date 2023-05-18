package Actividades1;

import java.util.Scanner;

public class Act6_3_1 {
    
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        int suma = 0;

        for (int i = 1; i <= 3; i++) {
            int dado = (int) (Math.random() * 6) + 1;
            System.out.println(dado);
            suma = suma + dado;
        }

        System.out.println(suma);
    }
}
