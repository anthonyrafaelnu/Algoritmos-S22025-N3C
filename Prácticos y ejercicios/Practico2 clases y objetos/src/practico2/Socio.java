package practico2;

public class Socio {
    private String nombre;
    private int numero;
    private static int proximoNumero = 1;

    public Socio(String nombre) {
        this.setNombre(nombre);
        this.setNumero(proximoNumero);
        proximoNumero++;
    }
    
    public static int getProximoNumero() {
        return proximoNumero;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", numero: " + numero;
    }
    
    
}
