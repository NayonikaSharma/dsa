 class Bicycle {

    int speed;
    int gear;

    Bicycle(){
        this.gear = 1;
        this.speed = 1;
    }
    Bicycle(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }
    public void brake(){
        speed = speed - 1;
    }
    public void accelerate(){
        speed = speed + 2;
    }
    public String display(){
        return(" speed: " +speed+ " gear: "+gear);
    }
}
 class Bike extends Bicycle{
    int seatHeight;

    Bike(){
        this.seatHeight = 1;
    }
    Bike(int speed, int gear, int seatHeight){
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

     void newHeight(int newVal){
        this.seatHeight = newVal ;
     }

     //method overriding
     @Override
     public String display() {
         return (super.display() + " new Height: "+seatHeight);
     }
 }
 public class Test{
     public static void main(String[] args) {
         Bike obj = new Bike(5, 6, 2);
         Bike obj2 = new Bike();
         Bicycle obj3 = new Bicycle();

         obj.accelerate();
         obj.brake();
         obj.accelerate();
         obj.newHeight(3);
         System.out.println(obj.display());

         System.out.println(obj2.display());

         System.out.println(obj3.display());
     }
 }
