package practico2;

public class Mensual extends Funcionario {
    
    private int sueldoMensual;

    public Mensual(String nombre, String ci, int sueldoMensual) {
        super(nombre, ci);
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public int calcularSueldo() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
