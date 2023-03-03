package SERVICIOS;

public class ClaseEmpleados {

    private String ID;
    private String Nombre;
    private String Apellido;
    private String Ocupacion;
    private String Modulo;

    public ClaseEmpleados(String ID, String nombre, String apellido, String ocupacion, String modulo) {
        this.ID = ID;
        Nombre = nombre;
        Apellido = apellido;
        Ocupacion = ocupacion;
        Modulo = modulo;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getOcupacion() {
        return Ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        Ocupacion = ocupacion;
    }

    public String getModulo() {
        return Modulo;
    }

    public void setModulo(String modulo) {
        Modulo = modulo;
    }
}
