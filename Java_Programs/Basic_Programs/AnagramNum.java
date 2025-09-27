import java.lang.reflect.Array;
import java.util.*;
public class AnagramNum
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int n1= sc.nextInt();
        System.out.print("Enter number 2: ");
        int n2= sc.nextInt();
        String s1= String.valueOf(n1);
        String s2= String.valueOf(n2);
        if(s1.length()!=s2.length())
        {
            System.out.println("Numbers are not equal\nEnter valid numbers");
        }
        char[] arr1= s1.toCharArray();
        char[] arr2= s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean isAnagram= Arrays.equals(arr1, arr2);
        if(isAnagram)
        {
            System.out.println(n1+" and "+n2+ " are anagram");
        }
        else
        {
            System.out.println(n1+" and "+n2 +" are  not anagram");
        }
    }
}
