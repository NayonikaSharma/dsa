public class SkipAChar {
    public static void main(String[] args) {
        String ans = "";
        String og = "baccad";
        skip(ans, og);
        System.out.println(skip(og));
    }
    //return a new string with all A's removed
    //approach 1: answer string in argument
    static void skip(String ans, String og){

        //base condition
        if(og.isEmpty() == true){
            System.out.println(ans);
            return;
        }

        char ch = og.charAt(0);

        if(ch == 'a'){
            skip(ans, og.substring(1));
        } else {
            skip(ans + ch, og.substring(1) );
        }
    }

    //approach 2: only og string in arg
    static String skip(String og){
        //base case
        if(og.isEmpty() == true){
            return "";
        }

        char ch = og.charAt(0);

        if(ch == 'a'){
            return skip(og.substring(1));
        } else {
            return ch + skip(og.substring(1));
        }
    }
}