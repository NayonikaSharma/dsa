import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr){
        //i will run till n - 2
        for(int i = 0; i < arr.length - 1; i ++){
            //j will run from i + 1 and will always be > 0
            for (int j = i + 1; j > 0 ; j--) {
                if(arr[j] < arr[j - 1]){
                    swap(arr, j, j-1);
                }else{
                    break;
                }

            }
        }

    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
