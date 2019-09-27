public class BinarySearch {


    public static void main(String[] args){

        int[] array = new int[] {4,4,5,5,6,8,9,11};
        System.out.println(binarySearch(array, 8));

    }


    public static int binarySearch(int[] array, int num){
        return BinarySearch(array, 0, array.length-1, num);
    }


    public static int BinarySearch(int[] array, int start, int length, int buscado){
        if(length >=1){
            int mid = length - start /2;
            System.out.println(start + " " + (length-1) + " = " + ((start + length-1) / 2));

            if(array[mid] == buscado){
                return mid;
            }

            if(array[mid] > buscado){
                return BinarySearch(array, start, mid -1, buscado);
            }else{
                return BinarySearch(array, mid+1, length, buscado);
            }
        }

        return -1;
    }
}
