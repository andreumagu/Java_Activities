package SimulacroExamen2;

import java.util.Scanner;

public class app {

    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        
        Biblioteca biblioteca = new Biblioteca();
        Libro libro1 = new Libro("8768JHE", "Quijote", "Miguel", "Santiyana", 4, 4);
        Libro libro2 = new Libro("6423FNE", "Ratatui", "Juanjo", "Laya", 3, 3);
        Libro libro3 = new Libro("6745GTH", "Afteryu", "Julia", "Lomar", 2, 2);
        biblioteca.listaLibro.add(libro1);
        biblioteca.listaLibro.add(libro2);
        biblioteca.listaLibro.add(libro3);

        int key = 0;

        while (key < 99) {
            System.out.println("1. Mostrar Libros.");
            System.out.println("2. mostrarLibrosDisp");
            System.out.println("3. añadirLibro");
            System.out.println("4. eliminarLibro");
            System.out.println("5. buscarLibroIsbn");
            System.out.println("6. buscarLibroTitulo");
            System.out.println("7. anadirPersona");
            System.out.println("8. eliminarPersona");
            System.out.println("9. anadirUsuario");
            System.out.println("10. elimnarUsuario");
            System.out.println("11. reservarLibro");
            System.out.println("12. devolverLibro");


            key = s.nextInt();
            
            switch (key){
                case 1:
                    Biblioteca.mostrarLibros(biblioteca);
                    break;
            
                case 2:
                    Biblioteca.mostrarLibrosDisp(biblioteca);
                    break;

                case 3:
                    Libro.añadirLibro(biblioteca.listaLibro);
                    break;

                case 4:
                    Libro.eliminarLibro(biblioteca.listaLibro);
                    break;

                case 5:
                    System.out.println(Libro.buscarLibroIsbn(biblioteca.listaLibro));
                    
                    break;
                
                case 6:
                    Libro.buscarLibroTitulo(biblioteca.listaLibro);
                    break;

                case 7:
                    Persona.anadirPersona(biblioteca.listaPersonal);
                    break;

                case 8:
                    Persona.eliminarPersona(biblioteca.listaPersonal);
                    break;

                case 9:
                    Usuario.anadirUsuario(biblioteca.listaUsuario);
                    break;

                case 10:
                    Usuario.elimnarUsuario(biblioteca.listaUsuario);
                    break;

                case 11:
                    for (int i = 0; i < biblioteca.listaUsuario.size(); i++) {
                        System.out.println(" - " + i + " - " + biblioteca.listaUsuario.get(i).nombre);
                    }
                    System.out.println("Introduce la posicion del usuario que va ha reservar un libro: ");
                    int pos = s.nextInt();
                    Usuario usuario = biblioteca.listaUsuario.get(pos);
                    Usuario.reservarLibro(usuario ,biblioteca);
                    break;

                case 12:
                    for (int i = 0; i < biblioteca.listaUsuario.size(); i++) {
                        System.out.println(" - " + i + " - " + biblioteca.listaUsuario.get(i).nombre);
                    }
                    System.out.println("Introduce la posicion del usuario que va ha reservar un libro: ");
                    int posi = s.nextInt();
                    Usuario usuario1 = biblioteca.listaUsuario.get(posi);
                    Usuario.devolverLibro(usuario1, biblioteca);
                    break;

                default:
                    break;
            }
        }
    }
}
