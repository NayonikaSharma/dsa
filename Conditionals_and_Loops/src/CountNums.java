public class CountNums {
    public static void main(String[] args) {
        //Q. Count the number of 3s
        int num = 64520;
        int count = 0;
        int rem;

        while(num > 0){
            rem = num % 10;
            if(rem == 3){
                count ++;
            }
            num = num / 10;
        }
        System.out.println("The number of 3s are " +count);

    }
}
