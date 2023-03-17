public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {-14, -8, -1, 0, 3, 13, 19, 23, 45, 89};
        int key = 23;
        int ans = binarySearch(arr, key);
        System.out.println(ans);

    }
    //return the index
    //return -1 if it doesn't exist
    static int binarySearch(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){

//            int mid = (start + end) / 2 // if the numbers are very large, the sum (start + end) may exceed the int range.
            //better way to find mid
            int mid = start + (end - start) / 2;

            if (key < arr[mid]){
                end = mid - 1;
            } else if (key > arr[mid]){
                start = mid + 1;
            } else{
                return mid;
            }
        }
        return -1;
    }
}
