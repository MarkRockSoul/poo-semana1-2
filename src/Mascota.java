public class Mascota {
    private int idMascota;
    private String nombre;
    private String raza;
    private int edad;

    //Relacion 1 a 1 con Propietario
    private Propietario propietario;

    public Mascota() {
    }

    public Mascota(int idMascota, String nombre, String raza, int edad) {
        setIdMascota(idMascota);
        setNombre(nombre);
        setRaza(raza);
        setEdad(edad);
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
}
