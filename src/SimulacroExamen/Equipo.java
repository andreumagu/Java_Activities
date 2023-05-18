package SimulacroExamen;

import java.util.ArrayList;
import java.util.Scanner;

public class Equipo {

    static Scanner s = new Scanner(System.in);
    
    //VARIABLES
    String nombre;
    ArrayList<Jugador> listaJug = new ArrayList<>();

    //CONTRUCTORES
    Equipo(){}

    Equipo(String n, ArrayList<Jugador> list){
        this.nombre = n;
        this.listaJug = list;
    }

    //GETTER
    String getNombre(){
        return this.nombre;
    }

    ArrayList<Jugador> getListaJug(){
        return this.listaJug;
    }

    //SETTER
    void setNombre(String n){
        this.nombre = n;
    }

    void setListaJug(ArrayList<Jugador> j){
        this.listaJug = j;
    }

    //METODOS
    public static int buscarEquipo(ArrayList<Equipo> listaEq){
        String nombre = s.nextLine();
        int num = -1;

        for (int i = 0; i < listaEq.size(); i++) {
            if (listaEq.get(i).nombre.equals(nombre)) {
                num = i;
                break;
            }
        }

        return num;
    }

    public static void añadirEquipo(ArrayList<Equipo> listaEq, ArrayList<Integer> listaPunt){
        String nombre = s.nextLine();
        ArrayList<Jugador> listaJug = new ArrayList<>();
        Equipo equipo = new Equipo(nombre, listaJug);
        listaEq.add(equipo);
        listaPunt.add(0);
    }

    public static void eliminarEquipo(ArrayList<Equipo> listaEq, ArrayList<Integer> listaPunt){
        int num = 0;
        System.out.print("Introduce el nombre del equipo: ");
        String nombre = s.nextLine();

        for (int i = 0; i < listaEq.size(); i++) {
            if (listaEq.get(i).nombre.equals(nombre)) {
                num = i;
                break;
            }
        }

        if (listaPunt.get(num) == 0) {
            listaEq.remove(num);
            listaPunt.remove(num);
        }else { 
            System.out.println("El equipo no se puede borrar. Tiene más de 0 puntos.");
        }
    }


    @Override
    public String toString() {
        return "\nEquipo{" +
                "Nombre='" + nombre + '\'' +
                ", Lista Jugadores=" + listaJug +
                ", Puntuación=";
    }
}


