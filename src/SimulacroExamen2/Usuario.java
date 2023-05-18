package SimulacroExamen2;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
    static Scanner s = new Scanner(System.in);

    //VARIABLES
    String nombre;
    String apellidos;
    String nif;
    String contrasena;
    ArrayList<Libro> librosReservados  = new ArrayList<>();

    //CONTRUCTORES
    Usuario(){}

    Usuario(String nombre, String apellidos, String nif, String contrasena, ArrayList<Libro> librosReservados){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
        this.contrasena = contrasena;
        this.librosReservados = librosReservados;
    }

    //GETTER
    String getNombre(){
        return this.nombre;
    }

    String getApellidos(){
        return this.apellidos;
    }

    String getNif(){
        return this.nif;
    }

    String getContrasena(){
        return this.contrasena;
    }

    ArrayList<Libro> getLibrosReservados(){
        return this.librosReservados;
    }


    //SETTER
    void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    void setNif(String nif){
        this.nif = nif;
    }

    void setContrasena(String contrasena){
        if (contrasena.length() >= 8) {
            this.contrasena = contrasena;
        }else {
            System.out.println("La contraseña debe tener al menos 8 caracteres");
        }
        
    }

    void setLibrosReservados(ArrayList<Libro> librosReservados){
        this.librosReservados = librosReservados;
    }

    //METODOS

    public static void anadirUsuario(ArrayList<Usuario> listaUsuarios){
        System.out.println("Introduce el nombre: ");
        String nombre = s.nextLine();
        System.out.println("Introduce el apellidos: ");
        String apellidos = s.nextLine();
        System.out.println("Introduce el NIF: ");
        String nif = s.nextLine();
        System.out.println("Introduce el contraseña: ");
        String contrasena = s.nextLine();
        ArrayList<Libro> librosReservados = new ArrayList<>();
        Usuario usuario = new Usuario(nombre, apellidos, nif, contrasena, librosReservados);
        listaUsuarios.add(usuario);
    }

    public static void elimnarUsuario(ArrayList<Usuario> listaPersonal) {
        System.out.println("Introduce el nombre: ");
        String nombre = s.nextLine();
        for (int i = 0; i < listaPersonal.size(); i++) {
            if (listaPersonal.get(i).nombre.equals(nombre)) {
                listaPersonal.remove(i);
                break;
            }
        }
    }

    public static void reservarLibro(Usuario usuario, Biblioteca biblioteca) {
        if (usuario.librosReservados.size() <= 5) {
            System.out.println("Que libro queres reservar?:");
            Biblioteca.mostrarLibrosDisp(biblioteca);
            System.out.print("Introduce la posicion del libro: ");
            int pos = s.nextInt();
            biblioteca.listaLibro.get(pos).nCopiasDisp -=1;
            usuario.librosReservados.add(biblioteca.listaLibro.get(pos));
        } else {
            System.out.println("Tienes " + usuario.librosReservados.size() + " libros reservados, debes devolver un libro para poder reservar otro.");
            devolverLibro(usuario, biblioteca);
        }
        
    }

    public static void devolverLibro(Usuario usuario, Biblioteca biblioteca){
        for (int i = 0; i < usuario.librosReservados.size(); i++) {
            System.out.println(" - " + " - " + usuario.librosReservados.get(i));
        }
        System.out.println("Introduce la posición del libro que quieres devolver: ");
        int pos = s.nextInt();
        for (int i = 0; i < biblioteca.listaLibro.size(); i++) {
            if (biblioteca.listaLibro.get(i).titulo.equals(usuario.librosReservados.get(pos).titulo)) {
                biblioteca.listaLibro.get(i).nCopiasDisp +=1;
                break;
            }
        }
        usuario.librosReservados.remove(biblioteca.listaLibro.get(pos));
    }
}
