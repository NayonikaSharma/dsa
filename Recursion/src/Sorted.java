public class Sorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 19, 12};
        System.out.println(sorted(arr, 0));
    }

    static boolean sorted(int[] arr, int index){
        //base case
        if(index == arr.length - 1){
            return true;
        }

        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }
}
