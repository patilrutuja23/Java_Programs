import java.util.*;
public class ArmStrongNum 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();
        int n1=n;
        int sum=0;
        while(n!=0)
        {
            int rem=n%10;
            rem=(int)Math.pow(rem, 3);
            sum=sum+rem;
            n/=10;
        }
        boolean isArmStrong= sum==n1;
        if(isArmStrong)
        {
            System.out.println("Number is Armstrong"); 
        }
        else
        {
            System.out.println("Number is not Armstrong");
        }
    }
}
