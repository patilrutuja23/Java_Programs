import java.util.*;
public class PosNeg 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0)
        {
            System.out.println(n+" is Positive");
        }
        else if(n<0)
        {
            System.out.println(n+" is Negetive");
        }
        else
        {
            System.out.println("Number is 0");
        }
    }
}
