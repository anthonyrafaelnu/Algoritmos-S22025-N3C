package practico2;

import java.util.Objects;

public abstract class Funcionario implements Comparable<Funcionario> {
    
    private String nombre;
    private String ci;

    public Funcionario(String nombre, String ci) {
        this.nombre = nombre;
        this.ci = ci;
    }
    
    // Parte d
    public abstract int calcularSueldo();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }
    
    public boolean ganaMas(Funcionario f2){
        return this.calcularSueldo() > f2.calcularSueldo();
    }

    @Override
    public boolean equals(Object o) {
        Funcionario f = (Funcionario)o;
        return this.getCi().equals(f.getCi());
    }

    @Override
    public int compareTo(Funcionario o){
        return o.calcularSueldo() - this.calcularSueldo();
    }
    
    
}
