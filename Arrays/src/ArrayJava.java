import java.util.Scanner;

public class ArrayJava
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of persons :");
        int size=sc.nextInt();
        boolean arr[]=new boolean[size];
        for(int i=0;i<size;i++)
        {
            System.out.println("Is " +(i+1)+" person is married : ");
            arr[i]=sc.nextBoolean();
        }
        for (int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
