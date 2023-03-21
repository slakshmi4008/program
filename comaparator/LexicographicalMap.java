package comaparator;

import java.util.*;

public class LexicographicalMap {
    public static void main(String[] args) {
        String[] words = {"i","love","leetcode","i","love","coding"};
        int k = 2;
        sortDec(words,k);
    }
    public static void sortDec(String[] words,int k){
        Map<String,Integer> map = new HashMap<>();
        List<String> ans = new ArrayList<>();

        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }

        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        System.out.println(list);


        Collections.sort(list,(a, b)->{
            int ret = b.getValue().compareTo(a.getValue());
            if(ret==0)
            return a.getKey().compareTo(b.getKey());
            return ret;
        });
        System.out.println(list);
    }
}
