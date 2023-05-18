package Actividades1;

import java.util.Scanner;

public class AdivinaPalabla {
    
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        String palabra = "";
        String adivina = "";
        Boolean ok = false;

        System.out.print("Escribe una palabra: ");
        palabra = s.next();
        System.out.println();

        for (int i = 0; i < 3; i++){
            System.out.print("Intenta adivinar la palabra: ");
            adivina = s.next();
            System.out.println();
            if (adivina.equals(palabra)) {
                System.out.println("¡Muy bien, has adivinado la palabra!");
                ok = true;
                break;
            }
        }
        if (ok == false) {
            System.out.println("Lo siento, la palabra era = " + palabra);

        }

        

    }
}