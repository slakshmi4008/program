package striver;

import java.util.Arrays;

public class FrogWithKJump {
    public static void main(String[] args) {
        //findKFrogJump();
        int[] nums ={10,20,30,10};
        int[] dp = new int[nums.length+1];
        Arrays.fill(dp,-1);
        int k=1;

        int ans =findKFrogJumpDp(nums.length-1,dp,k,nums);
        //findKFrogJumpTabulation(nums,k);
        System.out.println(ans);
    }

    private static int findKFrogJumpTabulation(int[] nums,int k) {
        int[] dp = new int[nums.length + 1];
        dp[0] = 0;

        for (int index = 1; index < nums.length; index++) {
            int minSteps = Integer.MAX_VALUE;
            for (int j = 1; j <= k; j++) {
                if (index - j >= 0) {
                    int jump = dp[index - j] + Math.abs(nums[index] - nums[index - j]);
                    minSteps = Math.min(minSteps,jump);
                }
                dp[index]=minSteps;
            }

        }
        return dp[nums.length-1];
    }

    //memoization
    private static int findKFrogJumpDp(int index,int[] dp,int k,int[] nums) {
        if(index==0){
            return 0;
        }
        if(dp[index]!=-1) return dp[index];
        int minSteps= Integer.MAX_VALUE;

        for(int j=1;j<=k;j++){
            if(index-j>=0) {
                int jump = findKFrogJumpDp(index-j,dp,k,nums)+ Math.abs(nums[index]-nums[index-j]);
                minSteps=Math.min(minSteps,jump);
            }
        }
        return dp[index]=minSteps;
    }

    private static int findKFrogJump(int index,int k,int[] nums){
        if(index==0){
            return 0;
        }
        int minSteps = Integer.MAX_VALUE;
        for(int j=1;j<=k;j++){
            if(index-j<=0){
            int jump= findKFrogJump(index-j,k,nums)+Math.abs(nums[index]-nums[index-j]);
            minSteps= Math.min(minSteps,jump);
            }
        }
        return minSteps;
    }
}
