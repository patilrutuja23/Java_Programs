import java.util.*;
public class ReverserString 
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Original String: ");
        String str=sc.next();
        System.out.println("Reverse String: ");
        StringBuilder sb =new StringBuilder(str);
        System.out.println(sb.reverse());
    }
}
