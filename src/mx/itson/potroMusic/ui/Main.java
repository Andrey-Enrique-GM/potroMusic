
package mx.itson.potroMusic.ui;

// @author Andrey

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mx.itson.potroMusic.entidades.Album;
import mx.itson.potroMusic.entidades.Artista;
import mx.itson.potroMusic.entidades.Cancion;
import mx.itson.potroMusic.enums.Genero;


public class Main 
{
    
    public static void main(String[] args) 
    {

        Scanner scanner = new Scanner(System.in);
        
        // Aqui se crea el artista, Ado        
        Artista artista = new Artista();
        artista.setNombre("Ado");
        artista.setDescripcion("cantante japonesa de J-pop y rock, conocida por su voz poderosa y su estilo vocal distintivo.");
        artista.setSitioWeb("https://ado-shop.com");

        // Aqui se crea el album "Kyougen" de Ado!        
        Album a = new Album();
        a.setArtista(artista);
        a.setNombre("Kyougen");
        a.setLanzamiento(2022);
        a.setGenero(Genero.JPOP);
        
        // Aqui se hace la lista del album con todas las canciones, practicamente todo
        List<Cancion> canciones = new ArrayList<>();
        
        // Aqui cree 2 canciones del album para que no este tan vacio al probar        
        Cancion usseewa = new Cancion();
        usseewa.setNombre("Usseewa");
        usseewa.setOrden(1);
        usseewa.setDuracion(204);
        
        Cancion readymade = new Cancion();
        readymade.setNombre("Readymade");
        readymade.setOrden(2);
        readymade.setDuracion(243);
        /*
        Cancion odo = new Cancion();
        odo.setNombre("Odo");
        odo.setOrden(4);
        odo.setDuracion(209);
        */
        canciones.add(usseewa);
        canciones.add(readymade);
        a.setCancion(canciones);
        
        // Aqui se muestra en terminal un menu/guia de uso
        while (true){
        System.out.println("\n==============================================================");
        System.out.println("Que quiere hacer con el album Kyougen?");
        System.out.println("1: Agregar una cancion al album");
        System.out.println("2: Revisar album");
        System.out.println("0: Salir");
        int opcion = scanner.nextInt();
        scanner.nextLine();     // Limpio el scanner
        
        if (opcion == 1){       // Funcion para agregar una nueva cancion
            System.out.println("\nBien, vamos a agregar una nueva cancion!");
            System.out.println("Nombre de la cancion:");
            String name = scanner.nextLine();
            System.out.println("Posicion de la cancion en el album (No repetir 1 y 2):");
            int place = scanner.nextInt();
            System.out.println("Duracion de la cancion (Solo segundos):");
            int time = scanner.nextInt();
            Cancion song = new Cancion();   // Se crea la nueva cancion hecha por el usuario
            song.setNombre(name);
            song.setOrden(place);
            song.setDuracion(time);
            canciones.add(song);            // Se agrega la cancion al album
            a.setCancion(canciones);
            System.out.println("Quiere volver al menu principal? (0=NO / 1=SI):");  // Pregunta si quiere agregar otra cancion
            int answer = scanner.nextInt();
            scanner.nextLine();
            if (answer == 0){
                System.out.println("Saliendo...");  // Se acaba el programa
                break;
            }
            
        } else if (opcion == 2){
            System.out.println("\n==============================================================");
            System.out.println("* " + a.getNombre() + " ---");
            System.out.println("Album musical de " + artista.getNombre()
            + ". Lanzado en el año " + a.getLanzamiento()
            + ". Del Genero " + a.getGenero());
            System.out.println(artista.getNombre() + " es una " + artista.getDescripcion()
            + " Puedes apoyarla comprando su mercancia oficial en: " + artista.getSitioWeb());
            System.out.println("---------------");
            
        } else if (opcion == 0){
            System.out.println("Saliendo...");      // Se acaba el programa
            return;
        } else {
            System.out.println("Opcion no valida, prueba de nuevo");
        }
        }
        
    }
    
}
