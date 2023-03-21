package Practice;

public class MedianOftwo {
    public static void main(String[] args) {
        int[] nums1={0,0,0,0,0};
        int[] nums2={-1,0,0,0,0,0,1};
        double res= findMedianSortedArrays(nums1,nums2);
        System.out.println(res);
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] arr = new int[m+n];

        int i=0;
        int j =0;
        int k=0;

        while(i<m&&j<n)
        {
            if(nums1[i]<nums2[j]){
                arr[k++]=nums1[i++];
            }else if(nums1[i]>nums2[j]){
                arr[k++]=nums2[j++];
            }else{
                i++;
            }

        }
        while(i<m){
            arr[k++]=nums1[i++];
        }

        while(j<n){
            arr[k++]=nums2[j++];
        }

        if(arr.length%2==0){
            System.out.println(arr[arr.length/2]);
            System.out.println(arr[arr.length/2-1]);
            //(arr[arr.length/2] +arr[arr.length/2-1])/2);
            int n1= arr.length;
            //double res = (double) ((arr[arr.length/2] + arr[arr.length/2-1])/2);
            double res = (double)(arr[n1/2] +arr[(n1/2)-1])/2;
            System.out.println(res);
            return res;
        }else{
            return arr[arr.length/2];
        }

    }
}
