public class Main {
    public static void main(String[] args) {
        int[] array = {11, 90, -23, 67, 45, -86, 17, 38, 56};
        int key = 8;
        int ans = linear_search1(array, key);
        System.out.println(key + " found at index " + ans);
    }


    //search in the array: return the index if item found
    //otherwise if item not found return -1
    static int linear_search1(int[] arr, int key){
        if(arr.length == 0){
            return -1;
        }

        //run a for loop
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] == key){
                return i;
                //when you return some value in the function, function gets over
            }
        }
        //this line will execute if none of the return statements above were executed
        //hence target not found
        return -1;
    }

    //search the array and return the target
    static int linear_search2(int[] arr, int key){
        if(arr.length == 0){
            return -1;
        }

        //run a for loop
        for(int element : arr){
            if(element == key){
                return element;
                //when you return some value in the function, function gets over
            }
        }
        //this line will execute if none of the return statements above were executed
        //hence target not found
        return Integer.MAX_VALUE; //could be possible that the target = -1, so don't return -1.
    }

    //search the array and return true or false
    static int linear_search3(int[] arr, int key){
        if(arr.length == 0){
            return -1;
        }

        //run a for loop
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] == key){
                return i;
                //when you return some value in the function, function gets over
            }
        }
        //this line will execute if none of the return statements above were executed
        //hence target not found
        return -1;
    }
}