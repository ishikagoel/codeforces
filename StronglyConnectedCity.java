import java.util.*;
import java.io.*;

public class StronglyConnectedCity {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int m = obj.nextInt();
        char[] s = obj.next().toCharArray();
        char[] s2 = obj.next().toCharArray();
        boolean ans = true;
        ;
        if ((s[0] == '<' && s2[0] == '^') || (s[0] == '>' && s2[s2.length - 1] == '^')
                || (s[s.length - 1] == '<' && s2[0] == 'v') || s[s.length - 1] == '>' && s2[s2.length - 1] == 'v') {
            ans = false;
        }
        System.out.println(ans ? "YES" : "NO");
    }
}