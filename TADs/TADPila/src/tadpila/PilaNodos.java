package tadpila;

public class PilaNodos<T extends Comparable> implements IPila<T> {
    
    private NodoPila<T> pila;
    private int cantidad;
    
    public PilaNodos(){
        pila = null;
        cantidad = 0;
    }

    @Override
    public boolean esVacia() {
        return pila == null;
    }

    @Override
    public void push(T n) {
        NodoPila nuevo = new NodoPila(n);
        nuevo.setSiguiente(pila);
        pila = nuevo;
        this.cantidad++;
    }

    @Override
    public void pop() {
        if(!esVacia()){
            NodoPila aBorrar = this.pila;
            this.pila = this.pila.getSiguiente();
            aBorrar.setSiguiente(null);
            this.cantidad--;
        }
    }

    @Override
    public T top() {
        if(!esVacia()){
            return this.pila.getDato();
        }
        return null;
    }

    @Override
    public T poptop() {
        T dato = top();
        pop();
        return dato;
    }

    @Override
    public void vaciar() {
        this.pila = null;
        this.cantidad = 0;
    }

    @Override
    public int cantElementos() {
        return cantidad;
    }
    
    // Con fines didácticos
    @Override
    public void mostrar() {
        NodoPila aux = this.pila;
        
        while(aux != null){
            System.out.println(aux.getDato());
            aux = aux.getSiguiente();
        }
    }
}
