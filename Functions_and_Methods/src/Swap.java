import java.util.Scanner;

public class Swap{
    public static void main(String[] args) {
        //swap();
        //swap2(12, 67);
        int a = 12;
        int b = 67;
        swap2(a, b);
        System.out.println(a+" "+b);

          //not going to work
//        String name = "Samarth";
//        changeName(name);
//        System.out.println(name);
    }
//    static void swap(){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the numbers: ");
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int temp = 1;
//        temp = a;
//        a = b;
//        b = temp;
//        System.out.println("The numbers after swapping are: " +a+ " and " +b);
//    }
    static void swap2(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        //System.out.println("In function: "a +" "+ b);

    }
    static void changeName(String naam){
        naam = "Nayonika"; //creating a new object, not modifying it.
        //variables initialised inside a function cannot be accessed outside the function
    }
}