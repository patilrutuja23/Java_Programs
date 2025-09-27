import java.util.*;
public class CountVowelConsonants 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String str =sc.next();
        int vowel=0;
        int consonants=0;
        for(char c:str.toCharArray())
        {
            if(c=='a'||c=='e'||c=='o'||c=='i'||c=='u')
            {
                vowel++;
            }
            else 
            {
                consonants++;
            }
        }
        System.out.println("Vowels are: "+vowel+" Consonants are : "+consonants);
    }
}
