public class Box {
    double l;
    double b;
    double h;
    double area;
    //constructor
    Box(){
        this.l = -1;
        this.b = -1;
        this.h = -1;
        this.area = l * b * h;
    }
    Box(double side){
        this.l = side;
        this.b = side;
        this.h = side;
        this.area = l * b;
    }
    Box(double length, double breadth, double height){
        this.l = length;
        this.b = breadth;
        this.h = height;
        this.area = length * breadth * height;
    }
    Box(Box old){
        this.l = old.l;
        this.b = old.b;
        this.h = old.h;
        this.area = l * b * h;
    }
    public void displayArea(){
        System.out.println("Running...");
    }
}

