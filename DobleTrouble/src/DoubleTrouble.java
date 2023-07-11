import java.util.Scanner;

public class DoubleTrouble {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num : ");
        int num1=sc.nextInt();
        System.out.println(doubleTheNumber(num1));
    }
    public static int doubleTheNumber(int num)
    {
        return 2*num;
    }
}
