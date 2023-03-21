package StringLeetcode;

import java.util.Arrays;



    public class ShuffleArray {
        public static void main(String[] args) {
            int[] nums= {2,5,1,3,4,7};

            shuffle(nums,3);
        }
        public static void shuffle(int[] nums, int n) {
            int start=0;
            int outStart=0;
            int[] output = new int[nums.length];
            while(start<(nums.length-n)){
                System.out.println(nums[start]);
                output[outStart]=nums[start];
                output[outStart+1]=nums[n];
                outStart=outStart+2;
                start++;
                n++;

            }
            System.out.println(Arrays.toString(output));
        }
    }


