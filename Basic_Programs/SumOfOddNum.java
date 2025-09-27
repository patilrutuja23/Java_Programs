import java.util.*;
public class SumOfOddNum 
{
    public static void main(String[] args) 
    {
        int sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Eter number till you want to print number: ");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                sum=sum+i;
            }
        }
        System.out.println("Sum of odd number is: "+sum);
    }
}
