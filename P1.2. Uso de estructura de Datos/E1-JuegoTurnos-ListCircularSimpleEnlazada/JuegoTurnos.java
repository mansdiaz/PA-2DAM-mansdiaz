public class JuegoTurnos {

    private CListaCircularSE lista;
    private NodoJugador jugadorActual;


    public JuegoTurnos() {

        this.lista = new CListaCircularSE();
        this.jugadorActual = null;

    }


    public void agregarJugador(
            String nombre,
            int puntuacionInicial) {

        lista.agregar(nombre, puntuacionInicial);
        if (jugadorActual == null){
            jugadorActual = lista.getPrimero();
        }
    }


    public void eliminarJugador(
            String nombre) {

        if (lista.estaVacia()){
            System.out.println("No hay ningun jugador en la partida");
            return;
        }
        NodoJugador eliminar = lista.buscar(nombre);

        if (eliminar != null) {
            if (jugadorActual == eliminar) {
                if (jugadorActual.siguiente == jugadorActual) {
                    jugadorActual = null;
                } else {
                    jugadorActual = jugadorActual.siguiente;
                }
            }
            lista.eliminar(nombre);
            System.out.println("Jugador eliminado: " + nombre);
        } else {
            System.out.println("El jugador no existe.");
        }
    }


    public void siguienteTurno() {
        if (jugadorActual != null) {
            jugadorActual = jugadorActual.siguiente;
        } else {
            System.out.println("No hay jugadores para avanzar el turno");
        }
    }


    public void mostrarJugadores() {

        lista.mostrar();
    }


    public NodoJugador getJugadorActual() {

        return jugadorActual;
    }
}