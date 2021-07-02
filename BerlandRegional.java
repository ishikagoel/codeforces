import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class BerlandRegional {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0)
        {
            int n=obj.nextInt();
            int[] u=new int[n+1];
            long[] s=new long[n+1];
            for(int i=1;i<=n;i++)
            {
                u[i]=obj.nextInt();
            }
            for(int i=1;i<=n;i++)
            {
                s[i]=obj.nextLong();
            }
            ArrayList<ArrayList<Long>> arr=new ArrayList<>();
            for(int i=0;i<=n;i++)
            {
                arr.add(new ArrayList<>());
            }
            for(int i=1;i<=n;i++)
            {
                arr.get(u[i]).add(s[i]);
            }
            long[] ans=new long[n+1];
            for(int i=0;i<=n;i++)
            {
                Collections.sort(arr.get(i),Collections.reverseOrder());
                int onetypeS=arr.get(i).size();
                long[] sum=new long[onetypeS];
                if(onetypeS>=1)
                sum[0]=arr.get(i).get(0);
                for(int j=1;j<sum.length;j++)
                {
                    sum[j]=sum[j-1]+arr.get(i).get(j);
                }
                for(int k=0;k<onetypeS;k++)
                {
                    if(onetypeS%(k+1)==0)
                    {
                        if(sum.length>=1)
                        ans[k+1]+=sum[sum.length-1];
                    }
                    else if(k+1<onetypeS)
                    {
                        int id=(k+1)*(onetypeS/(k+1));
                        ans[k+1]+=sum[id-1];
                    }
                }
            }
            for(int i=1;i<ans.length;i++)
            {
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }
    }
}
