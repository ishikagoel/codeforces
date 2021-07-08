import java.util.*;
import java.io.*;
public class C729 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0)
        {
            long n=obj.nextLong();
            long mod=(long)(Math.pow(10,9)+7);
            long sum=0;
             sum+=((n*2)+mod)%mod;
            //System.out.println(sum);
            sum+=((n/2)+mod)%mod;
            //System.out.println(sum);
            sum+=((n/6)+mod)%mod;
            sum+=((n/12)+mod)%mod;
            //System.out.println(sum);
            System.out.println(sum%mod);
            HashMap<Integer,Integer> map=new HashMap<>();
            PriorityQueue<Integer> p=new PriorityQueue<>();
            p.
            


        }
    }
}
