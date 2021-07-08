import java.util.*;
import java.io.*;
public class A729 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0)
        {
            int n=obj.nextInt();
            int e=0,o=0;
            for(int i=0;i<2*n;i++)
            {
                int ele=obj.nextInt();
                if(ele%2==0)
                {
                    e++;
                }
                else
                o++;
            }
            if(e==o)
            {
                System.out.println("Yes");
            }
            else
            System.out.println("No");
        }
    }
}
