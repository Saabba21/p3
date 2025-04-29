package PlantillaCodigo;
import java.util.List;
// Usuario (hereda de Persona)
public class Usuario extends Persona {
    public Usuario(String id, String nombre, String correo) {
        super(id, nombre, correo);
    }

    public List<Prestamo> getPrestamos() {
        return List.of();
    }
    public void agregarPrestamo(Prestamo prestamo) {
    }
    public void quitarPrestamo(Prestamo prestamo) {
    }

    public Prestamo solicitarPrestamo(Libro libro) {
        return null;
    }
    public void devolverPrestamo(Prestamo prestamo) {
    }
    public boolean tienePrestamoActivo(String isbn) {
        return false;
    }
}