//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

public class StepsToZero {
    public static void main(String[] args) {

    }

    public int numberOfSteps(int num) {
        return helper(num, 0);

    }

    private int helper(int num, int steps) {
        //base case
        if (num == 0) {
            return steps;
        }

        if (num % 2 == 0) {
            return helper(num / 2, steps + 1);
        }

        return helper(num - 1,steps + 1);
    }
}
