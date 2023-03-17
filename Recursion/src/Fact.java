public class Fact {
    public static void main(String[] args) {
        System.out.println(Fact(2));
    }

    static int Fact(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        int factorial = Fact(n - 1) * n;
        return factorial;

    }
}
