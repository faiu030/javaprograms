import java.util.Scanner;

public class JaggedArrayBankExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String arr[][]=new String[5][];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=new String[sc.nextInt()];
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.println("Enter name of customer "+j+" of bank "+i);
                arr[i][j]=sc.next();
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
