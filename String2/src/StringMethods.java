import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        byte[] arr = new byte[10];
        String s = "Java";
        arr = s.getBytes();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

        String s1 = "Nayonika";
        System.out.println(Arrays.toString(s1.toCharArray()));

        String name = new String("Object");
        System.out.println(name.startsWith("ject" , 2));
        System.out.println(name.endsWith("ect"));

    }
}
