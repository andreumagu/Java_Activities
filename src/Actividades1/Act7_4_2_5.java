package Actividades1;

import java.util.Scanner;

public class Act7_4_2_5 {
    
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        int[][] num = new int[6][10];
        int numMax = 0;
        int numMin = 0;
        int posMaxX = 0;
        int posMinX = 0;
        int posMaxY = 0;
        int posMinY = 0;


        for (int n = 0; n < 6; n++){
            for (int i = 0; i < 10; i++){
                num[n][i] = (int)(Math.random()*1001);
            }
            System.out.println();
        }

        for (int n = 0; n < 6; n++){
            for (int i = 0; i < 10; i++){
                if (i == 0){
                    numMax = num[n][i];
                    numMin = num[n][i];
                }else {
                    if (num[n][i] > numMax){
                        numMax = num[n][i];
                        posMaxX = i;
                        posMaxY = n;
                    }
                    if (num[n][i] < numMin){
                        numMin = num[n][i];
                        posMinX = i;
                        posMinY = n;
                    }
                }
            }
        }
        System.out.println("El número máximo es el " + numMax + " y su posición es: x = " + posMaxX + " y = " + posMaxY);
        System.out.println("El número mínimo es el " + numMin + " y su posición es: x = " + posMinX + " y = " + posMinY);
    }
}
