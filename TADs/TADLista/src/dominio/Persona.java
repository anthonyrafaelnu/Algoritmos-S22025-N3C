package dominio;

public class Persona implements Comparable {
    private String nombre;
    private int edad;
    private int cedula;

    public Persona(String nombre, int edad, int cedula) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    @Override
    public int compareTo(Object o) {
        Persona p2 = (Persona)o;
        return this.cedula - p2.getCedula();
    }

    @Override
    public boolean equals(Object obj) {
        Persona p2 = (Persona) obj;
        return this.cedula == p2.cedula;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", cédula: " + cedula;
    }
}
