import java.util.*;
public class PalindromeString 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Entere String: ");
        String s=sc.next();
        StringBuilder sb=new StringBuilder(s);
        boolean isSame = sb.reverse().toString().equals(s);
        if(isSame)
        {
            System.out.println("String is Palindrome... ");
        }
        else
        {
            System.out.println("String is Not Palindrome... ");
        }
    }
}
