import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class B722 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while (t-- > 0) {
            int n = obj.nextInt();
            long[] a = new long[n];
            ArrayList<Long> arr = new ArrayList<>();
            for (int i = 0; i < a.length; i++) {
                a[i] = obj.nextLong();
                if (a[i] <= 0)
                    arr.add(a[i]);
            }
            Arrays.sort(a);
            Collections.sort(arr);
            long min = Long.MAX_VALUE;
            for (int i = 0; i < arr.size() - 1; i++) {
                min = Math.min(Math.abs(arr.get(i) - arr.get(i + 1)), min);
            }
            if (n == 1)
                System.out.println(1);
            else {
                int c = 0;
                for (int i = 0; i < a.length; i++) {
                    if (a[i] <= 0)
                        c++;
                }
                for (int i = 0; i < a.length; i++) {
                    if (a[i] > 0 && a[i] <= min) {
                        c++;
                        break;
                    }
                }
                System.out.println(c);
            }

        }
    }

}