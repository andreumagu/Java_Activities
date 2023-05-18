package SimulacroExamen;

import java.util.ArrayList;
import java.util.Scanner;

public class Liga {

    static Scanner s = new Scanner(System.in);

    //VARIABLES INSTANCIADAS
    static ArrayList<Equipo> listaEq = new ArrayList<>();
    static ArrayList<Integer> listaPunt = new ArrayList<>();
    
    //METODOS
    public static void verClasificacion(){
        int cont = 0;
        for (Equipo item : listaEq) {
            System.out.print(item);
            System.out.print(listaPunt.get(listaEq.indexOf(item)) + '}');
            System.out.println("---->" + cont);
            cont++;
        }
    }
    

    public static void cambiarPuntuacion(Equipo equipo, int puntuacion){
        if (puntuacion >= 0) {
            listaPunt.set(listaEq.indexOf(equipo), puntuacion);
        } else{
            System.out.println("La puntuación debe ser igual o mayor a 0");
        }

    }

    public static void main(String[] args) {

        int key = 0;

        while (key < 9) {
            System.out.println("1. Ver Clasifcación.");
            System.out.println("2. Cambiar Puntuación de un equipo");
            System.out.println("3. Añadir Equipo.");
            System.out.println("4. Eliminar Equipo");
            System.out.println("5. Añadir Jugador a un equipo");
            System.out.println("6. Eliminar Jugador en un equipo");
            System.out.println("7. Buscar Equipo");
            System.out.println("8. Buscar Jugador");


            key = s.nextInt();
            
            switch (key){
                case 1:
                    verClasificacion();
                    break;
            
                case 2:
                    verClasificacion();
                    System.out.println("Introduce el nombre del equipo al que quieres cambiar la puntiación: ");
                    int posequipo2 = s.nextInt();
                    System.out.println("Introduce la puntiación que quieres asignar: ");
                    int points = s.nextInt();
                    cambiarPuntuacion(listaEq.get(posequipo2), points);
                    break;

                case 3:
                    Equipo.añadirEquipo(listaEq, listaPunt);
                    break;

                case 4:
                    Equipo.eliminarEquipo(listaEq, listaPunt);
                    break;

                case 5:
                    verClasificacion();
                    System.out.println("Introduce numero del equipo en el que quieres meter un nuevo Jugador?: ");
                    int posequipo1 = s.nextInt();
                    Jugador.añadirJugador(listaEq.get(posequipo1));
                    break;
                
                case 6:
                    verClasificacion();
                    System.out.println("Introduce numero del equipo en el que quieres eliminar un Jugador?: ");
                    int posequipo3 = s.nextInt();
                    Jugador.eliminarJugador(listaEq.get(posequipo3));
                    break;

                case 7:
                    System.out.println("La posión del equipo es: " + Equipo.buscarEquipo(listaEq));
                    break;

                case 8:
                    verClasificacion();
                    System.out.println("Introduce numero del equipo en el que quieres buscar un Jugador?: ");
                    int posequipo = s.nextInt();
                    Jugador.buscarJugador(listaEq.get(posequipo));
                    break;

                default:
                    break;
            }
        }
    }


}