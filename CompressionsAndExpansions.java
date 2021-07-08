import java.util.*;
import java.io.*;

public class CompressionsAndExpansions {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while (t-- > 0) {
            int n = obj.nextInt();
            int[] arr = new int[n];
            ArrayList<Integer> ans=new ArrayList<>();
            for (int i = 0; i < n; i++) {
                 arr[i]= obj.nextInt();
            }
            ans.add(arr[0]);
            System.out.println(ans.get(0));

            int id=0;
            for (int i = 1; i < n; i++) {
                int last=ans.get(ans.size()-1);
                if (arr[i]==1) {
                    ans.add(arr[i]);
                } 
                else 
                {
                    for(int j=ans.size()-1;j>=0;j--)
                    {
                        if(arr[i]-ans.get(j)==1)
                        {
                            ans.remove(j);
                            ans.add(arr[i]);
                            break;
                        }
                        else
                        ans.remove(j);
                    }
                }
                for(int j=0;j<ans.size();j++)
                {
                    if(j==ans.size()-1)
                    System.out.print(ans.get(j));
                    else
                    System.out.print(ans.get(j)+".");
                }
                System.out.println();
            }

        }
    }
}
