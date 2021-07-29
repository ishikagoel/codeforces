import java.util.*;
public class AER111
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int t =obj.nextInt();
        while(t-->0)
        {
            int n=obj.nextInt();
            int count=1;
            int c=1;
            for(int i=2;i<=5000;i+=2)
            {
                if(count<n)
                {
                    count+=i;
                    c++;
                }
                else
                break;

            }
            int count2=1;
            int c2=1;
            for(int i=3;i<=5000;i+=2)
            {
                if(count2<n)
                {
                    count2+=i;
                    c2++;
                }
                else
                break;

            }
            if(n==1)
            {
            c=1;
            c2=1;
            }
            System.out.println(Math.min(c,c2));
        }
    }
}