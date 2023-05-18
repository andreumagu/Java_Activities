package Actividades1;

import java.util.Scanner;

public class Act7_4_5 {
    
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        int num[] = new int[10];
        int numMax = 0;
        int numMin = 0;

        System.out.println("Introduce 10 números: ");

        for (int i = 0; i < 10; i++){
            num[i] = s.nextInt();
        }

        for (int i = 0; i < 10; i++){
            if (i == 0){
                numMax = num[i];
                numMin = num[i];
            }else {
                if (num[i] > numMax){
                    numMax = num[i];
                }
                if (num[i] < numMin){
                    numMin = num[i];
                }
            }
        }

        for (int n : num){
            System.out.print(n);
            if (n == numMax){
                System.out.print(" Maximo");
            }
            if (n == numMin){
                System.out.print(" Minimo");
            }
            System.out.print(", ");

        }

    }
}
