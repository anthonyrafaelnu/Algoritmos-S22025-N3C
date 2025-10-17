package tadlistadoble;

public class NodoLista<T extends Comparable> {
    
    private T dato;
    private NodoLista siguiente;
    private NodoLista anterior;
    
    public NodoLista(T elDato){
        this.dato = elDato;
        this.siguiente = null;
        this.anterior = null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoLista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLista siguiente) {
        this.siguiente = siguiente;
    }

    public NodoLista getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoLista anterior) {
        this.anterior = anterior;
    }
    
    
}
