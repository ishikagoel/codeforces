import java.util.*;
import java.io.*;
public class CGlobal14
{
    public static class  pair implements Comparable<pair>
    {
        int x,y;
        public pair(int x,int y)
        {
            this.x=x;
            this.y=y;
        }
        public int compareTo(pair o)
        {
            return this.x-o.x;
        }
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0)
        {
            int n=obj.nextInt();
            int m=obj.nextInt();
            int x=obj.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=obj.nextInt();
            }
            PriorityQueue<pair> q=new PriorityQueue<>();
            for(int i=1;i<=m;i++)
            {
                q.add(new pair(0,i));
            }
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<n;i++)
            {
                pair p=q.poll();
                sb.append(p.y+" ");
                q.add(new pair(p.x+arr[i],p.y));
            }
            int i=0;
            int min=0,max=0;;
            for(pair p:q)
            {
                if(i==0)
                min=p.x;
                else if(i==q.size()-1)
                max=p.x;
                i++;
            }
            if(max-min<=x)
            {
                System.out.println("Yes");
                System.out.println(sb);
            }
            else
            System.out.println("No");
            
        }
    }
}