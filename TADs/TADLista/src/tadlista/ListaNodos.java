package tadlista;

public class ListaNodos implements ILista {
    
    private NodoLista lista;
    
    public ListaNodos(){
        lista = null;
    }

    @Override
    public boolean esVacia() {
        return lista == null;
    }

    @Override
    public void agregarInicio(int n) {
        NodoLista nuevo = new NodoLista(n);
        nuevo.setSiguiente(lista);
        lista = nuevo;
    }

    @Override
    public void agregarFinal(int n) {
        if(esVacia()){
            agregarInicio(n);
        }else{
            NodoLista aux = lista;
        
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }

            NodoLista nuevo = new NodoLista(n);
            aux.setSiguiente(nuevo);
        }
    }

    @Override
    public void borrarInicio() {
        if(!esVacia()){
            NodoLista aBorrar = this.lista;
            this.lista = this.lista.getSiguiente();
            aBorrar.setSiguiente(null);
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
            }
        }
    }

    @Override
    public void vaciar() {
        this.lista = null;
    }

    @Override
    public void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void agregarOrd(int n) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void borrarElemento(int n) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int cantElementos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public NodoLista obtenerElemento(int n) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mostrarREC(NodoLista l) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
