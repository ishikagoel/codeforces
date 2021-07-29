import java.util.*;

public class A734 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while (t-- > 0) {
            int n = obj.nextInt();
            int x, y, x1, y1;
            x = n / 3;
            y = n / 3;
            if(n%3==1)
            {
                x++;
            }
            else if(n%3==2)
            {
                y++;
            }
            System.out.println(x+" "+y);
        }
    }
}
