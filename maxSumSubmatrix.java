import java.util.Arrays;

public class maxSumSubmatrix {
    public static void main(String[] args) {

    }

    public int maxSumSubmatrix(int[][] arr, int k) {
        int n = arr[0].length;
        int maxSum = Integer.MIN_VALUE;
        for (int l = 0; l < n; l++) 
        {
            int[] temp = new int[arr.length];
            Arrays.fill(temp,0);
            for (int r = l; r < n; r++) 
            {
                for (int i = 0; i < arr.length; i++) {
                    temp[i] += arr[i][r];
                }
                for(int i=0;i<temp.length;i++)
                {
                    System.out.print(temp[i]+" ");
                }
                System.out.println();
                int currSum = temp[0];
                int finalSum=temp[0];
                for (int j = 1; j < temp.length; j++) {
                    if (currSum >= 0) {
                        currSum += temp[j];
                    } else {
                        currSum = temp[j];
                    }
                    if (currSum >finalSum) {
                        finalSum = currSum;
                    }
                }
                System.out.println(l+" "+r+" "+finalSum+"kk");
                if (maxSum<=finalSum && currSum <= k) 
                {
                    
                    maxSum = finalSum;
                }
            }
        }
        return maxSum;

    }

}
