public class SkipAString {
    public static void main(String[] args) {
        System.out.println(skipAppNotApple("dbapplfg"));
    }
    //skip "apple"
    static String skipApple(String og){
        if(og.isEmpty()){
            return "";
        }
        char ch = og.charAt(0);

        if(og.startsWith("apple")){
            return skipApple(og.substring(5)); //apple size is 5
        } else {
            return ch + skipApple(og.substring(1));
        }
    }

    //skip app only when it is not equal to apple
    static String skipAppNotApple(String str){
        if(str == ""){
            return "";
        }

        if(str.startsWith("app") && !str.startsWith("apple")){
            return skipAppNotApple(str.substring(3));
        } else {
            return str.charAt(0) + skipAppNotApple(str.substring(1));
        }
    }
}
