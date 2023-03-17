
public class Palindrome {
    static int sum = 0;

    static int reverse(int n){
        if(n == 0){
            return n;
        }

        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse(n / 10);

        return n;
    }

        static boolean palin(int n){
        int xyz=reverse(n);
        if(n==xyz){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int abc=619;
        System.out.println(palin(abc));
        print(9);
    }
    public static void print(int num){
        if(num==0){
            return;
        }
        System.out.println("nayonika is gay");
        print(num-1);

    }

}
