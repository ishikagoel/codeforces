import java.util.Scanner;

public class BE52 {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        long n = obj.nextLong();
        long m = obj.nextLong();
        long min = 0;
        long max = 0;
        if (n >= 2 * m) {
            min = n - (m * 2);
        } else
            min = 0;
        long c = 0;
        long sum = 0;
        for (int i = 1; i <= 2 * m; i++) {
            max += i - 1;
            if (max >= m) {
                c = i;
                break;
            }
        }
        max = n - c;
        System.out.println(min + " " + max);

    }
}
