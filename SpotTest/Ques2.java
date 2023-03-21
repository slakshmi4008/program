package SpotTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        //get input from the user
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the length of the array");
        int len=sc.nextInt();

        //int[] num = new int[len];

        //receiving input from the user
        System.out.println("Enter the Array elements");
        for(int i=0;i<len;i++){
           // num[i]=sc.nextInt();
        }
        System.out.println("Enter the total sum ");
       // int sum=sc.nextInt();

        int[] num ={1,2,3,1,5};

        FindSubArray(num);

    }
    private static void FindSubArray (int[] nums){

        int sum=0;
        int index=0;
        int newSum=0;
        List<Integer> list1 =new ArrayList<>();
        List<Integer> list2 =new ArrayList<>();

        for(int i=0;i<nums.length;i++) {
            sum += nums[i];
        }
         newSum=sum/2;
        int currSum=0;

        for(int i=0;i<nums.length;i++) {
            currSum += nums[i];
            if (currSum<=newSum) {
                list1.add(nums[i]);
            }else{
                list2.add(nums[i]);
            }
            }
        System.out.println(list1);
        System.out.println(list2);
        }

    }

