package binarySearch;

public class FirstPositive {
    public static void main(String[] args) {
        int[] nums = {-2,-2,-2,-2,-2,-2,-1,-1,2,3};

        int FirstIndex=FindIndex(nums,1);
        int zero=FindIndex(nums,0);
        System.out.println("zero " +zero);
        //System.out.println("pos "+FirstIndex);
        int pos = nums.length-FirstIndex;
        System.out.println("pos " + pos);
        int neg=0;
        for(int i=FirstIndex-1;i>=0;i--){
            if(nums[i]==0){
                neg=i;
            }else{
                break;
            }
        }
        int ans= Math.max(pos,neg-1);
        //System.out.println(ans);
    }

    private static int FindIndex(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int mid;

        while(start<=end){
            mid =start+(end-start)/2;

            if (nums[mid]<target){
                start= mid+1;
            }else
                end= mid-1;
        }
        return start;
    }
    }

