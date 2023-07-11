import java.util.Scanner;

public class JourneyCalculator
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double speed= sc.nextDouble();
        double time=sc.nextDouble();
        System.out.println(calculateDistance(speed,time));
    }
    public static double calculateDistance(double speed, double time)
    {
        return speed*time;
    }
}
