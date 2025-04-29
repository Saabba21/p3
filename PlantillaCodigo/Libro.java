package PlantillaCodigo;

// Libro
public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private String editorial;
    private int ejemplaresTotales;
    private int ejemplaresDisponibles;

    public Libro(String isbn, String titulo, String autor,
                 String editorial, int ejemplaresTotales) {
        // Constructor
    }

    public String getIsbn() {
        return "";
    }
    public String getTitulo() {
        return "";
    }
    public String getAutor() {
        return "";
    }
    public String getEditorial() {
        return "";
    }
    public int getEjemplaresTotales() {
        return 0;
    }
    public int getEjemplaresDisponibles() {
        return 0;
    }

    public void setEditorial(String editorial) {
    }
    public boolean prestarEjemplar() {
        return false;
    }
    public void devolverEjemplar() {
    }

    @Override
    public String toString() {
        return "";
    }
}