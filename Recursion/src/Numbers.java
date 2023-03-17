public class Numbers {
    public static void main(String[] args) {
        //print first 5 numbers  1 2 3 4 5
        System.out.println("1 to N: ");
        print1(1);
        System.out.println("");
        System.out.println("N to 1: ");
        print2(5);
    }
    static void print1(int n){

        //base case
        if(n == 5){
            System.out.print(n);
            return;
        }

        System.out.println(n);

        //recursive call
        //if you call a function again and again, you  can treat it as a separate call in the stack

        //this is called tail recursion
        //this is the last function call
        print1(n + 1);
    }
    static void print2(int n){

        //base case
        if(n == 0){
            return; //or if n == 1, print 1 first and then return
        }

        System.out.println(n);
        print2(n - 1);
    }
}