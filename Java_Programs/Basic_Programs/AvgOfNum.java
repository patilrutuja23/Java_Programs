import java.util.*;
public class AvgOfNum 
{
    public static void main(String[] args) 
    {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            i=sc.nextInt();
            sum=sum+i;
        }
        double avg=sum%n;
        System.out.println("Average of number is: "+avg);
    }
}
