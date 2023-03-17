public class Main {
    public static void main(String[] args) {
        //.equals() method - compares only the value
        //== comparator - compares both value and location
        String a = "Nayonika";
        String b = "Nayonika";
        System.out.println(a == b);
        System.out.println(a.equals(b));

        //new keyword is used to create different objects with same value
        String name1 = new String("Nayo");
        String name2 = new String("Nayo");
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));

        //charAt(index)
        System.out.println(name1.charAt(2));

    }
}