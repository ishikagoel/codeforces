import java.util.*;
import java.io.*;

public class UnstableString {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while (t-- > 0) {
            String s = obj.next();
            char[] ch = s.toCharArray();
            int n = ch.length;
            int count = 0;
            //int ans = 1;
            for (int i = 0; i < n; i++) {
                System.out.print(ch[i] + " ");
            }
            // if(ch[0]=='?')
            // count++;
            System.out.println();
            char lastCharacter = '*';
            int id = 1;
            int[] ans=new int[n];
            ans[0]=1;
            for (int i = 1; i < s.length(); i++) {
                if (ch[i] == '?') {
                    count++;
                }
                if (ch[i] == '?') {
                    id++;
                    ans[i]= ans[i-1]+id;
                } else {
                    if (count % 2 != 0) {
                        if (lastCharacter == ch[i]) {
                            id++;
                            ans[i]= ans[i-1]+id;
                        } else {
                            ans[i]= ans[i-1]+1;
                            id = 1;
                        }
                    } else {
                        if (lastCharacter != ch[i]) {
                            id++;
                            ans[i]= ans[i-1]+id;
                        } else {
                            ans[i]= ans[i-1]+1;
                            id = 1;
                        }
                    }
                }
                if (ch[i] != '?') {
                    lastCharacter = ch[i];
                    count = 0;
                }
            }
           for(int i=0;i<ans.length;i++)
           {
               System.out.print(ans[i]+" ");
           }
           System.out.println();

        }

    }
}
