package Practice;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
    int [] nums ={1,2,3,4,5,6,7};
    int k=3;
    rotate(nums,k);
    }
        public static void rotate(int[] nums, int k) {
            int count =0;
            int len = nums.length;
            while(count<k){
                int temp = nums[len-1];
                for(int i=len-1;i>0;i--){
                    nums[i]=nums[i-1];
                }
                nums[0]=temp;
                System.out.println(Arrays.toString(nums));
                count++;
            }
        }
    }


