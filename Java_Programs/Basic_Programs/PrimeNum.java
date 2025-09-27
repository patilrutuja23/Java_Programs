import java.util.*; 
public class PrimeNum 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        if (isPrime(n)) 
        {
            System.out.printf("%d is prime", n);
        } 
        else 
        {
            System.out.printf("%d is not prime", n);
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