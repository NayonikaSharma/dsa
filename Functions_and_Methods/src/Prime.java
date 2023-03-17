import java.util.Scanner;

public class Prime{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        isPrime(n);
    }
    static void isPrime(int n){
        if (n <= 1){
            System.out.println("not prime");
        }
        int div = 2;
        while (div < n){
            if (n % div == 0){
                System.out.println("not prime");
                break;
            }
            div++;
        }

    }
}
