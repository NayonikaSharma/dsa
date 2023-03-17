import java.util.ArrayList;
import java.util.Scanner;

public class MultiAL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //initialisation
        for(int i = 0; i < 3; i++){
            list.add(new ArrayList<>()); //3 lists added
        }

        //add elements
        for(int i = 0; i < 3; i ++){
            for(int j = 0; j < 3; j++) {
                list.get(i).add(input.nextInt());
            }

        }
        System.out.println(list);

    }
}
