import java.util.*;
import java.io.*;

public class E479 {
    static int fs = 0;
    static boolean notperfectcycle = false;
    static boolean cycle_mila = false;

    static class pair {
        int x, p;

        public pair(int x, int y) {
            this.x = x;
            this.p = p;
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int m = obj.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for (int i = 0; i <= n; i++)
            arr.add(new ArrayList<>());
        for (int i = 0; i < m; i++) {
            int u = obj.nextInt();
            int v = obj.nextInt();
            arr.get(u).add(v);
            arr.get(v).add(u);
        }
        boolean[] branchcheck = new boolean[n + 1];
        Arrays.fill(branchcheck, false);
        for (int i = 1; i <= n; i++) {
            if (arr.get(i).size() == 2) {
                branchcheck[i] = true;
            }
        }
        int[] vis = new int[n + 1];
        Arrays.fill(vis, -1);
        long ans = 0;
        for (int j = 1; j <= n; j++) {
            if (vis[j] == -1 && branchcheck[j] == true) {
                dfs(arr, vis, j, 0, branchcheck);

                if (notperfectcycle == false && cycle_mila == true) {

                    ans++;
                }
            }
            notperfectcycle = false;
            cycle_mila = false;
        }
        System.out.println(ans);
    }

    public static void dfs(ArrayList<ArrayList<Integer>> arr, int[] vis, int node, int parent, boolean[] branchcheck) {
        if (branchcheck[node] == false) {
            notperfectcycle = true;
        }
        vis[node] = 1;
        for (Integer it : arr.get(node)) {
            if (vis[it] == -1) {
                dfs(arr, vis, it, node, branchcheck);
            } else if (it != parent) {
                cycle_mila = true;
            }
        }
    }
}
