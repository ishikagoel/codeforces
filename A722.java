import java.util.Scanner;

public class A722 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while (t-- > 0) {
            // Scanner obj = new Scanner(System.in);
            int n = obj.nextInt();
            int[] a = new int[n];
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < a.length; i++) {
                a[i] = obj.nextInt();
                min = Math.min(a[i], min);
            }
            int count = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] > min)
                    count++;
            }

            System.out.println(count);
        }
    }
}