package Actividades1;

import java.util.Scanner;

public class Act6_3_2 {
    
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        int carta;
        int palo;

        carta = (int) (Math.random() * 13) + 1;

        String rCarta = String.valueOf(carta);

        if (rCarta.equals("1")){
            rCarta = "A";
            System.out.print(rCarta);
        } else if (rCarta.equals("11")) {
            rCarta = "J";
            System.out.print(rCarta);
        } else if (rCarta.equals("12")) {
            rCarta = "Q";
            System.out.print(rCarta);
        } else if (rCarta.equals("13")) {
            rCarta = "K";
            System.out.print(rCarta);
        } else {
            System.out.print(rCarta);
        }

        palo = (int) (Math.random() * 4) + 1;



        String rPalo = String.valueOf(palo);

        switch (rPalo){
            case "1":
                rPalo = "Pica";
                System.out.print(" de " + rPalo);
                break;
            case "2":
                rPalo = "Corazones";
                System.out.print(" de " + rPalo);
                break;
            case "3":
                rPalo = "Diamantes";
                System.out.print(" de " + rPalo);
                break;
            case "4":
                rPalo = "Tréboles";
                System.out.print(" de " + rPalo);
                break;
        }
    }
}
