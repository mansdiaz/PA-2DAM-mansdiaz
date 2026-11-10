package P1_4_Árboles_y_trazas;

public class NodoArbol {

    int dato;

    NodoArbol izquierdo;
    NodoArbol derecho;

    public NodoArbol(int dato) {

        this.dato = dato;

        izquierdo = null;
        derecho = null;
    }
}