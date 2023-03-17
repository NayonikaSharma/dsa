public class Output {
    public static void main(String[] args) {
        System.out.println(56);
        //out is a reference variable of type PrintStream
        //PrintStream has a method called println in it
        Integer num = new Integer(56); //wrapper class
        System.out.println(num.toString()); //it is the same as sout(num) in case of integers and toString()
        System.out.println("nayonika");
        System.out.println(new int[] {1,2,3,4}); //way to directly print array (will give hash code and stuff)
        //to properly print it use Arrays.toString
        String name = null;
        System.out.println(name); //in case of null it prints null
    }
}
