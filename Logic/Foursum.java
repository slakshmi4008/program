package twoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Foursum {
    public static void main(String[] args) {
       int[] nums = {1,0,-1,0,-2,2};
       Arrays.sort(nums);
       int target =0;
       List<List<Integer>> ans1 =fourSum(nums,target);
       System.out.println(ans1);
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        for(int i=0;i<nums.length-4;i++){
            for(int j=i+1;j<nums.length-3;j++){
                int k=j+1;
                int l=nums.length-1;
                while(k<=l) {
                    if (nums[i] + nums[j] + nums[k] + nums[l] == target) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[j], nums[k]));
                    }else if (nums[i] + nums[j] + nums[k] + nums[l] < target){
                        k++;
                    }else l--;
                }
            }
        }
        return ans;
    }
}
