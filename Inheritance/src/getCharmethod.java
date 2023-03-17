import java.nio.charset.StandardCharsets;

public class getCharmethod {
    public static void main(String[] args) {
//        String s = "Hello my name is nayonika";
//        char[] chars = new char[20];
//        s.getChars(4, 18, chars, 15 );
//        System.out.println(chars);

//        byte[] values = "Nayonika".getBytes();
//        for (int i = 0; i < values.length; i++) {
//            System.out.print(values[i] + " ");
//        }

        byte[] bytes = new byte[10];
        String s2 = "java";
        bytes = s2.getBytes();
        for(int i = 0; i < bytes.length; i++){
            System.out.print(bytes[i] + ",");
        }



    }
}
