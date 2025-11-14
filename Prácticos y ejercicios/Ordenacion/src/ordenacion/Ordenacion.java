package ordenacion;

public class Ordenacion {

    public static void main(String[] args) {
        int[] test = {3,1,5,2,5,8};
        insertionSort(test);
        mostrar(test);
    }
    
    public static void mostrar(int[] array){
        mostrarRec(array, 0);
    }
    
    public static void mostrarRec(int[] array, int pos){
        if(pos < array.length){
            System.out.print(array[pos] + " ");
            mostrarRec(array, pos + 1);
        }
    }
    
    public static void selectionSort(int[] array){
        
        for (int i = 0; i < array.length - 1; i++) {
            
            int menor = array[i];
            int posMenor = i;
            
            for (int j = i + 1; j < array.length; j++) {
                if(array[j] < menor){
                    posMenor = j;
                    menor = array[j];
                }
            }
            
            array[posMenor] = array[i];
            array[i] = menor;
        }
        
    }
    
    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if(array[j] > array[j+1]){
                    int aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
            }
        }
    }
    
    public static void insertionSort(int[] array){
        
        for (int i = 1; i < array.length; i++) {
            
            int valorAInsertar = array[i];
            int j = i - 1;
            
            while(j >= 0 && valorAInsertar <= array[j]){
                array[j + 1] = array[j];
                j--;
            }
            
            array[j + 1] = valorAInsertar;
        }
    }
    
}

