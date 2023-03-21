package leetcode;

public class PivotIndex {
    public static void main(String[] args) {
           int[] nums = {2,1,-1};
        int ans = pivotIndex(nums);
        System.out.println(ans);
    }
        public static int pivotIndex(int[] nums) {
            int[] front = new int[nums.length];
            int[] end = new int[nums.length];
            front[0]=nums[0];
            end[nums.length-1]=nums[nums.length-1];

            for(int i=1;i<nums.length;i++){
                front[i]=front[i-1]+nums[i];
            }
            for(int i=nums.length-2;i>0;i--){
                end[i]=end[i+1]+nums[i];
            }
            for(int i=0;i<nums.length;i++){
                if(front[i]==end[i])return i;
            }
            return -1;
        }
    }

