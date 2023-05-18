package Actividades1;

import java.util.Scanner;

public class Act3_4_13 {

    static Scanner s = new Scanner(System.in);
    public static void main(String[] args){

        System.out.print("Introduce la nota del primer examen: ");
        double nota1 = s.nextDouble();

        System.out.print("Introduce la nota media que quieres sacar en el trimestre: ");
        double notaTrimestre = s.nextDouble();

        double nota2 = (notaTrimestre - nota1 * 0.4) / 0.6;

        System.out.print("Para sacar un " + notaTrimestre + " debes sacar un " + nota2 + " en el segundo examen");
    }
}
