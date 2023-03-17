import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//        //for loop: you know how many times the loops will run
//        System.out.print("Please enter an integer: ");
//
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//
//        for(int i = 1; i <= n; i++){
//            System.out.print(i + " ");
//        }

//        //while loop: you don't know how many times the loop will run
//        int count= 1;
//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        while(count <= num){
//            System.out.print(count + " ");
//            count +=1 ;
//        }

        //do-while loop:loop will execute atleast once
        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while (n <= 5);
    }
}