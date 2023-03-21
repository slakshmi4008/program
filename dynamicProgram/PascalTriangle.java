package dynamicProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int n=5;
        int[][] dp = new int[5][5];
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> list =new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i)
                {dp[i][j] =1;
                list.add(dp[i][j]);}
                else{
                    if (j != 0)
                        dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                    list.add(dp[i][j]);
                }
            }
            ans.add(list);
        }
        System.out.println(ans);
        //System.out.println(Arrays.deepToString(dp));

        for(int i=0;i<n;i++){
            List<Integer> list =new ArrayList<>();
            for(int j=0;j<=i;j++){
                    list.add(dp[i][j]);
            }
            ans.add(list);
        }


    }
}
