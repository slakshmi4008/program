package Assessment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ques5 {
    public static void main(String[] args) {
        frequency("Help for yourself","help");
    }
    private static void frequency(String string1,String string2){
        string1=string1.toLowerCase();
        string2=string2.toLowerCase();
        Map<Character,Integer> frequency = new HashMap<>();

        for(int index=0;index<string1.length();index++){
            if(frequency.containsKey(string1.charAt(index))){
                frequency.put(string1.charAt(index),frequency.get(string1.charAt(index))+1);
            }else{
                frequency.put(string1.charAt(index),1);
            }
        }
        for(int index=0;index<string2.length();index++){
            int count =frequency.get(string1.charAt(index));
            System.out.println(string1.charAt(index) + " " + count);
        }
    }
}
