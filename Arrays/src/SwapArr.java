import java.util.Scanner;
import java.util.Arrays;

public class SwapArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Please enter 5 integers");

        for(int i = 0; i < 5; i++){
            arr[i] = input.nextInt();
        }

        int a,b;
        System.out.println("Please enter the indices");
        a = input.nextInt();
        b = input.nextInt();

        Swap(arr, a, b);

        System.out.println(Arrays.toString(arr));

        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void Swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            //swap
            Swap(arr, start, end);
            start ++;
            end --;
        }
    }
}
