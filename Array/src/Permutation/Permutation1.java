package Permutation;

import java.util.ArrayList;
import java.util.List;

public class Permutation1 {
    public static void main(String[] args) {
         int[] nums = {1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        ans =permute(nums);
        System.out.println(ans);
    }
    public static List<List<Integer>> permute(int[] nums) {
          List<List<Integer>> ls = new ArrayList<>();
          permute(0,nums,ls);
          return ls;
    }
public static void permute(int ind, int[] nums, List<List<Integer>> ls) {
    if (ind == nums.length) {
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            l.add(nums[i]);
        }
        ls.add(new ArrayList(l));
        return;
    }
    for (int i = ind; i < nums.length; i++) {

        swap(i, ind, nums);
        permute(ind + 1, nums, ls);
        swap(i, ind, nums);

    }
}
    public static void swap(int i,int j, int[] nums){
        int tem = nums[i];
        nums[i] = nums[j];
        nums[j] = tem;
    }

}