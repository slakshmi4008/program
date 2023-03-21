package Practice;

import java.util.ArrayList;
import java.util.List;

public class ClosestPrime {
    public static void main(String[] args) {
        closestPrimes(19,31);
    }
    public static int[] closestPrimes(int left, int right) {
        List<Integer> list = new ArrayList<>();

        for(int i =left; i<=right;i++){
            if(isPrime(i)){
                list.add(i);
            }
        }
        System.out.println(list);
        int min =Integer.MAX_VALUE;
        int[] nums =new int[2];

        if(list.size()<=1){
            nums[0]=-1;
            nums[1]=-1;

        }
        else{
            for(int i=0;i<list.size()-1;i++){
                if(min>(list.get(i+1)+list.get(i))){
                    min=(list.get(i+1)+list.get(i));
                    nums[0]=list.get(i);
                    nums[1]=list.get(i+1);
                }

            }
        }
        return nums;
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i =2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}

