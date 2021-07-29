import java.util.*;
public class BER111 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0)
        {
            int n=obj.nextInt();
            int a=obj.nextInt();
            int b=obj.nextInt();
            String s=obj.next();
            char[] ch=s.toCharArray();
            int co=1,ans=0;
            for(int i=1;i<s.length();i++)
            {
                if(s.charAt(i)!=s.charAt(i-1))
                {
                    co++;
                }
            }
            co=co/2+1;
            ans=n*a+Math.max(n*b,co*b);
            System.out.println(ans);
            
            
            

        }

    }
}
