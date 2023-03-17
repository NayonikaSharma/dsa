public class Main {
    public static void main(String[] args) {
        Sample obj = new Sample();
        obj.divide();
        obj.display();
    }
    static class Sample{
        int a = 5;
        int b = 0;
        void divide(){
            try{
                int c = a / b;
            } catch(ArithmeticException e) {
                System.out.println("Division by zero");
            } catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Division by zero");
            } catch(Exception e){
                System.out.println(e);
            }

        }
        void display(){
            System.out.println("Excecuted.");
        }
    }
}