import java.util.*;
public class NumOfDigit
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        int i=0;
        while (n!=0)
        { 
            n=n/10;
            i++;
        }
        System.out.println("Total no. of Digits in number are: "+i);
    }
}
