package Actividades1;

import java.util.Scanner;

public class Espejo {
    
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {        
        System.out.println("Introduzca una palabra");
        String palabra = s.nextLine();

        convertirEspejo(palabra);
    }

    public static void convertirEspejo(String word){
        System.out.print(word);
        for (int i = word.length() - 1; i >= 0  ; i--) {
            System.out.print(word.charAt(i));
        }
        System.out.println();
    }
}