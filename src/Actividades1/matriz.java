package Actividades1;

import java.util.Scanner;

public class matriz {
    
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        int alto;
        int ancho;

        System.out.print("Indique el ancho de la matriz");
        ancho = s.nextInt();

        System.out.print("Indique el alto de la matriz");
        alto = s.nextInt();

        int num[][] = new int[alto][ancho];

        num = generarMatriz(alto, ancho, num);
        pintarMatriz(alto, ancho,num);

        System.out.print("La suma total de los elementos de la matriz es: " + sumaMatriz(alto, ancho, num));


    }

    public static Integer sumaMatriz(int ejeX, int ejeY, int[][] tabla){
        int suma = 0;
        for (int n = 0; n < ejeX; n++){
            for (int i = 0; i < ejeY; i++){
                suma += tabla[n][i];
            }
        }
        return suma;
    }

    public static int[][] generarMatriz(int ejeX, int ejeY, int[][] tabla){
        for (int n = 0; n < ejeX; n++){
            for (int i = 0; i < ejeY; i++){
                tabla[n][i] = (int)(Math.random()*10)+1;
            }
        }
        return tabla;
    }

    public static void pintarMatriz(int ejeX, int ejeY, int[][] tabla){
        for (int n = 0; n < ejeX; n++){
            for (int i = 0; i < ejeY; i++){
                System.out.print("|" + tabla[n][i]);
            }
            System.out.println();
        }
    }
}
