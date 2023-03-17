public class BinarySearch2 {
    public static void main(String[] args) {
        int[] arr = {99, 87, 65, 59, 44, 30, 23, 12, -4, -17, -87};
        int key = 12;
        System.out.println(binarysearch2(arr, key));
    }
    static int binarysearch2(int[] arr, int key){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(key > arr[mid]){
                end = mid - 1;
            }
            else if(key < arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
