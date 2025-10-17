package tadlistadoble;

public interface ILista<T> {
    
    public boolean esVacia();
    public void agregarInicio(T n);
    public void agregarFinal(T n);
    public void borrarInicio();
    public void borrarFin();
    public void vaciar();
    public void mostrar();
    public void agregarOrd(T n);
    public void borrarElemento(T n);
    public int cantElementos();
    public NodoLista obtenerElemento(T n);
    public void mostrarREC(NodoLista l);
    
}