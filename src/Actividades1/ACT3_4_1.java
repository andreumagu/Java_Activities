package Actividades1;

import java.util.Scanner;
public class ACT3_4_1 {

    static Scanner s = new Scanner(System.in);
    public static void main(String[] args){

        System.out.print("Introduce 3 números: ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();

        System.out.print("El resultado de la multiplicación es: " + (num1 * num2 * num3));
    }
}
