import java.util.Scanner;

public class Nested{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int empID = input.nextInt();
        String department = input.next();

        switch(empID) {
            case 1:
                System.out.println("Nayonika");
                break;
            case 2:
                System.out.println("Samarth");
                break;
            case 3:
                System.out.println("Samayo");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "CSE":
                        System.out.println("CSE Department");
                        break;
                    default:
                        System.out.println("Enter valid department!");
                }
                break;
            default:
                System.out.println("Enter valid employee ID!");
            }

        }
    }

