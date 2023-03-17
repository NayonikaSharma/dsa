import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Nayonika Sharma";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println("   nayonika   ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
