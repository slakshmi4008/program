package math;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AddArrayFormInteger {
    public static void main(String[] args) {
       int[] num = {1,2,0,0};
       int k = 34;
       // List<Integer> list = addToArrayForm(num,k);
        //System.out.println(list);
        add(num,k);

    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        int res=0;
        for(int i=0;i<num.length;i++){
            res=res*10+num[i];
        }
        res=res+k;
        String string=""+res;
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<string.length();i++){
            list.add(string.charAt(i)-'0');
        }
       return list;
    }
    public static void add(int[] num,int k){
        final LinkedList<Integer> result = new LinkedList<>();
        int len = num.length - 1;

        while(len >= 0 || k != 0){

            if(len >= 0){
                k += num[len--];
            }

            result.addFirst(k % 10);
            k /= 10;
        }

        System.out.println(result);

    }
    }

