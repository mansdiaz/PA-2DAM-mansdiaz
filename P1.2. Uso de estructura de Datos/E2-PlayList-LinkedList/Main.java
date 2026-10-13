import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Crear la LinkedList de canciones
        LinkedList<Cancion> playlist = new LinkedList<>();


        // 1. Añadir al FINAL:
        playlist.addLast(new Cancion("Bohemian Rhapsody", "Queen", 354));
        playlist.addLast(new Cancion("Imagine", "John Lennon", 183));
        System.out.println("1. Lista inicial: " + playlist);



        // 2. Añadir Hotel California al PRINCIPIO
        playlist.addFirst(new Cancion("Hotel California", "Eagles", 390));
        System.out.println("2. Tras añadir al principio: " + playlist);


        // 3. Añadir Wonderwall al FINAL
        playlist.addLast(new Cancion("Wonderwall", "Oasis", 258));
        System.out.println("3. Tras añadir al final: " + playlist);


        // 4. Mostrar la primera canción
        // 5. Mostrar la última canción
        System.out.println("\nPrimera canción en cola: " + playlist.getFirst());
        System.out.println("Última canción en cola: " + playlist.getLast());



        // 6. Pedir al usuario un título y buscarlo
        //    dentro de la playlist.

        Scanner teclado = new Scanner(System.in);

        System.out.print("\nIntroduce el título que quieres buscar: ");
        String tituloBuscado = teclado.nextLine();

        Cancion encontrada = null;

        for (Cancion cancion : playlist) {

            if (cancion.getTitulo().equalsIgnoreCase(tituloBuscado)) {
                encontrada = cancion;
                break;
            }
        }

        if (encontrada != null) {
            System.out.println("Canción encontrada:");
            System.out.println(encontrada);
        } else {
            System.out.println("La canción no está en la playlist.");
        }




        // 7. Eliminar la primera canción
        // 8. Eliminar la última canción
        // Mostrar la playlist final
        playlist.removeFirst();
        playlist.removeLast();
        System.out.println("\nPlaylist final tras limpiar los extremos: " + playlist);




        System.out.println("\n=== PLAYLIST FINAL ===");

        if (playlist.isEmpty()) {
            System.out.println("La playlist está vacía.");
        } else {
            for (Cancion c : playlist) {
                System.out.println("🎵 " + c);
            }
        }


        teclado.close();
    }
}