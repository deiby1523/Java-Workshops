package co.com.javaworkshops.peliculas.negocio;

import co.com.javaworkshops.peliculas.datos.AccesoDatos;
import co.com.javaworkshops.peliculas.datos.AccesoDatosImpl;
import co.com.javaworkshops.peliculas.domain.Pelicula;
import co.com.javaworkshops.peliculas.excepciones.AccesoDatosEx;
import co.com.javaworkshops.peliculas.excepciones.LecturaDatosEx;

import java.util.List;

public class CatalogoPeliculasImpl implements CatalogoPeliculas {
    private final AccesoDatos datos;

    public CatalogoPeliculasImpl() {
        this.datos = new AccesoDatosImpl();
    }

    @Override
    public void agregarPelicula(String nombreCatalogo, String nombrePelicula) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        try {
            boolean anexar = false;
            if (datos.existe(nombreCatalogo)) {
                anexar = true;
            } else {
                this.iniciarCatalogoPeliculas(nombreCatalogo);
            }
            datos.escribir(pelicula, nombreCatalogo, anexar);
        } catch (AccesoDatosEx e) {
            System.out.println("Error de acceso a datos: " + e.getMessage());
        }
    }

    @Override
    public void listarPeliculas(String nombreCatalogo) {
        List<Pelicula> peliculas = null;
        try {
            peliculas = datos.listar(nombreCatalogo);
            for (Pelicula pelicula : peliculas) {
                System.out.println("- " + pelicula.getNombre());
            }
        } catch (LecturaDatosEx e) {
            System.out.println("Error de acceso a datos: " + e.getMessage());
        }

    }

    @Override
    public void buscarPelicula(String nombreCatalogo, String cadena) {
        String resultado = null;
        try {
            resultado = datos.buscar(nombreCatalogo,cadena);
            if (resultado == null) {
                System.out.println("No se encontraron peliculas con la palabra \"" + cadena + "\"");
            } else System.out.println(resultado);
        } catch (LecturaDatosEx e) {
            System.out.println("Error de acceso a datos: " + e.getMessage());
        }
    }

    @Override
    public void iniciarCatalogoPeliculas(String nombreCatalogo) {
        try {
            if (datos.existe(nombreCatalogo)) {
                datos.borrar(nombreCatalogo);
                datos.crear(nombreCatalogo);
            } else {
                datos.crear(nombreCatalogo);
            }
        } catch (AccesoDatosEx e) {
            System.out.println("Error de acceso a datos: " + e.getMessage());
        }
    }
}
