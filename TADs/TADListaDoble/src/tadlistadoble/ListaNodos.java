package tadlistadoble;

public class ListaNodos<T extends Comparable> implements ILista<T> {
    
    private NodoLista lista;
    private NodoLista fin;
    private int cantidad;
    
    public ListaNodos(){
        lista = null;
        fin = null;
        cantidad = 0;
    }

    @Override
    public boolean esVacia() {
        return lista == null;
    }

    @Override
    public void agregarInicio(T n) {
        NodoLista nuevo = new NodoLista(n);
        
        if(esVacia()){
            this.lista = nuevo;
            this.fin = nuevo;
        }else{
            nuevo.setSiguiente(lista);
            lista.setAnterior(nuevo);
            lista = nuevo;
        }
        
        this.cantidad++;
    }

    @Override
    public void agregarFinal(T n) {
        if(esVacia()){
            agregarInicio(n);
        }else{
            NodoLista nuevo = new NodoLista(n);
            nuevo.setAnterior(fin);
            fin.setSiguiente(nuevo);
            fin = nuevo; // fin = fin.getSiguiente();
            
            this.cantidad++;
        }
    }

    @Override
    public void borrarInicio() {
        if(!esVacia()){
            NodoLista aBorrar = this.lista;
            this.lista = this.lista.getSiguiente();
            this.lista.setAnterior(null);
            aBorrar.setSiguiente(null);
            this.cantidad--;
        }
    }

    @Override
    public void borrarFin() {
        if(!esVacia()){
            if(this.lista.getSiguiente() == null) { //es el único nodo
                vaciar();
            }else{
                NodoLista aux = this.fin;
                this.fin = this.fin.getAnterior();
                aux.setAnterior(null);
                this.fin.setSiguiente(null);
                this.cantidad--;
            }
        }
    }

    @Override
    public void vaciar() {
        this.lista = null;
        this.fin = null;
        this.cantidad = 0;
    }

    @Override
    public void mostrar() {
        NodoLista aux = this.lista;
        
        while(aux != null){
            System.out.println(aux.getDato());
            aux = aux.getSiguiente();
        }
    }

    @Override
    public void agregarOrd(T n) {
        if(this.lista == null || n.compareTo(this.lista.getDato()) <= 0 ){
            agregarInicio(n);
        }else{
            NodoLista aux = this.lista;
            while(aux.getSiguiente() != null && aux.getSiguiente().getDato().compareTo(n) > 0){
                aux = aux.getSiguiente();
            }
            
            if(aux.getSiguiente() == null){ // Estoy en el último nodo (agrego al final)
                agregarFinal(n);
            }else{
                NodoLista nuevo = new NodoLista(n);
                NodoLista aux2 = aux.getSiguiente();
                nuevo.setSiguiente(aux2);
                nuevo.setAnterior(aux);
                aux2.setAnterior(nuevo);
                aux.setSiguiente(nuevo);
                
                this.cantidad++;
            }
        }
    }

    @Override
    public void borrarElemento(T n) {
        if(this.lista != null){
            if(this.lista.getDato().equals(n)){
                borrarInicio();
            }else{
                NodoLista aux = this.lista;
                while(aux.getSiguiente() != null && !aux.getSiguiente().getDato().equals(n)){
                    aux = aux.getSiguiente();
                }
                
                if(aux.getSiguiente() != null){
                    NodoLista aBorrar = aux.getSiguiente();
                    NodoLista aux2 = aBorrar.getSiguiente();
                    aux.setSiguiente(aux2);
                    if(aux2 != null){
                        aux2.setAnterior(aux);
                    }
                    aBorrar.setSiguiente(null);
                    aBorrar.setAnterior(null);
                    
                    this.cantidad--;
                }
            }
        }
    }

    @Override
    public int cantElementos() {
        return cantidad;
    }

    @Override
    public NodoLista obtenerElemento(T n) {
        
        if(this.lista != null && this.lista.getDato().equals(n)){
            return this.lista;
        }
        
        if(this.fin != null && this.fin.getDato().equals(n)){
            return this.fin;
        }
        
        NodoLista ret = this.lista;
        
        while(ret != null){
            if(ret.getDato().equals(n)) return ret;
            ret = ret.getSiguiente();
        }
        
        return ret;
    }

    @Override
    public void mostrarREC(NodoLista l) {
        if(l != null){ // Caso base
            System.out.println(l.getDato());
            mostrarREC(l.getSiguiente());
        }
    }
    
    public void mostrarRECDescv1(NodoLista l){
        if(l != null){
            mostrarRECDescv1(l.getSiguiente());
            System.out.println(l.getDato());
        }
    }
    
    public void mostrarDesc(){
        NodoLista aux = this.fin;
        
        while(aux != null){
            System.out.println(aux.getDato());
            aux = aux.getAnterior();
        }
    }
    
}
