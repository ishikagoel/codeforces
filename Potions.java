
import java.util.*;
import java.io.*;

public class Potions {
    public static class pair implements Comparable<pair> {
        int x;
        long sum;

        public pair(int x, long sum) {
            this.x = x;
            this.sum = sum;
        }

        @Override
        public int compareTo(Potions.pair o) {
            return o.x-x;
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            q.add(arr[i]);
            ans+=arr[i];
            if(ans<0)
            {
                int num=q.poll();
                ans-=num;
            }
            
        }
        
        System.out.println(q.size());

    }

}
