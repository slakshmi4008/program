package Subarray;

public class ContinuousSubArray {
    public static void main(String[] args) {
        int[] nums ={23,2,6,4,7};
        int k=13;
        checkSubarraySum(nums,k);
    }

        public static boolean checkSubarraySum(int[] nums, int k) {

            int[] sum = new int[nums.length+1];
            sum[0]=0;

            for(int i=1;i<nums.length;i++){
                sum[i]=sum[i-1]+nums[i-1];
            }

            if(sum[nums.length]==0) {return true;}

            for(int start=0;start<nums.length;start++){
                for(int end=start+2;end<nums.length;end++){
                    if((sum[end]-sum[start])%k==0)
                        return true;

                }
            }
            return false;
        }
    }

