import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        //Q. Find the largest od the three numbers.

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

//        int max = a;
//        if(b > a){
//            max = b;
//        }
//        if(c > max){
//            max = c;
//        }
//        System.out.print("The largest of the three numbers is " +max);

        int max = 0;
        if(a > b){
            max = a;
        }else{
            max = b;
        }
        if(c > max){
            max = c;
        }
        System.out.println(max);

//        int max = Math.max(c,Math.max(a,b));
//        System.out.println(max);


    }
}
