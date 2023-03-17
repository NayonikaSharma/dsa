import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Nayonika";
        char key = 'o';
        System.out.println(search(name, key)); //method1

        System.out.println(Arrays.toString(name.toCharArray())); //creates a char array
        System.out.println(search2(name, key)); //method2

    }
    static boolean search2(String str, char key){
        if(str.length() == 0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(ch == key){ //to get the char at a particular index in a string use charAt
                return true;
            }
        }
        return false;
    }

    static boolean search(String str, char key){
        if(str.length() == 0){
            return false;
        }
        for(int i = 0; i < str.length(); i ++){
            if(key == str.charAt(i)){ //to get the char at a particular index in a string use charAt
                return true;
            }
        }
        return false;
    }
}
