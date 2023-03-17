import java.util.StringTokenizer;

public class Tokenizer {
    public static void main(String[] args) {
        String s1 = "I don't like oops, in fact I hate it.";
        StringTokenizer str = new StringTokenizer(s1, "abc");
        System.out.println(str.countTokens());
        while(str.hasMoreTokens()){
            System.out.println(str.nextElement());
        }
    }
}
