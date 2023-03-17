public class Nto1 {
    public static void main(String[] args) {
        printRev(5);
        System.out.println();
        printBoth(5);
        System.out.println();
        func(5);
    }

    //concept
    static void func(int n){

        if(n == 0){
            return;
        }

        System.out.println(n);
//        func(n--);
//        n-- vs --n -> n-- passes the value of n first and then subtracts 1
//        --n first subtracts 1 and then passes n
        func(--n);
    }
    static void printRev(int n){
        if(n == 0){
            return;
        }
        printRev(n - 1);
        System.out.println(n);
    }

    static void printBoth(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printBoth(n - 1);
        System.out.println(n);
    }
}
