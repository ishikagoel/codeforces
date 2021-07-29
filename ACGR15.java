import java.util.*;
import java.io.*;
public class ACGR15
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0)
        {
            int n=obj.nextInt();
            String s=obj.next();
            String ss=s;
            char[] ch=ss.toCharArray();
            Arrays.sort(ch);
            int c=0;
            for(int i=0;i<n;i++)
            {
                if(ch[i]!=s.charAt(i))
                c++;

            }
            System.out.println(c);
            //int[] arr=new int[n];
        }
        
    }
}