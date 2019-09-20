public class MergeSort {


    public static void MergeSort(int[] array){
        if(array == null){
            return;
        }
        if(array.length > 1){
            int mid = array.length/2;

            int[] left = new int[mid];
            for(int i=0; i< mid; i++){
                left[i] = array[i];
            }
            int[] right = new int[array.length- mid];
            for(int i=mid; i<array.length; i++){
                System.out.println(i);
                right[i] = array[i];
            }

            MergeSort(left);
            MergeSort(right);


            int i=0;
            int j=0;
            int k=0;

            while(i < left.length && j < right.length){
                if(left[i] < right[i]){
                    array[k] = left[i];
                    i++;
                }else{
                    array[k] = right[i];
                    i++;
                }
                k++;
            }

            while( i < left.length){
                array[k] = left[i];
                i++;
                k++;
            }

            while( i < right.length){
                array[k] = right[i];
                i++;
                k++;
            }
        }
    }
}
