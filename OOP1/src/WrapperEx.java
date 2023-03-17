public class WrapperEx {
    public static void main(String[] args) {
        int a = 10;
        //Boxing: converting primitive datatypes into objects by putting them in a wrapper class
        Integer num1 = a; //auto-boxing
        System.out.println(num1);
        Integer num2 = Integer.valueOf(a); //boxing
        System.out.println(num2);

        //Unboxing: objects to primitive data types
        Integer i = new Integer(150);
        int b = i.intValue(); //unboxing
        System.out.println(b);
        int c = i;
        System.out.println(c); //auto-unboxing

        //final keyword
        final int BONUS = 2;
//        BONUS = 3; //error cuz we can't modify it

        final A nayonika = new A("Nayonika Sharma");
        nayonika.name = "Nayo";
        //when a non-primitive is final, you  cannot reassign it
//        nayonika = new A("new obj"); //can't do it cuz it has been finalized

    }
}
class A{
    final int num = 10;
    String name;

    //constructor
    A(String name){
        this.name = name;
    }
}
