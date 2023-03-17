public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 5;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }
    //return index where the element is found in array
    // we will pass start and end in the arguments instead of the body
    //because we need to pass it at every function call
    static int search(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;

        if(target == arr[mid]){
            return mid;
        }
        if(target > arr[mid]){
            //make sure to return the result of a function call of the return type
            return search(arr, target, mid + 1, end);
        }
        return search(arr, target, start, mid - 1);
    }
}
