public class Human2 {
    public static void main(String[] args) {
        Human nayonika = new Human(19, "nayo", 2735126, false);
        Human samarth = new Human(18, "sammy", 3464627, false);

        System.out.println(Human.population);

        Main funn = new Main();
        funn.fun2();
    }

        //this is not dependent on objects
        static void fun(){
//            greeting(); //cant use it cuz it req an instance
//        //but the func you are using it in does not depend on instances

        //you cannot access non static stuff without referencing their instances in a static context

        //hence, here I am referencing it
        Main obj = new Main();
        obj.greeting();
        }

        void fun2(){
            greeting();
        }
//        //we know that something which is not static belongs to an object
        void greeting(){
//            fun();
            System.out.println("hello");
        }

}
