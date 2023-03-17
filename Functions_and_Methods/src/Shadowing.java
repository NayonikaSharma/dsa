public class Shadowing { //using two var with the same name within the scope that overlaps
    static int x = 90; //this will be shadowed at line 7
    //static makes it object independent and you cannot use object dependent things in object independent things
    public static void main(String[] args) {
        System.out.println("In main: " + x); //90
        int x; //the class variable at line 2 is shadowed by this
//        System.out.println(x); //shadowing begins when value is initialised
        x = 40;
        System.out.println("overrides: " + x); //40
        fun();
    }
//      shadowing effect does not take place in methods
    static void fun(){
        System.out.println("In function: " + x);
    }
}
