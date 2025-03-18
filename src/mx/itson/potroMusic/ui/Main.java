
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
        
        // Aqui se hace la lista del album con todas las canciones, practicamente todo
        List<Cancion> canciones = new ArrayList<>();
        
        // Aqui el usuario crea al artista
        System.out.println("- Empezaremos por crear el perfil del artista para tu album.");
        System.out.println("Nombre del artista:");
        String neim = scanner.nextLine();
        System.out.println("Descripcion del artista:");
        String info = scanner.nextLine();
        System.out.println("Sitio web del artista:");
        String link = scanner.nextLine();
        Artista artista = new Artista();   // Se crea el artista hecho por el usuario
        artista.setNombre(neim);
        artista.setDescripcion(info);
        artista.setSitioWeb(link);
        System.out.println("Artista creado!\n");

        // Aqui el usuario crea el album para el artista creado anteriormente
        System.out.println("- Ahora continuaremos por crear el album del artista ya creado.");
        System.out.println("Titulo del album:");
        String titulo = scanner.nextLine();
        System.out.println("Anio de lanzamiento del album:");
        int anio = scanner.nextInt();
        Album a = new Album();   // Se crea el album hecho por el usuario
        a.setNombre(titulo);
        a.setArtista(artista);
        a.setLanzamiento(anio);
        a.setGenero(Genero.OTRO);
        System.out.println("Album creado!\n");
        
        // En esta parte, el artista y album ya estan hechos, solo falta que
        // el usuario agregue tantas canciones como quiera.
        System.out.println(" * Artista y Album hecho.");
        
        // Aqui se muestra en terminal un menu/guia de uso
        while (true){
        try {
        System.out.println("\n==============================================================");
        System.out.println("Que quiere hacer con el album " + a.getNombre() + " ---");
        System.out.println("1: Agregar una cancion al album");
        System.out.println("2: Revisar album");
        System.out.println("0: Salir");
        int opcion = scanner.nextInt();
        scanner.nextLine();     // Limpiamos el scanner
        
        if (opcion == 1){       // Funcion para agregar una nueva cancion
            System.out.println("\nBien, vamos a agregar una nueva cancion!");
            System.out.println("Nombre de la cancion:");
            String name = scanner.nextLine();
            System.out.println("Posicion de la cancion en el album (No repetir numeros!):");
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
            + " del Genero " + a.getGenero());
            System.out.println(artista.getNombre() + " es " + artista.getDescripcion());
            System.out.println("Puedes apoyarl@ visitando su sitio web oficial en: " + artista.getSitioWeb());
            
            // Ordenamos las canciones por su orden
            canciones.sort((c1, c2) -> Integer.compare(c1.getOrden(), c2.getOrden()));

            // Imprimimos todas las canciones dentro del album
            System.out.println("---------------");
            for (Cancion cancion : canciones) {
                System.out.println(cancion.getOrden() + ".- "
                + cancion.getNombre() + " -   " + cancion.getDuracion() + " seg");
            }
            
        } else if (opcion == 0){
            System.out.println("Saliendo...");      // Se acaba el programa
            return;
        } else {
            System.out.println("Opcion no valida, prueba de nuevo");
        }
        } catch (Exception e) {
        System.out.println("Error, intente de nuevo.");
        scanner.nextLine(); // Limpiamos el scanner
        }
        }
        
    }
    
}

/*
Linea "100" (canciones.sort((c1, c2) -> Integer.compare(c1.getOrden(), c2.getOrden()));):
Integer.compare(a, b) es un método estático de la clase Integer que compara dos valores enteros a y b de forma segura.
Devuelve un valor entero:
0 si ambos números son iguales.
-1 si el primer número es menor que el segundo (es decir, a < b).
1 si el primer número es mayor que el segundo (es decir, a > b).
En este caso, c1.getOrden() y c2.getOrden() obtienen el valor del atributo orden de las canciones c1 y c2.
Si el orden de c1 es menor que el de c2, Integer.compare() devolverá un valor negativo, lo que indica que c1 debe ir antes que c2 en la lista.
Si el orden de c1 es mayor que el de c2, devolverá un valor positivo, lo que indica que c1 debe ir después que c2.
*/