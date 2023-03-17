import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Take input from user till user does not press X or x.

        int ans = 0;

        while (true) {
            //take the operator as input
            System.out.println("Enter an operator: ");
            char op = input.next().trim().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                //input two numbers
                System.out.println("Enter the operands: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if(op == '+'){
                    ans = num1 + num2;
                }

                if(op == '-'){
                    ans = num1 - num2;
                }

                if(op == '*'){
                    ans = num1 * num2;
                }

                if(op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                    else{
                        System.out.println("Cannot divide by 0");
                    }
                }

                if(op == '%'){
                    ans = num1 % num2;
                }

            }
            else if(op == 'X' || op == 'x'){
                break;
            }
            else{
                System.out.println("Invalid Input!!");
            }
            System.out.println(ans);
        }
    }
}
