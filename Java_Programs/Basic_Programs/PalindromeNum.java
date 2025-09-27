import java.util.*;
public class PalindromeNum 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number: ");
        int n= sc.nextInt();
        int n1=n;
        int rev=0;
        while(n!=0)
        {
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        boolean isSame= n1==rev;
        if(isSame)
        {
            System.out.print("Number is Palindrome...");
        }
       else
       {
            System.out.print("Number is Not Palindrome...");
       }
    }
}
