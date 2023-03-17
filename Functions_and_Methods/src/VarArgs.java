import java.util.Arrays;

//variable length arguments: no. of inputs is unknown
//if length is 0, it will print an empty arr
public class VarArgs {
    public static void main(String[] args) {
        var1(1,78,90,34,62,12,38);
        var2("hey how are you?");
        multiple(2, 3, "nayo", "sammy");
    }
    static void var1(int ...v){ //internally stores it as an array
        System.out.println(Arrays.toString(v));
    }
    static void var2(String ...s){
        System.out.println(Arrays.toString(s));
    }
    static void multiple(int a, int b, String ...v){ //var length args always at the end

    }
    //overloading
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
