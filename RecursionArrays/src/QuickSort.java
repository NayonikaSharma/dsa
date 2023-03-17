import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] nums, int low, int high){
        if(low >= high){
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = nums[m];

        while(s <= e){

            //also a reason why if its already sorted it will not swap
            while(nums[s] < pivot){
                s++;
            }

            while(nums[e] > pivot){
                e--;
            }
            //this check will only happen once the body above has finished executing
            if(s <= e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
            //now my pivot is at the correct position so sort the two halves
            quickSort(nums, low, e);
            quickSort(nums, s, high);
        }
    }
}
