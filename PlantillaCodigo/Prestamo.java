package PlantillaCodigo;

import java.time.LocalDate;
public class Prestamo {
    private String id;
    private LocalDate fechaInicio;
    private LocalDate fechaVencimiento;
    private boolean devuelto;
    private Usuario usuario;
    private Libro libro;

    public Prestamo(String id, LocalDate fechaInicio,
                    LocalDate fechaVencimiento,
                    Usuario usuario, Libro libro) {
        // Constructor
    }

    public String getId() {
        return "";
    }
    public LocalDate getFechaInicio() {
        return null;
    }
    public LocalDate getFechaVencimiento() {
        return null;
    }
    public boolean isDevuelto() {
        return false;
    }

    public void marcarDevuelto() {
    }
    public boolean estaVencido() {
        return false;
    }

    public Usuario getUsuario() {
        return null;
    }
    public Libro getLibro() {
        return null;
    }

    @Override
    public String toString() {
        return "";
    }
}
