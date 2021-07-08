import java.util.Comparator;
import java.util.*;
import java.io.*;
public class FindKClosestElements {
    public class pair implements Comparator<pair>
    {
        int diff;
        int index;
        public pair(int diff,int index)
        {
            this.diff=diff;
            this.index=index;
        }
        @Override
        public int compare(FindKClosestElements.pair o1, FindKClosestElements.pair o2) {
            // TODO Auto-generated method stub
            return o1.diff-o2.diff;
        }
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<pair> p=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++)
        {
            p.add(new pair(Math.abs(arr[i]-x),i));
        }
        System.out.println(p);
        ArrayList<Integer> a=new ArrayList<>();
        return a;
        
    }
}
