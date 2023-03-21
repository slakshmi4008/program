package Practice;

import java.util.Scanner;

public class REmduplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the length of the array");
        int len=sc.nextInt();

        int[] nums = new int[len];

        //receiving input from the user
        System.out.println("Enter the Array elements");
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        int i = 0;
        for (int n : nums)
            if (i < 2 || n > nums[i - 2])
                nums[i++] = n;
    }
}
