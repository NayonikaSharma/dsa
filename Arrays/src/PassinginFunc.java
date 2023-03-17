import java.util.Arrays;

public class PassinginFunc {
    public static void main(String[] args) {
        int[] nums = {100,98,97,95};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0] = 99;
    }
}
