public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(SumOfDigits(1));
    }

    static int SumOfDigits(int n){
        if(n == 0){
            return 0; //for product, if one dig is remaining return the digit itself
            //n % 10 == n -> return n
        }
        int Sum = SumOfDigits(n/10) + (n % 10);
        return Sum;
    }
}
