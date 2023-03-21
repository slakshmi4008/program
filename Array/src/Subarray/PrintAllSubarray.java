package Subarray;

public class PrintAllSubarray {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int sum=0;
        int n=nums.length;
        int count=n*(n+1)/2;
        System.out.println(count);

        for(int start=0;start<nums.length;start++){
            for(int end=start;end<nums.length;end++){
                for(int print=start;print<=end;print++){
                    System.out.print(nums[print] + " ");
                    sum=sum+nums[print];
                }
                System.out.println("sum is " +sum);
                //System.out.println();
                //sum=0;
            }
        }
    }

}
