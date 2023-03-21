package striver;

import java.util.Arrays;

public class FrogJump {
    public static void main(String[] args) {
        int[] nums = {10,20,30,10 };
        // int[] nums ={30,10,60,10,60,50};
         int n= nums.length;

        //using recursion
       // int ans = findMinJumpRec(n-1,nums);

        //using dp array for memoization---top down
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        //int ans = findMinJumpDp(n-1,dp,nums);

        //using tabulation--bottom up
        //int ans = findMinJumpTabulation(nums);

        //space optimization with variables instead of array
        int ans = findMinJumpSpace(nums);

        System.out.println(ans);
    }

    private static int findMinJumpSpace(int[] nums) {
        int previous =0;
        int previous2 =0;
        for(int index=1;index<nums.length-1;index++){
            int firstJump = previous + Math.abs(nums[index]- nums[index - 1]);
            int secondJump = Integer.MAX_VALUE;
            if(index>1){
                secondJump = previous2+Math.abs(nums[index]- nums[index - 2]);
            }
            int curri = Math.min(firstJump,secondJump);
            previous2=previous;
            previous=curri;
        }
        return previous;
    }

    private static int findMinJumpTabulation(int[] nums) {

        int[] dp = new int[nums.length + 1];
        dp[0] = 0;

        for (int index = 1; index < nums.length; index++) {
            int firstJump = dp[index - 1] + Math.abs(nums[index] - nums[index - 1]);
            int secondJump = Integer.MAX_VALUE;
            if (index > 1) {
                secondJump = dp[index - 2] + Math.abs(nums[index] - nums[index - 2]);
            }
            dp[index] = Math.min(firstJump,secondJump);
        }
        return dp[nums.length - 1];
    }

        private static int findMinJumpDp ( int index, int[] dp, int[] nums){
            if (index == 0) {
                return 0;
            }
            if (dp[index] != -1) return dp[index];
            int firstJump = findMinJumpRec(index - 1, nums) + Math.abs(nums[index] - nums[index - 1]);
            int secondJump = Integer.MAX_VALUE;
            if (index > 1) {
                secondJump = findMinJumpRec(index - 2, nums) + Math.abs(nums[index] - nums[index - 2]);
            }
            return dp[index] = Math.min(firstJump, secondJump);
        }

    private static int findMinJumpRec(int index,int[] nums){
        if(index==0){
            return 0;
        }
        int firstJump = findMinJumpRec(index-1,nums) + Math.abs(nums[index]-nums[index-1]);
        int secondJump= Integer.MAX_VALUE;
        if(index>1) {
            secondJump = findMinJumpRec(index - 2, nums) + Math.abs(nums[index] - nums[index - 2]);
        }
        return Math.min(firstJump,secondJump);
    }
}
