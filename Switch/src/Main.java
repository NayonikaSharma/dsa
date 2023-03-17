import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        String fruit = input.next();
//
//        switch (fruit){
//            case "Mango":
//                System.out.println("King of fruits");
//                break;
//            case "Apple":
//                System.out.println("A crunchy red fruit");
//                break;
//            case "Orange":
//                System.out.println("A sour fruit");
//                break;
//            case "Grapes":
//                System.out.println("Small green fruit");
//                break;
//            default:
//                System.out.println("Please enter a valid fruit!");
//        }
//        int day = input.nextInt();
//        switch(day){
//            case 1 -> System.out.println("monday");
//            case 2 -> System.out.println("tuesay");
//            case 3 -> System.out.println("wednesday");
//            case 4 -> System.out.println("thursday");
//            case 5 -> System.out.println("friday");
//            case 6 -> System.out.println("saturday");
//            case 7 -> System.out.println("sunday");
//        }
        int day = input.nextInt();
        switch(day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("weekday");
                break;
            case 6:
            case 7:
                System.out.println("weekend");
                break;
        }


    }

}