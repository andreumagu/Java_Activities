package Actividades1;

import java.util.Scanner;

public class Act7_4_4 {
    
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        int num[] = new int[20];
        int cuadrado[] = new int[20];
        int cubo[] = new int[20];

        for (int i = 0; i < 20; i++){
            num[i] = (int)(Math.random()*101);
            cuadrado[i] = num[i] * num[i];
            cubo[i] = num[i] * num[i] * num[i];
        }

        for (int n : num){
            System.out.print(n + ", ");
        }
        System.out.println();

        for (int n : cuadrado){
            System.out.print(n + ", ");
        }
        System.out.println();

        for (int n : cubo){
            System.out.print(n + ", ");
        }
        System.out.println();


    }
}
