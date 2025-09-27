
import java.util.Scanner;

public class PrimeTillNum 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        System.out.println("Prime numbers upto "+n+" are : ");
        for(int i=2;i<=n;i++)
        {
            if(isPrime(i))
            {
                System.out.println(i+" ");
            }
        }
    }
    public static boolean isPrime(int num)
    {
        
        if(num<=1)
            {
                return false;
            }
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
