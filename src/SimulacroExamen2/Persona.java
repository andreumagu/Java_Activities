package SimulacroExamen2;

import java.util.ArrayList;
import java.util.Scanner;

public class Persona {
    static Scanner s = new Scanner(System.in);

    //VARIABLES
    String nombre;
    String apellidos;
    String nif;
    String contrasena;

    //CONTRUCTORES
    Persona(){}

    Persona(String nombre, String apellidos, String nif, String contrasena){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
        this.contrasena = contrasena;
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

    //METODOS

    public static void anadirPersona(ArrayList<Persona> listaPersonal){
        System.out.println("Introduce el nombre: ");
        String nombre = s.nextLine();
        System.out.println("Introduce el apellidos: ");
        String apellidos = s.nextLine();
        System.out.println("Introduce el NIF: ");
        String nif = s.nextLine();
        System.out.println("Introduce el contraseña: ");
        String contrasena = s.nextLine();
        Persona persona = new Persona(nombre, apellidos, nif, contrasena);
        listaPersonal.add(persona);
    }

    public static void eliminarPersona(ArrayList<Persona> listaPersonal) {
        System.out.println("Introduce el nombre: ");
        String nombre = s.nextLine();
        for (int i = 0; i < listaPersonal.size(); i++) {
            if (listaPersonal.get(i).nombre.equals(nombre)) {
                listaPersonal.remove(i);
                break;
            }
        }
    }
}
