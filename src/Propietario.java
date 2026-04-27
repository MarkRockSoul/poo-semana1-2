import java.util.ArrayList;
import java.util.List;

public class Propietario {
    private int idPropietario;
    private String dni;
    private String nombre;
    private String telefono;
    // Relacion de uno a muchos con Mascota
    private List<Mascota> mascotas;

    public Propietario() {
        this.mascotas = new ArrayList<>();
    }

    public Propietario(int idPropietario, String dni, String nombre, String telefono) {
        this.mascotas = new ArrayList<>();
        setIdPropietario(idPropietario);
        setDni(dni);
        setNombre(nombre);
        setTelefono(telefono);
    }

    public int getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(int idPropietario) {
        this.idPropietario = idPropietario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void agregarMascota(Mascota mascota) {
        this.mascotas.add(mascota);
    }
}
