import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Calculator calculator=new Calculator();
        while(true) {
            System.out.println("Enter '+' for addition");
            System.out.println("Enter '-' for subtraction");
            System.out.println("Enter '*' for multiplication");
            System.out.println("Enter '/' for division");
            System.out.println("Enter '%' for remainder");
            System.out.println("Enter '^' for square");
            System.out.println("Enter '\' for exit");
            char ch = sc.next().charAt(0);
            switch (ch) {
                case '+':
                    System.out.println("enter two numbers");
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();
                    System.out.println(calculator.addition(num1, num2));
                    break;
                case '-':
                    System.out.println("enter two numbers");
                    int num3 = sc.nextInt();
                    int num4 = sc.nextInt();
                    System.out.println(calculator.subtraction(num3, num4));
                    break;
                case '*':
                    System.out.println("enter two numbers");
                    int num5 = sc.nextInt();
                    int num6 = sc.nextInt();
                    System.out.println(calculator.multiplication(num5, num6));
                    break;
                case '/':
                    System.out.println("enter two numbers");
                    int num7 = sc.nextInt();
                    int num8 = sc.nextInt();
                    System.out.println(calculator.division(num7, num8));
                    break;
                case '%':
                    System.out.println("enter two numbers");
                    int num9 = sc.nextInt();
                    int num10 = sc.nextInt();
                    System.out.println(calculator.remainder(num9, num10));
                    break;
                case '^':
                    System.out.println("enter number");
                    int num11 = sc.nextInt();
                    System.out.println(calculator.square(num11));
                    break;
                case '!':
                    System.out.println("Thank you");
                    return;
            }
        }
    }
}
