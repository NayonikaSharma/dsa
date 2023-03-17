import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
        String personalised = MyGreet(name);
        System.out.println(personalised);

    }
        static String MyGreet(String name){
            String message = "Hello " + name + "!!";
            return message;
        }
        static String greet(){
            String greeting = "Hey how are you?";
            return greeting;
        }
}
