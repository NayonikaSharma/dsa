public class BoxWeight extends Box{
    //although a subclass can use all the members of the parents class, it will not be able to access the ones that are private
    double weight;

    BoxWeight(){
        this.weight = 3;
    }
    BoxWeight(double length, double breadth, double height, double weight){
        super(length, breadth, height); //super keyword invokes the parent class constructor
        //used to initialise values present in parent class
        this.weight = weight;

    }
}
