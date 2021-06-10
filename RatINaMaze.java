import java.util.*;
import java.io.*;

public class RatINaMaze {
    static ArrayList<String> ans = new ArrayList<>();

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = obj.nextInt();
            }
        }
        int[][] vis = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(vis[i], -1);
        }
        if (arr[0][0] == 1)
            dfs(arr, 0, 0, vis, "", n);
        if (ans.size() == 0) {
            ans.add("-1");
        }
        System.out.println(ans);

    }

    public static void dfs(int[][] arr, int i, int j, int[][] vis, String path, int n) {
        int[] ic = { 0, 0, 1, -1 };
        int[] jc = { 1, -1, 0, 0 };
        char[] pc = { 'R', 'L', 'D', 'U' };
        if (i == n - 1 && j == n - 1) {
            ans.add(path);
            return;
        }
        vis[i][j] = 1;
        for (int x = 0; x < 4; x++) {
            int p = i + ic[x];
            int z = j + jc[x];
            // System.out.println("*****");
            if (check(p, z, arr, vis, n)) {
                dfs(arr, p, z, vis, path + pc[x], n);
            }
        }
        vis[i][j] = -1;
    }

    public static boolean check(int i, int j, int[][] arr, int[][] vis, int n) {
        if (i >= 0 && i < n && j >= 0 && j < n && arr[i][j] == 1 && vis[i][j] == -1) {
            // System.out.println("true");
            return true;
        } else
            return false;
    }
}
