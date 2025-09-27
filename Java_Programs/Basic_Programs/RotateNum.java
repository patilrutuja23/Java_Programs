import java.util.*;
public class RotateNum 
{
    public static void main(String arg[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        System.out.print("How many digit do you want to rotate: ");
        int pos = sc.nextInt();
        int temp=n;
        int num=1;
        while(temp>0)
        {
            temp=temp/10;
            num++;
        }
        pos=pos%num;
        if(pos<0)
        {
            pos=pos+num;
        }
        int div=1;
        int mult=1;
        for(int i=1;i<=num;i++)
        {
            if(i<=pos)
            {
                div=div*10;
            }
            else
            {
                mult=mult*10;
            }
        }
        int a= n/div;
        int b= n%div;    
        b= b*mult+a;
        System.out.println(b);
    }
}
