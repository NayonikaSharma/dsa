import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        arr = mergeSort(arr); //original array is not being modified.
        //int[] ans = mergeSort(arr) and then printing "arr" will return the same array
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergeSort(int[] arr){ //will return a new array which will contain the same values as the og array in a sorted manner
        //base condition
        if(arr.length == 1){
            return arr;
        }
        //middle index to divide the array into two halves
        int mid = (arr.length)/2;

        //left half
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid)); //will copy the array till the specified range

        //right half
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length)); // "to index" is not included

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second){
        //ans array with size = size of first + size of second
        int[] ans = new int[first.length + second.length];

        int i = 0; //index of first
        int j = 0; //index of second
        int k = 0; //index of answer

        while(i < first.length && j < second.length){ //will come out of loop if one of these indices go out of bounds
            if(first[i] < second[j]){
                ans[k] = first[i];
                i++;
            } else {
                ans[k] = second[j];
                j++;
            }
            k++;
        }

        //it may be possible that one of these arrays is not finishes,
        //in that case add the remaining elements at the end

        while(i < first.length){ //while i is not finished, copy the remaining elements
            ans[k] = first [i];
            i++;
            k++;
        }

        while(j < second.length){
            ans[k] = second[j];
            j++;
            k++;
        }

        return ans;
    }
    //void because it is not returning anything since we are modifying the og array
    static void mergeSortInPlace(int[] arr, int start, int end){ //will return a new array which will contain the same values as the og array in a sorted manner
        //base condition
        if(end - start == 1){
            return;
        }
        //middle index to divide the array into two halves
        int mid = (start + end)/2;

        //left half
        mergeSortInPlace(arr, start, mid); //will copy the array till the specified range

        //right half
        mergeSortInPlace(arr, mid, end); // "to index" is not included

        mergeInPlace(arr, start, mid, end);
    }

    static void mergeInPlace(int[] arr, int start, int mid, int end){
        //ans array with size = size of first + size of second
        int[] ans = new int[end - start];

        int i = start; //index of first half in the same array(going from start to mid)
        int j = mid; //index of second half in the same array (going from mid to end)
        int k = 0; //index of answer

        while(i < mid && j < end){ //will come out of loop if one of these indices go out of bounds
            if(arr[i] < arr[j]){
                ans[k] = arr[i];
                i++;
            } else {
                ans[k] = arr[j];
                j++;
            }
            k++;
        }

        //it may be possible that one of these arrays is not finishes,
        //in that case add the remaining elements at the end

        while(i < mid){ //while i is not finished, copy the remaining elements
            ans[k] = arr[i];
            i++;
            k++;
        }

        while(j < end){
            ans[k] = arr[j];
            j++;
            k++;
        }

        for(int l = 0; l < ans.length; l++){
            arr[start + l] = ans[l];
        }
    }
}
