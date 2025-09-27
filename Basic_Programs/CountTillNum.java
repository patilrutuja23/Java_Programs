import java.util.*;
import javax.lang.model.util.ElementScanner14;
public class CountTillNum 
{
        public static void main(String[] args) 
    {
        int countNeg=0,countPos=0,countZero=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number till you you want to print: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            i=sc.nextInt();
            if(i<0)
            {
                countNeg++;
            }
            else if(i>0)
            {
                countPos++;
            }
            else 
            {
                countZero++;
            }
        }
        System.out.println("count of positive number is: "+countPos);
        System.out.println("count of negative number is: "+countNeg);
        System.out.println("count of zero number enter is: "+countZero);
    }
}
