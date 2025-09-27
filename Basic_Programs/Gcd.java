import java.util.*;
public class Gcd 
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
	    System.out.print("Enter Number 1 : ");
        int n1 = sc.nextInt();
	    System.out.print("Enter Number 2 : ");
        int n2 = sc.nextInt();
        int ogn1=n1;
        int ogn2=n2;
        while(n1%n2!=0)
        {
            int rem = n1%n2;
            n1=n2;
            n2=rem;
        }
        int gcd=n2;
	    System.out.print("GCD of numbers " +ogn1+ " and " +ogn2+ " is : "+gcd );
    }
}
