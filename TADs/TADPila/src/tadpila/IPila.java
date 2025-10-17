package tadpila;

public interface IPila<T> {
    
    public boolean esVacia();
    public void push(T n);
    public void pop();
    public T top();
    public T poptop();
    public void vaciar();
    public int cantElementos();
    
    // Con fines didácticos
    public void mostrar();
    
}