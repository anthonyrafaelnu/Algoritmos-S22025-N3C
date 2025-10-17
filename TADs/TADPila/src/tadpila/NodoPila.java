package tadpila;

public class NodoPila<T extends Comparable> {
    
    private T dato;
    private NodoPila siguiente;
    
    public NodoPila(T elDato){
        this.dato = elDato;
        this.siguiente = null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoPila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
