import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 4, 4, 5};
        System.out.println(find(arr, 4, 0));
        System.out.println(findIndex(arr, 4, 0));
        System.out.println(FindIndexLast(arr, 4, arr.length - 1));

        FindAllIndex(arr, 4, 0);
        System.out.println(list);

        //ArrayList<Integer> list = new ArrayList<Integer>();  //or initialise it before using in the argument like this
        ArrayList<Integer> ans = FindAllIndex(arr, 4, 0, new ArrayList<>());
        System.out.println(ans);

        System.out.println(FindAllIndex2(arr, 4, 0));
    }
    //return true if element found
    static boolean find(int[] arr, int target, int index){

        //base condition
        if(index == arr.length){
            return false;
        }

        return arr[index] == target || find(arr, target, index + 1);
    }

    //return index if element found
    static int findIndex(int[] arr, int target, int index){

        //base condition
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }
    }

    static int FindIndexLast(int[] arr, int target, int index){
        //base condition
        if(index == -1){
            return -1;
        }
        if(arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index - 1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void FindAllIndex(int[] arr, int target, int index){

        if(index == arr.length){
            return;
        }

        if(arr[index] == target){
            list.add(index);
        }

        FindAllIndex(arr, target, index + 1);
    }

    static ArrayList<Integer> FindAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){

        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }
        return FindAllIndex(arr, target, index + 1, list);
    }

    static ArrayList<Integer> FindAllIndex2(int[] arr, int target, int index){
        //new array list for each call
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }

        //this will contain answer from that function call only
        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = FindAllIndex2(arr, target, index + 1);

        list.addAll(ansFromBelowCalls); //add all the items from answers that you have got from below calls

        return list;
    }
}