package LeetcodeAssignment;

public class ArithmeticSlice {
    public static void main(String[] args) {
        int[] nums={1,2,3,8,9,10};
        System.out.println(numberOfArithmeticSlices(nums));
    }

        public static int numberOfArithmeticSlices(int[] nums) {
            if(nums.length<3){
                return 0;
            }

            int count=0;

            int diff=Math.abs(nums[0]-nums[1]);

            for(int k=0;k<=nums.length-3;k++){
                int i=k;
                int j=i+1;
                int size=0;
                while(j<nums.length){
                    int currDiff=Math.abs(nums[i]-nums[j]);
                    if(diff==currDiff){
                        i++;
                        j++;
                        size++;
                        if(size>=2){
                            count++;
                        }
                    }else{
                        k=j;
                        size=0;
                        break;
                    }
                }
            }
            return count;
        }


}
