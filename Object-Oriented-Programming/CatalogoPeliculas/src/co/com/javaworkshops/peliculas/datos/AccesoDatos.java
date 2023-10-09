package co.com.javaworkshops.peliculas.datos;

import co.com.javaworkshops.peliculas.domain.Pelicula;
import co.com.javaworkshops.peliculas.excepciones.*;

import java.util.List;

public interface AccesoDatos {

    void crear(String nombreRecurso) throws AccesoDatosEx;

    void borrar(String nombreRecurso) throws AccesoDatosEx;

    boolean existe(String nombreRecurso) throws AccesoDatosEx;

    List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx;

    void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx;

    String buscar(String nombreRecurso, String cadena) throws LecturaDatosEx;

}
