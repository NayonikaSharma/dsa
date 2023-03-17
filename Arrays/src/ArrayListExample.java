import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(23);
//        list.add(4);
//        list.add(2022);
//        list.add(45);
//        list.add(69);
//        System.out.println(list);
//
//        System.out.println(list.contains(5));
//        System.out.println(list.contains(69));
//
//        list.set(3,420);
//        System.out.println(list);
//
//        list.remove(2);
//        System.out.println(list);
//
//        System.out.println(list.get(3)); //get item at any index

        //initialisation
        for(int i = 0; i < 5; i++){
            list.add(in.nextInt());
        }
        for(int i = 0; i < 5; i++){
            System.out.println(list.get(i)); //pass index , list[index] syntax will not work here
        }

    }
}
