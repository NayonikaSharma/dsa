public class Human {
   int age;
   String name;
   int salary;
   boolean married;
   static int population; //can use even without creating an object for the class
    static void message(){
        System.out.println("hello");
        //System.out.println(this.age); //cannot use this over here
    }

   public Human(int age, String name, int salary, boolean married){
       this.age = age;
       this.name = name;
       this.salary = salary;
       this.married = married;
       Human.population += 1;
//       when a member is declared static it can be accessed before any of the object os the class is being created and without referencing to that object
   }
}

