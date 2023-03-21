package Permutation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutation2 {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        List<List<Integer>> ans = new ArrayList<>();
        ans =permuteUnique(nums);
        System.out.println(ans);
    }
        public static List<List<Integer>> permuteUnique(int[] nums) {
            Set<List<Integer>> ls = new HashSet<>();
            permute(0,nums,ls);
            return new ArrayList(ls);
        }
        public static void permute(int ind, int[] nums, Set<List<Integer>> ls){
            if(ind==nums.length){
                List<Integer> l = new ArrayList<>();
                for(int i=0;i<nums.length;i++){
                    l.add(nums[i]);
                }
                ls.add(new ArrayList(l));
                return;
            }
            for(int i=ind;i<nums.length;i++){

                swap(i,ind,nums);
                permute(ind+1,nums,ls);
                swap(i,ind,nums);

            }
        }
        public static void swap(int i,int j,int[] nums){
            int tem = nums[i];
            nums[i]= nums[j];
            nums[j] = tem;
        }
    }

