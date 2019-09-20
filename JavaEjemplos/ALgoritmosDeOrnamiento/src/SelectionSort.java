import java.lang.reflect.Array;



public class SelectionSort {

    public int[] selectionSort(int[] array){
        int end = array.length-1;
        for(int current=0; current< end; current++){
            swap(current, menor(current, end, array), array);
        }
        return array;
    }

    public int menor(int current, int size, int[] array){
        int menor = current;
        for(int i = current; i < size; i++){
            if(array[i] < array[current]) {
                menor = i;
            }
        }
        return menor;

    }


    public void swap(int current, int menor, int[] array){
        int temp = array[current];
        array[current] = array[menor];
        array[menor] = temp;


    }

}
