public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        //just declaring
        Student nayonika = new Student(15, "Nayonika s", 67.8f);
        Student random = new Student(nayonika);
//        nayonika.rno = 13;
//        nayonika.name = "Nayonika Sharma";
//        nayonika.marks = 97.2f;

//        nayonika.changeName("nayo");
//        nayonika.greeting();
//        samarth.greeting();

        System.out.println(nayonika.rno); //default value = 0
        System.out.println(nayonika.name); //default value is null
        System.out.println(nayonika.marks); //default value is 0.0
        System.out.println(random.name);
    }
    //create a class

}
class Student{
    int rno;
    String name;
    float marks;

    void greeting(){
        System.out.println("Hello, my name is " + this.name);
    }

    void changeName(String newName){
        name = newName;
    }
    //we need a way to add the values of the above
    //properties object by object

    //we need one word to access every object

    Student(){
        this.rno = 14;
        this.name = "Nayonika Sharma";
        this.marks = 97.2f;


    }
    //Student samarth = new Student(17,samarth,90);
    //here, this will be replaced by samarth
    Student(int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    //passing another object
    Student(Student other){
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }
}