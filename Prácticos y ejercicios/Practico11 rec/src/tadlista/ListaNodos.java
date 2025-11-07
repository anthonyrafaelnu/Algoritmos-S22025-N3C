package tadlista;

public class ListaNodos<T extends Comparable> implements ILista<T> {
    
    public NodoLista lista;
    private int cantidad;
    
    public ListaNodos(){
        lista = null;
        cantidad = 0;
    }

    @Override
    public boolean esVacia() {
        return lista == null;
    }

    @Override
    public void agregarInicio(T n) {
        NodoLista nuevo = new NodoLista(n);
        nuevo.setSiguiente(lista);
        lista = nuevo;
        this.cantidad++;
    }

    @Override
    public void agregarFinal(T n) {
        if(esVacia()){
            agregarInicio(n);
        }else{
            NodoLista aux = lista;
        
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }

            NodoLista nuevo = new NodoLista(n);
            aux.setSiguiente(nuevo);
            
            this.cantidad++;
        }
    }

    @Override
    public void borrarInicio() {
        if(!esVacia()){
            NodoLista aBorrar = this.lista;
            this.lista = this.lista.getSiguiente();
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
                NodoLista aux = this.lista;
                while(aux.getSiguiente() != null && aux.getSiguiente().getSiguiente() != null){
                    aux = aux.getSiguiente();
                }
                aux.setSiguiente(null);
                this.cantidad--;
            }
        }
    }

    @Override
    public void vaciar() {
        this.lista = null;
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
            
            NodoLista nuevo = new NodoLista(n);
            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);
            
            this.cantidad++;
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
                    aux.setSiguiente(aux.getSiguiente().getSiguiente());
                    aBorrar.setSiguiente(null);
                    
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
            mostrarREC(l.getSiguiente());
            System.out.println(l.getDato());
        }
    }
    
    public void mostrarInverso(){
        mostrarInversoRec(this.lista);
    }
    
    public void mostrarInversoRec(NodoLista l){
        if(l != null){ // Caso base
            
            mostrarInversoRec(l.getSiguiente());
            
            if((Integer)l.getDato() % 2 == 0){
                System.out.print(l.getDato() + " ");
            }
        }
    }
    
    public int sumaPares(){
        return sumaParesRec(this.lista);
    }
    
    private int sumaParesRec(NodoLista l){
        if(l == null){
            return  0;
        }else{
            if((Integer)l.getDato() % 2 == 0){
                return (Integer)l.getDato() + sumaParesRec(l.getSiguiente());
            }
            return sumaParesRec(l.getSiguiente());
        }
    }
    
    public boolean estaValor(int valor){
        return estaValorRec(valor, this.lista);
    }
    
    private boolean estaValorRec(int valor, NodoLista l){
        if(l == null) return false; //CB
        
//        if((Integer)l.getDato() == valor) return true;
//        return estaValorRec(valor, l.getSiguiente());

        return (Integer)l.getDato() == valor || estaValorRec(valor, l.getSiguiente());
    }
    
    public boolean sonIguales(NodoLista nodo){
        return sonIgualesRec(this.lista, nodo);
    }
    
    private boolean sonIgualesRec(NodoLista lista, NodoLista otraLista){
        if(lista == null && otraLista == null) return true;
        if(lista == null || otraLista == null) return false;
        //if(lista != null && otraLista == null) return false;
        
        return (Integer)lista.getDato() == (Integer)otraLista.getDato()
                && sonIgualesRec(lista.getSiguiente(), otraLista.getSiguiente());
        
    }
    
    public void mostrarHasta(int n){
        mostrarHastaRec(n, this.lista);
    }
    
    // pre n <= cantidad
    public void mostrarHastaRec(int n, NodoLista l){
        if(l != null){
            if(n > 0){
                System.out.println(l.getDato());
                mostrarHastaRec(n - 1, l.getSiguiente());
            }
        }
    }
    
    public boolean estaOrdenada(){
        return estaOrdenadaRec(this.lista);
    }
    
    private boolean estaOrdenadaRec(NodoLista l){
        if(l == null) return true;
        if(l.getSiguiente() == null) return true;
        
        return (Integer)l.getDato() <= (Integer)l.getSiguiente().getDato()
                && estaOrdenadaRec(l.getSiguiente());
    }
    
}
