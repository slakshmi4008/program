package striver;

public class MaximumSumNonAdjacent {
    public static void main(String[] args) {
        int[] array ={1,2,3,4};
        int ans =findMaxSum(array,array.length);
        System.out.println(ans);
    }
    static int findMaxSum(int[] arr, int N)
    {
        return maxNonAdjacentSum(arr, 0, N);
    }

    private static int maxNonAdjacentSum(int[] array, int index,int n) {
        if(index>=n){
            return 0;
        }

        int pick = array[index]+ maxNonAdjacentSum(array,index+2,n);
        int notPick = maxNonAdjacentSum(array,index+1,n);
        return Math.max(pick,notPick);
    }
}
