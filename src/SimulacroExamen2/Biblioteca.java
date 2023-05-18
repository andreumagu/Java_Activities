package SimulacroExamen2;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

    static Scanner s = new Scanner(System.in);

    //VARIABLES
    String nombre;
    ArrayList<Libro> listaLibro = new ArrayList<>();
    ArrayList<Persona> listaPersonal = new ArrayList<>();
    ArrayList<Usuario> listaUsuario  = new ArrayList<>();

    //CONTRUCTORES
    Biblioteca(){}

    Biblioteca(String nombre, ArrayList<Libro> listaLibro, ArrayList<Persona> listaPersonal, ArrayList<Usuario> listaUsuario){
        this.nombre = nombre;
        this.listaLibro = listaLibro;
        this.listaPersonal = listaPersonal;
        this.listaUsuario = listaUsuario;
    }

    //GETTER
    String getNombre(){
        return this.nombre;
    }

    ArrayList<Libro> getListaLibro(){
        return this.listaLibro;
    }

    ArrayList<Persona> getListaPersonal(){
        return this.listaPersonal;
    }

    ArrayList<Usuario> getListaUsuario(){
        return this.listaUsuario;
    }


    //SETTER
    void setNombre(String nombre){
        this.nombre = nombre;
    }

    void setListaLibro(ArrayList<Libro> listaLibro){
        this.listaLibro = listaLibro;
    }

    void setListaPersonal(ArrayList<Persona> listaPersonal){
        this.listaPersonal = listaPersonal;
    }

    void setListaUsuario(ArrayList<Usuario> listaUsuario){
        this.listaUsuario = listaUsuario;
    }

    //METODOS
    public static void mostrarLibros(Biblioteca biblioteca){
        for (int i = 0; i < biblioteca.listaLibro.size(); i++) {
            System.out.println(" - " + biblioteca.listaLibro.get(i));
        }
    }

    public static void mostrarLibrosDisp(Biblioteca biblioteca){
        for (int i = 0; i < biblioteca.listaLibro.size(); i++) {
            if (biblioteca.listaLibro.get(i).nCopiasDisp > 0) {
                System.out.println(" - " + i + " - " + biblioteca.listaLibro.get(i));
            }
        }
    }

    
}
