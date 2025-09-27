import java.util.*;
public class ReverseNum
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number: ");
        int n= sc.nextInt();
        int i=0;
        System.out.println("Digits in number are: ");
        while (n!=0)
            { 
                int digit=n%10;
                System.out.print(digit);
                n=n/10;
                i++;
            }
    }
}
