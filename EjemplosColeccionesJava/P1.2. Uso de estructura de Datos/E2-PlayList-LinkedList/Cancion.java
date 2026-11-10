public class Cancion {

    // ATRIBUTOS
    private String titulo;
    private String artista;
    private int duracion;


    // CONSTRUCTOR
    public Cancion(String titulo, String artista, int duracion) {

        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;

    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {

        // COMPLETAR
        return "[" + titulo + " - " + artista + "]";
    }
}