public class Fibo {
    public static void main(String[] args) {
        System.out.println(fibo(7));
    }
    static int fibo(int n){
        //base case
        //fibo(1) = 1 & fibo(0) = 0
        if(n < 2){
            return n;
        }

        //not tail recursion
        return fibo(n - 1) + fibo(n - 2);
    }
}
