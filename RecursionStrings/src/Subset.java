import java.util.*;

public class Subset {
    public static void main(String[] args) {
        System.out.println("ans 1:");
        int[] arr = {1, 2};
        List<List<Integer>> ans = subset(arr);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
        System.out.println();
        System.out.println("ans 2:");
        int[] arr2 = {1, 2, 2};
        List<List<Integer>> ans2 = subsetDuplicate(arr2);
        for(List<Integer> list: ans2){
            System.out.println(list);
        }
        System.out.println("nayonika is gay");
    }

        static List<List<Integer>> subset(int[] arr){
            List<List<Integer>> outer = new ArrayList<>();

            outer.add(new ArrayList<>()); //initially in this outer list, we will just have an empty list
            //for every no. in the array that has been given, take the size of the list and create a new list and add it in the og list
            //eg: existing ans till now has a size of 2, so create 2 more lists
            //eg: existing ans till now has a size of 4, so create 4 more lists
            //so, the size of new list is the size of the outer list right now
            for (int num : arr) {
                int n = outer.size();
                for (int i = 0; i < n; i++) {
                    List<Integer> internal = new ArrayList<>(outer.get(i));
                    internal.add(num);
                    outer.add(internal);
                }
            }
            return outer;
        }
        static List<List<Integer>> subsetDuplicate ( int[] arr){
            Arrays.sort(arr);
            List<List<Integer>> outer = new ArrayList<>();
            outer.add(new ArrayList<>());
            int start = 0;
            int end = 0;
            for (int i = 0; i < arr.length; i++) {
                start = 0;
                // if current and previous element is same, s = e + 1
                if (i > 0 && arr[i] == arr[i - 1]) {
                    start = end + 1;
                }
                end = outer.size() - 1;
                int n = outer.size();
                for (int j = start; j < n; j++) {
                    List<Integer> internal = new ArrayList<>(outer.get(j));
                    internal.add(arr[i]);
                    outer.add(internal);
                }
            }
            return outer;
        }

}

