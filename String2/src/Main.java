public class Main {
    public static void main(String[] args) {
//        char[] charArr = {'N', 'a', 'y', 'o', 'n', 'i', 'k', 'a' };
//        String str = new String(charArr, 1, 6);
//        System.out.println(str);
//
//        byte[] bytes = {45, 60, 100, 34, 23};
//        String str2 = new String(bytes);
//        System.out.println(str2);
//
//        String s5 = new String("abc");
//        String s6 = new String("abc");
//        System.out.println(s5 == s6);
//        System.out.println(s5.equals(s6));

//        String str = new String("a");
//        str = new String("ab");
//        str = new String ("abc");
//        System.out.println(str);

//        String s1 = "a" + "b" + "c" + "d";
//
//        String s2 = "ab" + "cd";
//
//        String s3 = "abc" + "d";
//
//        String s4 = "a" + "bc" + "d";
//
//        if(s1 == s2) 		System.out.println("Hello");
//        else		System.out.println("Hi");
//
//        if(s2 == s3) 		System.out.println("Hello");
//        else		System.out.println("Hi");
//
//        if(s3 == s4) 		System.out.println("Hello");
//        else		System.out.println("Hi");

        String s1 = new String ("a" + "b" + "c" + "d");

        String s2 = new String ("ab" + "cd");

        String s3 = new String ("abc" + "d");

        String s4 = new String ("a" + "bc" + "d");

        if(s1 == s2) 		System.out.println("Hello");
        else		System.out.println("Hi");

        if(s2 == s3) 		System.out.println("Hello");
        else		System.out.println("Hi");

        if(s3 == s4) 		System.out.println("Hello");
        else		System.out.println("Hi");

        String strr = "abcd";
        strr = "pqrs";
        System.out.println(strr);

    }
}