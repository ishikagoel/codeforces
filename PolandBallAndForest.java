import java.util.Scanner;
import java.util.*;
import java.io.*;

public class PolandBallAndForest {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] p = new int[n];
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            arr.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            p[i] = obj.nextInt();
            arr.get(i + 1).add(p[i]);
            arr.get(p[i]).add(i + 1);
        }
        int[] vis = new int[n + 1];
        Arrays.fill(vis, -1);
        int ans = 0;
        // System.out.println(arr);
        for (int i = 1; i <= n; i++) {
            if (vis[i] == -1) {
                ans++;
                // System.out.println(i);
                dfs(arr, vis, i);
            }
        }
        System.out.println(ans);
    }

    public static void dfs(ArrayList<ArrayList<Integer>> arr, int[] vis, int s) {
        vis[s] = 1;
        for (Integer it : arr.get(s)) {
            if (vis[it] == -1) {
                dfs(arr, vis, it);
            }
        }
    }

}
