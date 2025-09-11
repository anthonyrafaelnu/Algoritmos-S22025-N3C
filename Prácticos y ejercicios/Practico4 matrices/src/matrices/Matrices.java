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
        mostrarFilasImpares(mat);
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

}
