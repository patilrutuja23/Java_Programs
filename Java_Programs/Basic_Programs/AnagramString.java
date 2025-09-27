import java.util.*;
public class AnagramString 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String s1= sc.next();
        System.out.print("Enter String 2: ");
        String s2= sc.next();
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
            System.out.println(s1+" and "+s2+ " are anagram");
        }
        else
        {
            System.out.println(s1+" and "+s2 +" are  not anagram");
        }
    }
}
