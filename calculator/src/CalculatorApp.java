import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter '+' for addition");
        System.out.println("Enter '-' for subtraction");
        System.out.println("Enter '*' for multiplication");
        System.out.println("Enter '/' for division");
        System.out.println("Enter '%' for remainder");
        System.out.println("Enter '^' for square");
        System.out.println("Enter '\' for exit");
        char s=sc.nextChar();
        Calculator scan=new Calculator();
        System.out.println(scan.calculation(s));
    }
}
