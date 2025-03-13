
package mx.itson.potroMusic.ui;

// @author Andrey

import java.util.ArrayList;
import java.util.List;
import mx.itson.potroMusic.entidades.Album;
import mx.itson.potroMusic.entidades.Artista;
import mx.itson.potroMusic.entidades.Cancion;
import mx.itson.potroMusic.enums.Genero;


public class Main 
{
    
    public static void main(String[] args) 
    {
        
        Artista artista = new Artista();
        artista.setNombre("Ado");
        artista.setSitioWeb("ado.com");
        
        Album a = new Album();
        a.setNombre("Kyogen");
        a.setLanzamiento(2022);
        a.setArtista(artista);
        a.setGenero(Genero.OTRO);
        
        List<Cancion> canciones = new ArrayList<>();
        
    }
    
}
