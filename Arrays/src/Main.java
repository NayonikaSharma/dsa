public class Main {
    public static void main(String[] args) {
        //syntax
        //datatype[] variable_name = new datatype[size]
        //all elements in an array should be of the same datatype

//        int[] rollno1 = new int[5]; //rollno1 is the ref var and new int[5] is the object
//        //OR
//        int[] rollno2 = {1,2,3,4,5};
        int[] ros; //declaration of array. ros is getting defined in the stack
        ros = new int[5]; //initialisation: actual creation of the object in the memory(heap)
        System.out.println(ros[1]); //by default all 0 for int

        String[] arr = new String[4];
        System.out.println(arr[0]); // by default null for String

//        for(String element : arr){
//            System.out.println(arr);
//        }
    }
}