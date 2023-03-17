public class tryCatch {
    public static void main(String[] args) {
        System.out.println("Start");
        int d = 0;
        int x = 10;
        try{
            x = 42 / d;
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("no");
        }catch(ArithmeticException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println("Executed");
        }
        System.out.println("x = " +x);
        System.out.println("End");
    }
}
