public class EvenDigits {
    public static void main(String[] args) {
        //find the number of numbers with even no. of digits
        int[] arr = {12, 786, 4, 891, 7654, -23, 677};
        System.out.println("The given array has "+number(arr)+ " numbers with even number of digits.");
    }
    static int number(int[] arr){
        int count = 0;
        for(int num: arr) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        if (num < 0){
            num = num * -1;
        }
        int dig = 0; //to finf number of digits you can also use -> (int)(Math.log10(num)) + 1
        int rem;
        while(num > 0){
            rem = num % 10;
            dig++;
            num = num / 10;
        }
        if(dig % 2 == 0){
            return true; //or return dig % 2 == 0;
        }
        return false;
    }
}
