package Subseq;

import java.util.ArrayList;

public class PrintK {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<Integer>();
        int[] nums = {1,2,1};
        int n= nums.length;
        int k=2;
        printK(0,list,0,nums,n,k);
    }

    private static void printK(int index, ArrayList<Integer> list,int sum, int[] nums, int n,int k) {
        if(index==n){
            if(sum==k){
                System.out.println(list);
            }
            return;
        }
        list.add(nums[index]);
        sum=sum+nums[index];
        printK(index+1,list,sum,nums,n,k);
        sum=sum-nums[index];
        list.remove(list.size()-1);
        printK(index+1,list,sum,nums,n,k);

    }

}
