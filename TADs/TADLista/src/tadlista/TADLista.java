package tadlista;

import dominio.Persona;

public class TADLista {

    public static void main(String[] args) {
        
        ListaNodos lista = new ListaNodos();
        
//        lista.agregarInicio(3);
//        lista.agregarInicio(2);
//        lista.agregarInicio(1);
        
//        lista.agregarFinal(5);
//        
//        lista.agregarOrd(4);
//        lista.agregarOrd(6);
//        lista.agregarOrd(0);
//        lista.agregarOrd(4);
        
//        lista.borrarElemento(10);

        Persona p1 = new Persona("Rafa", 24, 3);
        Persona p2 = new Persona("Manuel", 26, 1);
        Persona p3 = new Persona("José", 21, 3);
        
        lista.agregarOrd(p1);
        lista.agregarOrd(p2);
        lista.agregarOrd(p3);
        
        lista.mostrar();
        System.out.println("Cantidad: " + lista.cantElementos());
    }
    
}
