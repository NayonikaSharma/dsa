import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //array of primitives
//        int[] arr = new int[5];
//        arr[0] = 23;
//        arr[1] = 3;
//        arr[2] = 78;
//        arr[3] = 88;
//        arr[4] = 17;

        //input using for loops
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = input.nextInt();
//        }

        //to String
//        System.out.println(Arrays.toString(arr));
//        for(int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }
        //for each  loop
//        for (int num : arr) { //for every element in array, print the element
//            System.out.print(num + " "); //here num represents element of array
//        }
//        System.out.println(arr[5]); //index out of bound error

        //array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++){
            str[i] = input.next();
        }
        System.out.println(Arrays.toString(str));

        //modify
        str[1] = "nayonika";
        System.out.println(Arrays.toString(str));
    }
}

