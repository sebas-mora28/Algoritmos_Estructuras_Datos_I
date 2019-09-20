import java.util.List;

public class BubbleSort {


    public int[] bubbleSort(int[] array){
        for(int i=0; i < array.length -1; i++) {
            for (int current = 0; current < array.length - 2; current++) {
                if (array[current] > array[current + 1]) {
                    int temp = array[current];
                    array[current] = array[current + 1];
                    array[current + 1] = temp;
                }
            }
        }
        return array;
    }
}
