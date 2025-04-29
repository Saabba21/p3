package PlantillaCodigo;

import java.util.List;
// Bibliotecario (hereda de Persona)
public class Bibliotecario extends Persona {
    public Bibliotecario(String id, String nombre, String correo) {
        super(id, nombre, correo);
    }

    public void registrarUsuario(Usuario usuario) {
    }
    public void eliminarUsuario(Usuario usuario) {
    }

    public void agregarLibro(Libro libro) {
    }
    public void eliminarLibro(String isbn) {
    }

    public Prestamo prestarLibro(Usuario usuario, Libro libro) {
        return null;
    }
    public void recibirDevolucion(Prestamo prestamo) {
    }

    public List<Persona> listarUsuarios() {
        return List.of();
    }
    public List<Libro> listarLibros() {
        return List.of();
    }
}