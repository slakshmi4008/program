package Subseq;

import java.util.ArrayList;

public class SubSequenceNum {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        ArrayList<Integer> list = new ArrayList<>();
        subSeq(0,list,nums,3);
    }
    public static void subSeq(int index,ArrayList<Integer> list,int[] nums,int n){
        if(index==n){
            System.out.println(list);
            return;
        }
        list.add(nums[index]);
        subSeq(index+1,list,nums,n);
        list.remove(list.size()-1);
        subSeq(index+1,list,nums,n);
    }
}
