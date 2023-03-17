public class FirstMissingPositive {
    //https://leetcode.com/problems/first-missing-positive/
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(firstMissingPositive(arr));

    }
    static int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]){
                swap(nums, i, correct);
            } else {
                i ++;
            }
        }
        //find missing positive
        for(int index = 0; index < nums.length; index ++){
            if(nums[index] != index + 1){
                return index + 1;
            }
        }
        //case 2: all the elements from 1 to N are present, ans = N + 1
        return nums.length + 1;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
