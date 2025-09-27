import java.util.*;
public class PythagoreanTriplet 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre number 1: ");
        int n1= sc.nextInt();
        System.out.print("Entre number 2: ");
        int n2= sc.nextInt();
        System.out.print("Entre number 3: ");
        int n3= sc.nextInt();
        int m1 = Math.max(n1,n2);
        int max = Math.max(m1,n3);
        if(max==n1)
        {
            boolean pyth1 = ((n2*n2+n3*n3)==(n1*n1));
            System.out.println(pyth1);
        }
        else if(max==n2)
        {
            boolean pyth2 = ((n1*n1+n3*n3)==(n2*n2));
            System.out.println(pyth2);
        }
        else
        {
            boolean pyth3 =  ((n2*n2+n1*n1)==(n3*n3));
            System.out.println(pyth3);
        }
    }
}


