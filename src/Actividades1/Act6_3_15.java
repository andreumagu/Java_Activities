package Actividades1;

import java.util.Scanner;

public class Act6_3_15 {
    
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        int numNotas = (int)(Math.random()*24)+4;
        int ultimaNota = 0;

        for (int i = (numNotas)%4; i != 0;){
            numNotas = (int)(Math.random()*24)+4;
            i = (numNotas)%4;
        }

        for (int i = 1; i <= numNotas; i++){
            int numRandom1 = (int)(Math.random()*7)+1;

            if (i == 1){
                ultimaNota = numRandom1;
            }

            if (i == numNotas){
                numRandom1 = ultimaNota;
            }

            switch (numRandom1) {
                case 1 -> System.out.print("do ");
                case 2 -> System.out.print("re ");
                case 3 -> System.out.print("mi ");
                case 4 -> System.out.print("fa ");
                case 5 -> System.out.print("sol ");
                case 6 -> System.out.print("la ");
                case 7 -> System.out.print("si ");
            }

            if ((i)%4 == 0){
                System.out.print("| ");
            }
        }
        System.out.print("|");


    }
}
