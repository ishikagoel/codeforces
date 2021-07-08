import java.util.Scanner;

public class B730 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while (t-- > 0) {
            int n = obj.nextInt();
            long sum = 0;
            for (int i = 0; i < n; i++) {
                int ele = obj.nextInt();
                sum += ele;
            }
            long ans = sum % n;
            System.out.println(ans * (n - ans));
        }

    }

    public int kthSmallest(int[][] matrix, int k) {
        int low = 0;
        int high = matrix[0].length - 1;
        for (int i = 0; i < matrix.length; i++) {
            low = 0;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (mid > k) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            high = low - 1;
            return matrix[i][low];

        }
        return 0;
    }
}
