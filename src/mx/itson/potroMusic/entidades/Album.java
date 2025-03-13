
package mx.itson.potroMusic.entidades;

// @author Andrey

import java.util.List;
import mx.itson.potroMusic.enums.Genero;


public class Album 
{

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the artista
     */
    public Artista getArtista() {
        return artista;
    }

    /**
     * @param artista the artista to set
     */
    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    /**
     * @return the lanzamiento
     */
    public int getLanzamiento() {
        return lanzamiento;
    }

    /**
     * @param lanzamiento the lanzamiento to set
     */
    public void setLanzamiento(int lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    /**
     * @return the cancion
     */
    public List <Cancion> getCancion() {
        return cancion;
    }

    /**
     * @param cancion the cancion to set
     */
    public void setCancion(List <Cancion> cancion) {
        this.cancion = cancion;
    }

    /**
     * @return the genero
     */
    public Genero getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
    private String nombre;
    private Artista artista;
    private int lanzamiento;
    private List <Cancion> cancion;
    private Genero genero;
    
}
