import java.util.Scanner;

public class Calculator {
    public char calculation(char s)
    {
        Scanner n=new Scanner(System.in);
        System.out.println("enter two numbers");
        int num1=n.nextInt();
        int num2=n.nextInt();
        switch (s)
        {
            case '+':
                System.out.println(addition(num1,num2));
                break;
            case '-':
                System.out.println(subtraction(num1,num2));
                break;
            case '*':
                System.out.println(multiplication(num1,num2));
                break;
            case '/':
                System.out.println(division(num1,num2));
                break;
            case '%':
                System.out.println(remainder(num1,num2));
                break;
            case '^':
                System.out.println(square(num1));
                break;
            case '!':
                System.out.println("Thank you");
            break;
        }
        return null;
    }
    public int addition(int num1,int num2)
    {
        return num1+num2;
    }
    public int subtraction(int num1,int num2)
    {
        return num1-num2;
    }
    public int multiplication(int num1,int num2)
    {
        return num1*num2;
    }
    public int division(int num1,int num2)
    {
        return num1/num2;
    }
    public int remainder(int num1,int num2)
    {
        return num1%num2;
    }
    public int square(int num1)
    {
        return num1*num1;
    }

}
