import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        //create an array
        int[] arr1 = {1,2,3,4,5};
        change(arr1); //when the object's ref (arr1) is passed to the parameter (arr2), the reference itself is passed by pass by value because the value that is being passed refers to the object
        System.out.println(Arrays.toString(arr1)); //printing an array
    }

        static void change(int[] arr2) { //arr2 will be another value of the ref variable pointing to the object.
            arr2[2] = 6; //if you make a change to the object via his ref variable, same object will be changed.
    }
}
