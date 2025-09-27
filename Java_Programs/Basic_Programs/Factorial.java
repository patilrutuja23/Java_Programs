import java.util.*;
public class Factorial 
{
    public static void main(String arg[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        if(n==0)
        {
            System.out.println("Factorial of "+n+ "  is 1");
        }
        else
        {
            int fact=1;
            while(n>=1)
            {
                fact= fact * n;
                n--;
            }
            System.out.println("Factorial is: "+fact);
        }
    }
}
