import java.util.*;
import java.io.*;

public class BCGR15 {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while (t-- > 0) {
            int n = obj.nextInt();
            int[][] arr = new int[n][5];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 5; j++) {
                    arr[i][j] = obj.nextInt();
                }
            }
            int c = 0;
            int ans = 0;
            if (n == 1) {
                System.out.println(1);
                continue;
            }
            for (int i = 1; i < n; i++) {
                c = 0;
                for (int j = 0; j < 5; j++) {
                    if (arr[i][j] < arr[ans][j]) {
                        c++;
                    }
                }
                if (c >= 3) {
                    ans = i;
                }

            }
            int cc = 0;
            for (int i = 0; i < n; i++) {
                if (i == ans)
                    continue;
                cc = 0;
                for (int j = 0; j < 5; j++) {
                    if (arr[i][j] < arr[ans][j]) {
                        cc++;
                    }
                }
                if (cc >= 3) {
                    ans = -2;
                    break;
                }
            }
            System.out.println(ans+1);
        }
    }
}
