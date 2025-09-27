import java.util.*;
public class FibonacciSeries 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int a=0;
        int b=1;
        int sum=0;
        System.out.println(a+" ");
        for(int i=1;i<=n;i++)
        {
            a=b;
            b=sum;
            sum=a+b;
            System.out.println(sum+" ");
        } 
    }
}
