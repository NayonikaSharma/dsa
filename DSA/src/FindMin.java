public class FindMin {
    public static void main(String[] args) {
        int[] arr = {12,-21, 57, 99, -68, 54, -2};
        System.out.println(min(arr));
    }
    //assume arr.length!= 0
    // return the min value in array
    static int min(int[] arr){
        int min = arr[0];
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
