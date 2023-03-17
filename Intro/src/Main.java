import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hey, how are you?");
        Scanner input = new Scanner(System.in); //creating an 'input' variable of the type 'Scanner'
        //Scanner is a class which specifies the input stream and using the variable/object of that class we can take input. It is in the java.util package.
       System.out.println(input.nextLine());

        System.out.println("你好");

    }
}