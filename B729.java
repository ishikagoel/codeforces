import java.util.Scanner;

public class B729 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0)
        {
            long n=obj.nextLong();
            long a=obj.nextLong();
            long b=obj.nextLong();
            if(n%a==0||(n-1)%b==0)
            {
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
