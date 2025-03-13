
package mx.itson.potroMusic.entidades;

// @author Andrey

public class Artista 
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
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the sitioWeb
     */
    public String getSitioWeb() {
        return sitioWeb;
    }

    /**
     * @param sitioWeb the sitioWeb to set
     */
    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }
    
    private String nombre;
    private String descripcion;
    private String sitioWeb;
    
}
