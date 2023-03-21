package bitCount;

import java.util.Arrays;

public class CountBit {
    public static void main(String[] args) {
       int n=2;
       int[] ans = new int[n+1];
       for(int i=0;i<ans.length;i++){
           ans[i]=Integer.bitCount(i);
       }
        System.out.println(Arrays.toString(ans));

        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        System.out.println(count);

        //System.out.println(Integer.toBinaryString(a));
        //System.out.println(Integer.bitCount(a));
    }

}
