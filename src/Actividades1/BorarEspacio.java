package Actividades1;

import java.util.Scanner;

public class BorarEspacio {
    
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {        
        System.out.println("Introduzca una frase");
        String frase = s.nextLine();

        eliminarEspacios(frase);
    }

    public static void eliminarEspacios(String oracion){
        char[] lista = oracion.toCharArray();
        for (int i = 0; i < lista.length; i++){
            if (lista[i] == ' ') {
                continue;
            }else {
                System.out.print(lista[i]);
            }
            
        }
    }
}