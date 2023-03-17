public class ReverseDigits {
    public static void main(String[] args) {
        int num = 72843;
        int rem;

        int reverse = 0;
        while(num > 0){
            rem = num % 10;
            num /= 10;

            reverse = 10 * reverse + rem;
        }
        System.out.println(reverse);
    }
}
