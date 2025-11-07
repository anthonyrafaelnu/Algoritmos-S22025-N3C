package tadlista;

import dominio.Persona;

public class TADLista {

    public static void main(String[] args) {
        ListaNodos lista = new ListaNodos();
        
        lista.agregarInicio(4);
        lista.agregarInicio(3);
        lista.agregarInicio(2);
        lista.agregarInicio(1);
        
        ListaNodos otraLista = new ListaNodos();
        
        otraLista.agregarInicio(4);
        otraLista.agregarInicio(3);
        otraLista.agregarInicio(2);
        otraLista.agregarInicio(1);
        
        // 1 -> 2 -> 3 -> 4
        
        //lista.mostrarInverso();
        //System.out.println("Suma de pares: " + lista.sumaPares());
        //System.out.println("Está el elemento: " + lista.estaValor(7));
        //System.out.println("Son iguales: " + lista.sonIguales(otraLista.lista));
        //lista.mostrarHasta(lista.cantElementos());
        //System.out.println("Está ordenada: " + lista.estaOrdenada());
        
        int[][] mat = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        
        diagonalPrincipal(mat);
    }
    
    public static void diagonalPrincipal(int mat[][]){
        diagonalPrincipalRec(mat, 0);
    }
    
    public static void diagonalPrincipalRec(int mat[][], int i){
        if(i <= mat.length - 1) {
            System.out.println(mat[i][i]);
            diagonalPrincipalRec(mat, i + 1);
        }
    }
    
    public void mostrarColumna(int mat[][], int col){
        mostrarColumnaRec(mat, col, 0); 
    }
    
    public void mostrarColumnaRec(int mat[][], int col, int fila){
        if(fila < mat.length){
            System.out.println(mat[fila][col]);
            mostrarColumnaRec(mat, col, fila + 1);
        }
    }
    
}
