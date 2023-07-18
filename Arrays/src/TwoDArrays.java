import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float [][]arr=new float[4][3];
        for (int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.println("Enter height of player "+j+" of game "+i);
                arr[i][j]=sc.nextFloat();
            }
        }
        for (int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
