package matrices;

public class Matrices {

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3},
                      {4, 15, 6},
                      {7, 8, 9}};

        //invertir(mat[1]);
        //mostrarMatriz(mat);
        //mostrarDiagonal2(mat);
        //System.out.println("Máximo: " + maximoMatriz(mat));
        //mostrarColumna(mat, 1);
        //mostrarFila(mat, 2);
        //mostrarFilasImpares(mat);
        //System.out.println("Está elemento en matriz: " + buscarElementoEnMatriz(mat, 11));
        //mostrarSumaCol(mat);
        //System.out.println("Tiene 3 consecutivos: " + tieneTresConsecutivosEnFila(mat));
        //diagonalInversa(mat);
        diagonalInversaRec(mat, 2);
    }

    public static void mostrarMatriz(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void mostrarDiagonal1(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j) {
                    System.out.println(mat[i][j] + " ");
                }
            }
        }
    }

    public static void mostrarDiagonal2(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            System.out.println(mat[i][i]);
        }
    }

    public static int maximoMatriz(int[][] mat) {
        int max = mat[0][0];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] > max){
                    max = mat[i][j];
                }
            }
        }
        return max;
    }
    
    public static void mostrarColumna(int[][] mat, int col){
        for (int i = 0; i < mat.length; i++) {
            System.out.println(mat[i][col]);
        }
    }
    
    public static void mostrarFila(int[][] mat, int fila){
        for (int j = 0; j < mat[fila].length; j++) {
            System.out.print(mat[fila][j] + " ");
        }
    }
    
    public static void mostrarFilasImpares(int[][] mat){
        for (int i = 1; i < mat.length; i+=2) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public static void invertir(int[] vec) {
        int aux = 0;

        for (int i = 0; i < vec.length / 2; i++) {
            aux = vec[i];
            int ultimaPos = vec.length - 1;
            vec[i] = vec[ultimaPos - i];
            vec[ultimaPos - i] = aux;
        }
    }

    public static boolean buscarElementoEnMatriz(int[][] mat, int elemento){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] == elemento) return true;
            }
        }
        return false;
    }
    
    public static void mostrarSumaCol(int[][] mat){
        for (int col = 0; col < mat[0].length; col++) {
            int contador = 0;
            for (int fila = 0; fila < mat.length; fila++) {
                contador+= mat[fila][col];
            }
            System.out.println("Suma de col " + col + " = " + contador);
        }
    }

    public static boolean tieneTresConsecutivosEnFila(int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            int contador = 1;
            for (int j = 0; j < mat[i].length - 1; j++) {
                if(mat[i][j] == mat[i][j+1]){
                    contador ++;
                    if(contador == 3) return true;
                }else{
                    contador = 1;
                }
            }
        }
        return false;
    }

    public static int maximoEntreCol(int[][] mat, int fila1, int fila2){
        int max = mat[fila1][0];
        for (int col = 0; col < mat[fila1].length; col++) {
            if(mat[fila1][col] > max){
                max = mat[fila1][col];
            }
            if(mat[fila2][col] > max){
                max = mat[fila2][col];
            }
        }
        return max;
    }
    
    public static void diagonalInversa(int[][] mat){
        for (int i = mat.length - 1; i >= 0; i--) {
            System.out.println(mat[i][i]);
        }
    }
    
    public static void diagonalInversaRec(int[][] mat, int pos){
        if(pos == 0) {
            System.out.println(mat[pos][pos]);
        }else{
            System.out.println(mat[pos][pos]);
            diagonalInversaRec(mat, pos - 1);
        }
    }
}