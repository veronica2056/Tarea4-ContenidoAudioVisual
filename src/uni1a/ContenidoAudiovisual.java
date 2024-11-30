package uni1a;

public abstract class ContenidoAudiovisual {
    private static int contador = 0; // Contador estático para asignar un ID único
    private final int id; // ID único del contenido
    private String titulo; // Título del contenido
    private int duracionEnMinutos; // Duración en minutos
    private String genero; // Género del contenido

    public ContenidoAudiovisual(String titulo, int duracionEnMinutos, String genero) {
        this.id = contador++; // Incrementa el contador y asigna el ID
        this.titulo = titulo;
        this.duracionEnMinutos = duracionEnMinutos;
        this.genero = genero;
    }

    // Métodos getter y setter para acceder y modificar los campos
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Métodos abstractos que deben ser implementados en las subclases
    public abstract void mostrarDetalles(); // Mostrar detalles del contenido
    public abstract String toCSV(); // Convertir el contenido a formato CSV
}
