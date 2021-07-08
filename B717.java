import java.util.*;
import java.io.*;
public class B717
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0)
        {
            int n=obj.nextInt();
            long[] arr=new long[n];
            arr[0]=obj.nextLong();
            long xor=arr[0];
            for(int i=1;i<n;i++)
            {
                arr[i]=obj.nextLong();
                xor=xor^arr[i];
            }
            int f=0;
            if(xor==0)
            {
                System.out.println("Yes");
            }
            else{
                long y=0;
                boolean ans=false;
                for(int i=0;i<n;i++)
                {
                    y=y^arr[i];
                    if(y==xor)
                    {
                        y=0;
                        for(int j=i+1;j<n;j++)
                        {
                            y=y^arr[j];
                            if(y==xor)
                            {
                                y=0;
                                for(int k=j+1;k<n;k++)
                                {
                                    y=y^arr[k];
                                }
                                if(y==xor)
                                {
                                    ans=true;
                                    //continue con;
                                }
                            }
                            if(ans)
                            break;
                        }
                    }
                    if(ans)
                    break;
                }
                System.out.println(ans?"Yes":"No");

            }


        }
    }
}