import java.util.Scanner;
public class RaisedPow 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n= sc.nextInt();
        System.out.println("Enter Number to be power: ");
        int x= sc.nextInt();
        int num=(int)Math.pow(n, x);
        System.out.println("After power number is: "+num);
    }
}
