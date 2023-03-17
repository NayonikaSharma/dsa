class A
{
     int a = 20;	// instance-field
} // End of class A
class B extends A
{
    private	int	a = 30;
    void show()
    {
        int	a = 50;
        System.out.println("a: " + a);
        System.out.println("a: "+ this.a);
        System.out.println("a: "+ super.a);
    }// End of Method
}// End of class B
public class AB{
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}

