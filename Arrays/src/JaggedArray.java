import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][]arr=new int[4][];
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter the number of Students in class "+i);
            int k=sc.nextInt();
            arr[i]=new int[k];
            for(int j=0;j<k;j++)
            {
                System.out.println("Enter the marks of student "+j+" of class "+i);
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}
