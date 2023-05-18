package Actividades1;

import java.util.Scanner;

public class Palabra {
    
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        String frase;

        System.out.println("Introduce una frase:");
        frase = s.nextLine();
        System.out.println("Elige una palabra de la frase:");
        String palabra = s.next();

        System.out.println(convertiMayus(frase, palabra));



    }

    public static String convertiMayus(String oracion, String word){
        String resultado = "";
        String[] lista = oracion.split(" ");
        for (int i = 0; i < lista.length; i++){
            if (lista[i].equals(word)){
                lista[i] = lista[i].toUpperCase();
            }
            resultado += lista[i] + " ";
        }
        return resultado;
    }
}
