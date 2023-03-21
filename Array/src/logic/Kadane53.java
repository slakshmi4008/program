package logic;

public class Kadane53 {
    public static void main(String[] args) {
        int[] nums ={-3,-4,-2,-5,-4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int sum=0;
        int max=nums[0];

        for(int index=0;index<nums.length;index++){
            sum=sum+nums[index];
            if(sum>max)max=sum;
            if(sum<0)sum=0;
        }
        return max;

    }
}
