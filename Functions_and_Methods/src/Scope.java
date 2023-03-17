public class Scope {
    public static void main(String[] args) {
        //Function scope: if you define a variable in a function, you can only access those int that function.
        //also holds true for all the arguments
         int a = 10;
         int b = 20;
         String name = "Nayo";
         //block scope
        {
            a = 78; //reassign the og ref var to some other value
            //outside a block, in the same function, if a var has been initialised, it cannot be initialised again
            // but it can be modified and the value will remain modified even outside the block
            int c = 30;
            name = "nayonika";
            System.out.println(a);
            System.out.println(name);
            //values initialised in this block will remain in block.
        }
        int c = 100; //can be initialised again outside
        //System.out.println(c); //error cuz c was initialised inside the block even thoguh the block is in the same function
        System.out.println(a);
        System.out.println(name);

        //scoping in for loops:
        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }
        //System.out.println(i); //i cannot be accessed outside loop
    }
//    static void scope(int num1, int num2){
//        int temp = num1;
//        num1 = num2;
//        num2 = temp;
//        //for primitive datatypes, this change will be valid in this function's scope only (pass by value)
//        //for non-primitive datatypes like arrays, change will be valid (pass by value of ref varible)

    }


