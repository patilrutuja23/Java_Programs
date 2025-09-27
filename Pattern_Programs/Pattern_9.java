import java.util.*;
public class Pattern_9 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int s=0;
        int sd=n;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=s;j++)
            {
                System.out.print(" \t");
            }
            for(int j=1;j<=sd;j++)
            {
                System.out.print("* ");
            }
            s++;
            sd--;
            System.out.println();    
        }
    }
}



