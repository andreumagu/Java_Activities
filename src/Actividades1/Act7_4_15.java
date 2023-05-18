package Actividades1;

import java.util.Scanner;

public class Act7_4_15 {
    
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        int mesas[] = new int[10];
        int personas = 0;

        for (int n = 0; n < 10; n++){
            mesas[n] = (int)(Math.random()*5);
        }

        while (personas != -1){

            boolean asigando = false;

            for (int n = 1; n < 11; n++){
                System.out.print(" | " + n);
            }
            System.out.print(" | ");
            System.out.println();

            for (int n = 0; n < 10; n++){
                System.out.print(" | " + mesas[n]);
            }
            System.out.print(" | ");
            System.out.println();

            System.out.println("¿Cuántos son? (Introduzca -1 para salir del programa): ");
            personas = s.nextInt();

            if (personas < 5) {
                for (int n = 0; n < 10; n++){
                    if (mesas[n] == 0){
                        mesas[n] = personas;
                        asigando = true;
                        break;
                    }
                }
    
                if (asigando == false){
                    for (int n = 0; n < 10; n++){
                        if (mesas[n] + personas <= 4){
                            mesas[n] = mesas[n] + personas;
                            asigando = true;
                            break;
                        }
                    }
                }
            }else {
                System.out.println("Los grupos deben ser de 4 personas como máximo");
            }

            

        }

    }
}
