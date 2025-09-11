package vectores;

public class Vectores {

    public static void main(String[] args) {
        int[] vec = {6, 3, 5, 1, 8, 7, 2, 4};
        //System.out.println(mostrarv(vec));
        //System.out.println(promedio(vec));
        //muestroPosParesV2(vec);
        invertir(vec);
        mostrarv(vec);
    }
    
    public static void mostrarv(int []v){
        for (int i = 0; i < v.length - 1; i++) {
            System.out.print(v[i] + " - ");
        }
        System.out.print(v[v.length-1]);
    }
    
    public static String mostrarvStr(int []v){
        String ret = "";
        
        for (int i = 0; i < v.length - 1; i++) {
            ret += v[i] + " - ";
        }
        ret += v[v.length-1];
        
        return ret;
    }
    
    public static double promedio(int []v){
        double suma = 0;
        
        for (int i = 0; i < v.length; i++) {
            suma += v[i];
        }
        
        return suma/v.length;
    }

    public static void muestroPosParesV1(int v[]){
        for (int i = 0; i < v.length; i++) {
            if(i%2 == 0){
                System.out.print(v[i] + " ");
            }
        }
    }
    
    public static void muestroPosParesV2(int v[]){
        for (int i = 0; i < v.length; i+=2) {
            System.out.print(v[i] + " ");
        }
    }
    
    public static void invertir(int[] vec){
        int aux = 0;
        
        for (int i = 0; i < vec.length / 2; i++) {
            aux = vec[i];
            int ultimaPos = vec.length-1;
            vec[i] = vec[ultimaPos-i];
            vec[ultimaPos-i] = aux;
        }
    }
}
