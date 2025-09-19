package tadlista;

public class NodoLista {
    
    private int dato;
    private NodoLista siguiente;
    
    public NodoLista(int elDato){
        this.dato = elDato;
        this.siguiente = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoLista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLista siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
