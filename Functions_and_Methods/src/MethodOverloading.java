//when two or more funcs have the same name, same return type etc but different number or types of args/parameters
public class MethodOverloading {
    public static void main(String[] args) {
        overload(2);
        overload("nayo");
        int ans = sum(4,5);
        System.out.println(ans);

        int result = sum(2,3,4);
        System.out.println(result);
    }
    static void overload(int a){
        System.out.println("first one");
        System.out.println(a);
    }
    static void overload(String name){
        System.out.println("second one");
        System.out.println(name);
    }
    static int sum(int a, int b){
        return a + b;
    }
    static int sum(int a, int b, int c){
        return a + b + c;
    }
}
