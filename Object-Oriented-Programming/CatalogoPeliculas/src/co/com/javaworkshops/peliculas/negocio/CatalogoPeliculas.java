package co.com.javaworkshops.peliculas.negocio;

public interface CatalogoPeliculas {

    void agregarPelicula(String nombreCatalogo, String nombrePelicula);

    void listarPeliculas(String nombreCatalogo);

    void buscarPelicula(String nombreCatalogo,String cadena);

    void iniciarCatalogoPeliculas(String nombreCatalogo);

}
