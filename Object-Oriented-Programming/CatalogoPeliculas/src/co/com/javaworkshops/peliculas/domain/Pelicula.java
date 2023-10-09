package co.com.javaworkshops.peliculas.domain;

public class Pelicula {
    /**
     |--------------------------------------------------------------------------
     | attributes
     |--------------------------------------------------------------------------
     */

    private String nombre;

    /**
     |--------------------------------------------------------------------------
     | constructors
     |--------------------------------------------------------------------------
     */

    public Pelicula() {}

    public Pelicula(String nombre) {
        this.nombre = nombre;
    }

    /**
     |--------------------------------------------------------------------------
     | getters and setters
     |--------------------------------------------------------------------------
     */

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     |--------------------------------------------------------------------------
     | methods
     |--------------------------------------------------------------------------
     */

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pelicula[");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(']');
        return sb.toString();
    }
}
