package Subset;

public class divideTwoArray {
    public static void main(String[] args) {

            int arr[] = {1,2,4,0};
        System.out.println(twoPartsExists(arr, 7));

    }
    public static boolean subsetSumExist(int[]  arr, int n, int sum)
    {
        if(sum == 0)
            return true;
        if(n == 0)
            return false;
        return subsetSumExist(arr, n-1, sum-arr[0]) || subsetSumExist(arr, n-1, sum);
    }
    public static boolean twoPartsExists(int[] arr, int n)
    {
        int totalSum = 0;
        for(int i=0; i<n; i++)
            totalSum += arr[i];
        // if sum is odd then does not exist.
        if( (totalSum & 1) != 0)
            return false;
        return subsetSumExist(arr, n, totalSum/2);
    }
}
