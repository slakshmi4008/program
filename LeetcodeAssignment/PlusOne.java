package LeetcodeAssignment;

public class PlusOne {
    class Solution {
        public int[] plusOne(int[] digits) {
            int[] res = new int[digits.length];
            int lastIndex = digits.length-1;
            if(digits[lastIndex]==9){
                res=checkPreviousElement(digits,lastIndex);
                digits[lastIndex-1]=digits[lastIndex-1]+1;
                return res;
            }
            res[lastIndex]=res[lastIndex]+1;
            return res;

        }
        private int[] checkPreviousElement(int[] digits,int lastIndex){
            if(lastIndex==0){
                int[] res=new int[digits.length+1];
                res[0]=1;
                for(int index=1;index<res.length;index++){
                    res[index]=0;
                }
                return res;
            }
            if(digits[lastIndex-1]==9){
                checkPreviousElement(digits,lastIndex-1);
                digits[lastIndex]=0;
            }else{
                digits[lastIndex]=digits[lastIndex]+1;
                return digits;
            }
            return digits;
        }
    }
}
