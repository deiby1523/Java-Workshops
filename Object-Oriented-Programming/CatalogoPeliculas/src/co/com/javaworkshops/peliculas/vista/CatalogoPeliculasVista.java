package co.com.javaworkshops.peliculas.vista;

import co.com.javaworkshops.peliculas.negocio.CatalogoPeliculas;
import co.com.javaworkshops.peliculas.negocio.CatalogoPeliculasImpl;

import java.util.Scanner;

public class CatalogoPeliculasVista {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        byte opcion = 0;
        CatalogoPeliculas catalogo = new CatalogoPeliculasImpl();

        do {
            System.out.println("\n\nElige una opcion: \n" +
                    "1. Iniciar un nuevo catalogo de peliculas \n" +
                    "2. Agregar Pelicula \n" +
                    "3. Listar Peliculas \n" +
                    "4. Buscar Pelicula \n" +
                    "0. Salir");

            opcion = entrada.nextByte();entrada.nextLine();

            switch (opcion) {
                case 1 :
                    System.out.println("Ingrese el nombre del catalogo: ");
                    catalogo.iniciarCatalogoPeliculas(entrada.nextLine());
                    break;
                case 2 :
                    System.out.println("Ingrese el nombre del catalogo: ");
                    String nomcat = entrada.nextLine();
                    System.out.println("Ingrese el nombre de la pelicula: ");
                    String nompel = entrada.nextLine();
                    catalogo.agregarPelicula(nomcat,nompel);
                    break;
                case 3 :
                    System.out.println("Ingrese el nombre del catalogo a listar: ");
                    catalogo.listarPeliculas(entrada.nextLine());
                    break;
                case 4 :
                    System.out.println("Ingrese el nombre del catalogo donde desea buscar: ");
                    String nomcat2 = entrada.nextLine();
                    System.out.println("Busqueda: ");
                    String busqueda = entrada.nextLine();
                    catalogo.buscarPelicula(nomcat2,busqueda);
                    break;
                case 0 :
                    System.out.println("Saliendo del programa...");
                default :
                    System.out.println("Opcion Incorrecta");
                    break;
            }


        } while (opcion != 0);


    }
}
