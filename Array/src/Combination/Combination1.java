package Combination;

import java.util.ArrayList;
import java.util.List;

public class Combination1 {
    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] arr ={2,3,6,7};
        int target=7;
       ans = combinationSum(arr,target);
        System.out.println(ans);
    }
    public static List<List<Integer>> combinationSum(int[] arr,int target){
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(0,arr,target,ans,new ArrayList<>());
        return ans;
    }
    public static void findCombination(int index, int[] arr, int target, List<List<Integer>> ans, ArrayList<Integer> list){
         if(index==arr.length){
             if(target==0){
                 ans.add(new ArrayList<>(list));
             }
             return;
         }
         if(arr[index]<=target){
             list.add(arr[index]);
             findCombination(index,arr,target-arr[index],ans,list);
             list.remove(list.size()-1);
         }
        findCombination(index+1,arr,target,ans,list);
    }
}
