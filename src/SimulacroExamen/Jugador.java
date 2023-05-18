package SimulacroExamen;

import java.util.Scanner;

public class Jugador {

    static Scanner s = new Scanner(System.in);

    //ATRIBUTOS
    String nombre;

    //CONSTRUCTORES
    Jugador(){}

    Jugador(String n){
        this.nombre = n;
    }

    //GETTER
    String getNombre(){
        return nombre;
    }

    //SETTER
    void setNombre(String nombre){
        this.nombre = nombre;
    }

    //METODOS
    public static void añadirJugador(Equipo equipo){
        System.out.print("Introduce el nombre del jugador: ");
        String nombre = s.nextLine();
        Jugador jugador = new Jugador(nombre);
        equipo.listaJug.add(jugador);
    }

    public static int buscarJugador(Equipo equipo){
        System.out.print("Introduce el nombre del jugador: ");
        String nombre = s.nextLine();
        int num = -1;

        for (int i = 0; i < equipo.listaJug.size(); i++) {
            if (equipo.listaJug.get(i).nombre.equals(nombre)) {
                num = i;
                break;
            }
        }
        return num;
    }

    public static void eliminarJugador(Equipo equipo){
        System.out.print("Introduce el nombre del jugador: ");
        String nombre = s.nextLine();

        for (int i = 0; i < equipo.listaJug.size(); i++) {
            if (equipo.listaJug.get(i).nombre.equals(nombre)) {
                equipo.listaJug.remove(i);
                break;
            }
        }
    }

}

