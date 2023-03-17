public class WrapperExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //wrapper class: using primitives as an object
        Integer num = 45;
        swap(a, b); //value won't change, cuz in primitives it is passed by value but when you pass objects, the ref value is passed.

        //final:keyword that prevents your work to be modified
        //this immutability is only true for primitives
//        final int bonus = 3;
//        bonus = 2;
        //always initialise while declaring it
        final A nayonika = new A("nayonika sharma");
        nayonika.name = "other name";
        //when a non-primitive is final, you cannot reassign it.
        //nayonika = new A("new object");

    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

}
class A{
    final int num = 10;
    String name;

    A(String name){
        this.name = name;
    }
}
