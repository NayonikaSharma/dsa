import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        //store 5 roll nos
        int[] roll = new int[5];

        //store 5 names
        String[] names = new String[5];

        //data of 5 students: {roll no, name, marks}
        int[] rollno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];


        //create an object of Student class
        Student[] student = new Student[5];

        Student nayonika = new Student(34, "chiya", 90); //will invoke the constructor with 3 arguments
        Student samarth = new Student(); //will invoke the constructor without any arguments


        //nayonika ref variable is of type Student(our own datatype which we just created)
        //it will have 3 properties {roll, name, marks}
//        System.out.println(Arrays.toString(student));

//        nayonika.rno = 12;
//        nayonika.name = "Nayonika Sharma";
//        nayonika.marks = 97.2f;

        System.out.println(nayonika.rno); //when not initialised, the value of int is 0 by default
        System.out.println(nayonika.name); //null
        System.out.println(nayonika.marks); //0.0

        System.out.println(samarth.rno);
        System.out.println(samarth.name);
        System.out.println(samarth.marks);

        Student random = new Student(nayonika);
        System.out.println(random.rno);
        System.out.println(random.name);
        System.out.println(random.marks);

        Student random2 = new Student();
        System.out.println(random2.name);


        nayonika.changeName("Nayonika Sharma");
        nayonika.greeting();

        Student one = new Student();
        Student two = one; //any change made via one will also be reflected via two
        one.name = "blah";
        System.out.println("name via one: " + one.name);
        System.out.println("name via two: " + two.name);
    }

    //create a class
    //for every single student
    static class Student{
        int rno;
        String name;
        float marks = 67;

        void greeting(){
            System.out.println("Hello! My name is " + name + "!!");
        }

        void changeName(String newName){
            name = newName;
        }
        //Constructor
        //we need a way to add the values of the above
        // properties object by object

        //we need one word to access every object
        Student(){
//            this.rno = 12;
//            this.name = "Nayonika";
//            this.marks = 89.2f;
//            //'this' keyword will automatically replace itself
//            // with the name of the object

            //this is how you call  a constructor from another constrctor(comment above lines)
            //needs to be empty
            //internally: new Student(13, "default person", 100.0f)
            this(13, "default person", 100.0f); //in this case 'this' is replaced by Student constructor(name of class)

        }
        //Student arpit = new Student(17, "Arpit", 87.5f
        //here, this will be replaced with arpit
        Student(int rno, String name, float marks){
            this.rno = rno;
            this.name = name; //name = name which is passed
            this.marks = marks; //internally, it will work like nayonika.marks (this gets replaced by the name of the reference variable)
        }
        Student(Student other){
            this.rno = other.rno;
            this.name = other.name;
            this.marks = other.marks;
        }
    }
}
