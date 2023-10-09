package co.com.javaworkshops.peliculas.datos;

import co.com.javaworkshops.peliculas.domain.Pelicula;
import co.com.javaworkshops.peliculas.excepciones.AccesoDatosEx;
import co.com.javaworkshops.peliculas.excepciones.EscrituraDatosEx;
import co.com.javaworkshops.peliculas.excepciones.LecturaDatosEx;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AccesoDatosImpl implements AccesoDatos {

    @Override
    public void crear(String nombreRecurso) throws AccesoDatosEx {
        nombreRecurso.concat(".txt");
        File archivo = new File(nombreRecurso);
        if (archivo.exists()) {
            throw new AccesoDatosEx("El archivo ya existe");
        }
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new AccesoDatosEx("Error al crear el archivo: " + e.getMessage());
        }
    }

    @Override
    public void borrar(String nombreRecurso) throws AccesoDatosEx {
        nombreRecurso.concat(".txt");
        File archivo = new File(nombreRecurso);
        if (archivo.exists()) {
            archivo.delete();
            System.out.println("El archivo se ha eliminado");
        } else throw new AccesoDatosEx("El archivo no existe");
    }

    @Override
    public boolean existe(String nombreRecurso) throws AccesoDatosEx {
        nombreRecurso.concat(".txt");
        File archivo = new File(nombreRecurso);
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx {
        nombreRecurso.concat(".txt");
        File archivo = new File(nombreRecurso);
        List<Pelicula> peliculas = new ArrayList<>();
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = entrada.readLine();
            while (linea != null) {
                Pelicula pelicula = new Pelicula(linea);
                peliculas.add(pelicula);
                linea = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new LecturaDatosEx("Excepcion al listar, no se encontro el archivo: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            throw new LecturaDatosEx("Excepcion al listar: " + e.getMessage());
        }
        return peliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx {
        nombreRecurso.concat(".txt");
        File archivo = new File(nombreRecurso);
        PrintWriter salida = null;
        try {
            salida = new PrintWriter(new FileWriter(archivo,anexar));
            salida.println(pelicula.getNombre());
            salida.close();
            System.out.println("Se ha guardado la pelicula en el catalogo " + nombreRecurso);
        } catch (IOException e) {
            e.printStackTrace();
            throw new EscrituraDatosEx("Error al guardar pelicula: " + e.getMessage());
        }
    }

    @Override
    public String buscar(String nombreRecurso, String cadena) throws LecturaDatosEx {
        nombreRecurso.concat(".txt");
        File archivo = new File(nombreRecurso);
        StringBuilder resultado = new StringBuilder();
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            int indice = 1;
            String linea = entrada.readLine();
            while (linea != null) {
                if (linea.contains(cadena) && cadena != null) {
                    resultado.append(indice).append(" -> ").append(linea).append("\n");
                }
                linea = entrada.readLine();
                indice++;
            }
            entrada.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new LecturaDatosEx("Error al buscar la pelicula: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            throw new LecturaDatosEx("Error al buscar la pelicula : " + e.getMessage());
        }
        if (resultado.isEmpty()) {
            resultado.append("No se encontro nada en la busqueda.");
        }
        return resultado.toString();


    }
}
