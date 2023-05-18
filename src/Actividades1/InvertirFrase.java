package Actividades1;

import java.util.Scanner;

public class InvertirFrase {
    
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        String frase;

        System.out.println("Introduce una frase:");
        frase = s.nextLine();

        System.out.println(invertirOracion(frase));



    }

    public static String invertirOracion(String oracion){
        String resultado = "";
        String[] lista = oracion.split(" ");
        for (int i = lista.length -1; i >= 0; i--){
            resultado += lista[i] + " ";
        }
        return resultado;
    }
}
