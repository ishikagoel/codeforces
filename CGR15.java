import java.util.*;
import java.io.*;
public class CGR15 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0)
        {
            int n=obj.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=obj.nextInt();
            }
            int ans=0;
            int var=0;
            for(int i=0;i<n;i++)
            {
                var=0;
                for(int j=0;j<n;j++)
                {
                    for(int k=0;k<n;k++)
                    {
                        if(arr[j]-arr[k]==arr[i])
                        {
                            ans++;
                            var=1;
                            System.out.println(ans);
                            break;
                        }

                    }
                    if(var==1)
                    break;
                }
            }
            if(ans==n)
            {
                System.out.println("YES");
            }
            else
            System.out.println("NO");
        }
    }
    
}
