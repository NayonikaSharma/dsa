class Box {
    double length, breadth, height;

    Box(double length, double height, double breadth) throws InvalidDimensionException{
        this.length = length;
        this.breadth = breadth;
        this.height = height;
        if(length <= 0 || breadth <=0 || height <= 0){
            throw new InvalidDimensionException();
        }

    }
    double area(){
        return 2*(length * height + length * breadth + height * breadth);
    }
}
class InvalidDimensionException extends RuntimeException{
    InvalidDimensionException(){
        System.out.println("Invalid Dimension");
    }
    InvalidDimensionException(double dimension){
        System.out.println("Invalid Dimension:" +dimension);
    }
}
public class Driver{
    public static void main(String[] args) {
        try{
            Box b1 = new Box(10,0,5);
            System.out.println(b1.area());
        }catch(InvalidDimensionException e){
            System.out.println(e);
        }
    }
}
