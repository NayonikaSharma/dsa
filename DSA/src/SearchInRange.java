public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {12,78,-26,14,39,64};
        int key = 39;
        System.out.println("element found at index "+SearchInRange2(arr, key, 1,4));
    }
    static boolean SearchInRange(int[] arr, int key, int start, int end){
        if(arr.length == 0){
            return false;
        }
        for(int index = start; index <= end; index++){
            if(arr[index] == key){
                return true;
            }
        }
        return false;
    }
    static int SearchInRange2(int[] arr, int key, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int index = start; index <= end; index++){
            if(arr[index] == key){
                return index;
            }
        }
        return -1;
    }
}

