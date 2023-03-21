package leetcode;

import java.util.HashMap;
import java.util.Map;

public class KdiffPairs {
    public static void main(String[] args) {
        int[] nums = {1,3,1,5,4};
        int k=0;
        int ans = findPairs(nums,k);
        System.out.println(ans);
    }

        public static int findPairs(int[] nums, int k) {
            Map<Integer,Integer> map = new HashMap<>();

            int res=0;

            for(int i=0;i<nums.length;i++){
                if(!map.containsKey(nums[i])){
                    map.put(nums[i],1);
                    if(map.containsKey(nums[i]-k))
                    {res+=map.get(nums[i]-k);}
                    if(map.containsKey(nums[i]+k))
                    {res+=map.get(nums[i]+k);}
                }

            }
            return res;
        }
    }

