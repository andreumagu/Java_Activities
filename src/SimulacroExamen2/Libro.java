package SimulacroExamen2;

import java.util.ArrayList;
import java.util.Scanner;

public class Libro {
    
    static Scanner s = new Scanner(System.in);

    //VARIABLES
    String isbn;
    String titulo;
    String autor;
    String editorial;
    Integer nCopias;
    Integer nCopiasDisp;

    //CONTRUCTORES
    Libro(){}

    Libro(String isbn, String titulo, String autor, String editorial, Integer nCopias, Integer nCopiasDisp){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.nCopias = nCopias;
        this.nCopiasDisp = nCopiasDisp;
    }


    //GETTER
    String getIsbn(){
        return this.isbn;
    }

    String getTitulo(){
        return this.titulo;
    }

    String getAutor(){
        return this.autor;
    }

    String getEditorial(){
        return this.editorial;
    }

    Integer getNCopias(){
        return this.nCopias;
    }

    Integer getNCopiasDisp(){
        return this.nCopiasDisp;
    }

    //SETTER
    void setIsbn(String isbn){
        this.isbn = isbn;
    }

    void setTitulo(String titulo){
        this.titulo = titulo;
    }

    void setAutor(String autor){
        this.autor = autor;
    }

    void setEditorial(String editorial){
        this.editorial = editorial;
    }

    void setNCopias(Integer nCopias){
        this.nCopias = nCopias;
    }

    void setNCopiasDisp(Integer nCopiasDisp){
        this.nCopiasDisp = nCopiasDisp;
    }

    
    //METODOS

    void contador(ArrayList<Libro> listaLibros, String titulo){
        for (int i = 0; i < listaLibros.size(); i++) {
            if (listaLibros.get(i).titulo.equals(titulo)) {
                System.out.println("1");
                break;
            }
        }
    }

    public static void añadirLibro(ArrayList<Libro> listaLibros){
        System.out.println("Introduce el ISBN: ");
        String isbn = s.nextLine();
        System.out.println("Introduce el Titulo: ");
        String titulo = s.nextLine();
        System.out.println("Introduce el autor: ");
        String autor = s.nextLine();
        System.out.println("Introduce el editorial: ");
        String editorial = s.nextLine();
        System.out.println("Introduce el Número de Copias total: ");
        Integer nCopias = s.nextInt();
        System.out.println("Introduce el Número de Copias Disponibles: ");
        Integer nCopiasDisp = s.nextInt();

        Libro libro = new Libro(isbn, titulo, autor, editorial, nCopias, nCopiasDisp);
        listaLibros.add(libro);
    }

    public static void eliminarLibro(ArrayList<Libro> listaLibros){
        System.out.println("Introduce el nombre del libro que quieres eliminar: ");
        String titulo = s.nextLine();
        for (int i = 0; i < listaLibros.size(); i++) {
            if (listaLibros.get(i).titulo.equals(titulo)) {
                listaLibros.remove(i);
                break;
            }
        }
    }

    public static int buscarLibroIsbn(ArrayList<Libro> listaLibros){
        System.out.println("Introduce el ISBN del libro que quieres buscar: ");
        String lIsbn = s.nextLine();
        int num = -1;

        for (int i = 0; i < listaLibros.size(); i++) {
            if (listaLibros.get(i).isbn.equals(lIsbn)) {
                num = i;
                break;
            }
        }

        return num;
    }

    public static void buscarLibroTitulo(ArrayList<Libro> listaLibros){
        System.out.println("Introduce el Titulo del libro que quieres buscar: ");
        String titulo = s.nextLine();

        for (int i = 0; i < listaLibros.size(); i++) {
            if (listaLibros.get(i).titulo.contains(titulo)) {
                System.out.println(listaLibros.get(i));
            }
        }
    }

    @Override
    public String toString(){
        return "Titutlo: " + titulo + " ISBN: " + isbn + " Autor: " + autor + " Editorial: " + editorial + " Numero Copias: " + nCopias + " Numero Copias disponibles: " + nCopiasDisp;
    }

}

