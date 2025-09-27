import java.util.*;
public class InverseNum 
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int pos=1;
        int inver=0;
        int num=sc.nextInt();
        while(num!=0)
        {
            int orgdig=num%10;
            int inverdig=pos;
            int inverpos=orgdig;
            inver = inver+ inverdig*(int)Math.pow(10,inverpos-1);    
            num=num/10;
            pos++;
        }
        System.out.println(inver);
    }
}
