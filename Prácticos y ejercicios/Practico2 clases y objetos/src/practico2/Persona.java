package practico2;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String unNombre, String unApellido, int unaEdad) {
        this.setNombre(unNombre);
        this.setApellido(unApellido);
        this.setEdad(unaEdad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", apellido: " + apellido + ", edad: " + edad;
    }
    
}
