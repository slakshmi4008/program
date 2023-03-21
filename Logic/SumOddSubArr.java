package leetcode;

public class SumOddSubArr {
    public static void main(String[] args) {
        int[] arr ={1,4,2,5,3};
        int ans=sumOddLengthSubarrays(arr);
        System.out.println(ans);

    }
    public static int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        for(int start=0;start<arr.length;start++){
            for(int end=start;end<arr.length;end++){
                for(int inner=start;inner<=end;inner++){
                    if((end-start)%2!=0){
                        sum=sum+arr[inner];
                    }
                }
                System.out.println("sum is " +sum);
            }
        }
        return sum;
    }
}
