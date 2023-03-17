import java.sql.Struct;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        //just declaring
        Student nayonika = new Student();
        Student samarth = new Student();
//        nayonika.rno = 13;
//        nayonika.name = "Nayonika Sharma";
//        nayonika.marks = 97.2f;
        nayonika.greeting();
        samarth.greeting();

//        System.out.println(nayonika.rno); //default value = 0
//        System.out.println(nayonika.name); //default value is null
//        System.out.println(nayonika.marks); //default value is 0.0
    }
    //create a class
    static class Student{
        int rno;
        String name;
        float marks;

        void greeting(){
            System.out.println("Hello, my name is " + this.name);
        }
        //we need a way to add the values of the above
        //properties object by object

        //we need one word to access every object

        Student(){
            this.rno = 14;
            this.name = "Nayonika Sharma";
            this.marks = 97.2f;

        }
    }
}