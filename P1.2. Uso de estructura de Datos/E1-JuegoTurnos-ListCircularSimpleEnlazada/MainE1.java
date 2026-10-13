import java.util.Scanner;

public class MainE1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        JuegoTurnos juego = new JuegoTurnos();

        int opcion;

        do {

            System.out.println();
            System.out.println(
                    "===== JUEGO DE TURNOS ====="
            );

            System.out.println("1. Agregar jugador");
            System.out.println("2. Eliminar jugador");
            System.out.println("3. Mostrar jugadores");
            System.out.println("4. Avanzar turno");
            System.out.println("5. Mostrar jugador actual");
            System.out.println("0. Salir");

            System.out.print(
                    "Seleccione una opción: "
            );

            opcion = teclado.nextInt();
            teclado.nextLine();


            switch (opcion) {

                case 1:

                    System.out.print(
                            "Nombre: "
                    );

                    String nombre =
                            teclado.nextLine();

                    System.out.print(
                            "Puntuación inicial: "
                    );

                    int puntuacion =
                            teclado.nextInt();

                    teclado.nextLine();

                    juego.agregarJugador(
                            nombre,
                            puntuacion
                    );
                    System.out.println("Jugador agregado correctamente.");
                    break;


                case 2:

                    System.out.print(
                            "Nombre del jugador: "
                    );

                    String eliminar =
                            teclado.nextLine();

                    juego.eliminarJugador(
                            eliminar
                    );

                    break;


                case 3:

                    System.out.println(
                            "Jugadores actuales:"
                    );

                    juego.mostrarJugadores();

                    break;


                case 4:

                    juego.siguienteTurno();
                    System.out.println("Turno avanzado.");

                    break;


                case 5:

                    NodoJugador actual =
                            juego.getJugadorActual();

                    if (actual != null) {

                        System.out.println(
                                "Turno actual: [" + actual.getNombre() + " (" + actual.getPuntuacion() + ")]"
                        );

                    } else {

                        System.out.println(
                                "Ningún jugador tiene el turno (lista vacía)."
                        );
                    }

                    break;


                case 0:

                    System.out.println(
                            "Fin del juego."
                    );

                    break;


                default:

                    System.out.println(
                            "Opción incorrecta."
                    );
            }

        } while (opcion != 0);

        teclado.close();
    }
}