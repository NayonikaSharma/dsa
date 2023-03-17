import java.sql.SQLOutput;
import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); //converts to ASCII
        System.out.println("a" + "b"); //string concatenation
        System.out.println((char)('a' + 3)); //casting - it will get converted to ASCII and 3 will be added
        //to return corresponding letter - d
        System.out.println("a" + 1);
        //this is same as after a few steps: "a" + "1"
        //integer will be converted to Integer wrapper class that will call toString()

        System.out.println("Nayo" + new ArrayList<>());
        System.out.println("nayo" + new Integer(56));
        //System.out.println(new Integer(56) + new ArrayList<>()); ->will give error
//        + operator only works with primitives or when any one of the values is a String
        String ans = new Integer(56) +""+ new ArrayList<>(); //will work cuz we have " " string
        System.out.println(ans); //final type is String
    }
}
