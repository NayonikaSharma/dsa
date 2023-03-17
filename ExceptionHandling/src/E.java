public class E {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{
            divide(a,b);
        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
    static int divide(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("please do not divide by zero");
            //explicitly when you want to throw an exception
        }
        else {
            return a / b;
        }
    }
}
