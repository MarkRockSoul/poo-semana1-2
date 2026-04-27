public class Estudiante {
    private String codigo;
    private String nombres;
    private String apellidos;
    private String dni;
    private String carrera;
    private int edad;
    private boolean estaMatriculado;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        if (dni.length() == 8) {
            this.dni = dni;
        } else {
            System.out.println("El DNI debe tener 8 caracteres.");
        }
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 80) {
            this.edad = edad;
        } else {
            System.out.println("La edad debe estar entre 0 y 80.");
        }
    }

    public boolean isEstaMatriculado() {
        return estaMatriculado;
    }

    public void setEstaMatriculado(boolean estaMatriculado) {
        this.estaMatriculado = estaMatriculado;
    }

    public Estudiante() {

    }

    public Estudiante(String _nombres, String _apellidos, String _carrera, int _edad, String _codigo, String _dni,
            boolean _estaMatriculado) {
        setCodigo(_codigo);
        setNombres(_nombres);
        setApellidos(_apellidos);
        setDni(_dni);
        setCarrera(_carrera);
        setEdad(_edad);
        setEstaMatriculado(_estaMatriculado);
    }

    public String informacionBasica() {
        return "Dni: " + dni + "\nNombres: " + nombres + "\nApellidos: " + apellidos;
    }

    public String informacionBasica(boolean _estaMatriculado) {
        if (_estaMatriculado) {
            return "Codigo: " + codigo + "\nNombres: " + nombres + "\nApellidos: " + apellidos + "\nCarrera: "
                    + carrera;
        }
        return "No esta matriculado.";
    }
}
