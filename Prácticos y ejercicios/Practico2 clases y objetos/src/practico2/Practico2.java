
package practico2;


public class Practico2 {

    public static void main(String[] args) {
        //fibonacciI(6);
        //System.out.println(fibonacci(6));
//        for (int i = 0; i < 2; i++) {
//            System.out.println(fibonacci(i) + " ");
//        }

//        Persona p = new Persona("Rafa", "Núñez", 24);
//        System.out.println(p.toString());
        
        Socio s1 = new Socio("Martin");
        Socio s2 = new Socio("Alejo");
        
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
    
    public static void fibonacciI(int n){
        
        int num_ant = 0;
        int num_ant_2 = 1;
        
        String respuesta = "";
        
        for (int i = 0; i < n; i++) {
            respuesta += num_ant + " ";
            num_ant = num_ant_2 + num_ant;
            num_ant_2 = num_ant - num_ant_2;
        }
        
        System.out.println(respuesta);
        
    }
    
    public static int fibonacci(int n){
        if(n == 1) return 0;
        if(n == 2) return 1;
        
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
}
