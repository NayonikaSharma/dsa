class One
{
    void showw(int a, int b)
    {
        System.out.println("Hello ! This is show() in A");
    }// End of show() Method

} // End of class A
class Two extends One
{
    void showw(int a, int b)
    {
        System.out.println("Hello ! This is show() in B");
    }// End of show() Method

} // End of class B
// Driver Class
public class MO {
    public static void main(String args[]) {

        One a1 = new One(); //ref var one, obj type one
        a1.showw(4, 5);

        a1 = new Two(); //ref var one, obj type two
        a1.showw(1, 1); //Call to an overridden method is not decided by the type of reference variable.
        // Rather it is decided by the type of the object where reference variable is pointing.

//        When a super-class variable points to any of its sub-class instance,
//        then from the sub-class only overridden methods can be invoked by using the same variable.

    }
}