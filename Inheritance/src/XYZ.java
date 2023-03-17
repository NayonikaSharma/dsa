 class X{
    int x;

    X(){
        this.x = x;
    }

    X(int x){
        this.x = x;
        System.out.println("This is constructor X");
    }

    void print(){
        System.out.println("x=" +x);
    }
    void show(){
        System.out.println("Display X");
    }
}
class Y extends X{
    int y;
    int z;

    Y(){
        this.y = y;
        this.z = z;
    }
    Y(int x, int y, int z){
        super(x);
        this.y = y;
        this.z = z;
        System.out.println("This is constructor Y");
    }
    void show(){
        super.show();
        System.out.println("Y=" +y);
        System.out.println(("Z =" +z));


    }

}
public class XYZ{
    public static void main(String[] args) {
        Y obj = new Y(1,2,3);
        obj.show();
    }
}
