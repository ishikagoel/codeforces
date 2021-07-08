import java.util.Scanner;
public class A730 {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0)
        {
        long a = obj.nextLong();
        long b = obj.nextLong();
        long ans=Math.abs(a-b);
        if(ans==0)
        {
            System.out.println(0+" "+0);
            continue;
        }
        long moves=Math.min(a%ans,ans-a%ans);
        moves=Math.min(moves,Math.min(b%ans,ans-b%ans));
        System.out.println(ans+" "+moves);
    }
    
    
    }
}
