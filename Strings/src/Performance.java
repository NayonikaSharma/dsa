public class Performance {
    public static void main(String[] args) {
        String letters = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            System.out.println(ch);
            letters = letters + ch; //will concatenate the strings
        }
        System.out.println(letters);
    }
}
