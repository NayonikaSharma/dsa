import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        int num = input.nextInt();
//        System.out.println(num);

        //Typecasting/narrowing conversion: Casting in compatible types.
//        int num = (int)(67.58f);
//        System.out.println(num);

        //Automatic type promotion in expressions
//        int a = 259;
//        byte b = (byte)(a); //max range of byte is 256. 257 % 256 = 1
//        System.out.println(b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a * b) / c;
//
//        System.out.println(d); //result of the intermediate operation a * b easily exceeds the range of byte.
//        // Java, automatically promotes each byte to int while evaluating this expression so that it is able to store it.

//        byte b = 50;
//        b = b * 2;

//        int number = 'A';
//        System.out.println(number);

        byte b = 42;
        char c = 'N';
        int i = 50000;
        short s = 1234;
        float f = 56.9f;
        double d = 0.23345;
        double result = (f * b) + (i / c) - (d * s);
        //float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);


    }
}
