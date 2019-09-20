public class Main {

    public static void main(String[] args){

        SelectionSort selectionSort = new SelectionSort();
        BubbleSort bubbleSort = new BubbleSort();

        int[] lista = new int[] {9,8,7,6,5,4,2,2,1};
        int[] newLista = selectionSort.selectionSort(lista);
        int[] newLista2 = bubbleSort.bubbleSort(lista);
        MergeSort.MergeSort(lista);

        for(int i=0; i<lista.length-1; i++){
            System.out.print(newLista2[i] + ",");

        }
    }
}
