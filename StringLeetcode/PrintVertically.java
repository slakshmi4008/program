package StringLeetcode;

import java.util.ArrayList;
import java.util.List;

public class PrintVertically {
    public static void main(String[] args) {
        String s ="how are you";
       // printVertically(s);

    }
          public static void printVertically(String s) {
            String[] stringArray = s.split(" ");
            int max=0;
            for(int i=0;i<stringArray.length;i++){
                max=Math.max(max,stringArray[i].length());
            }

            String str ="";

            List<String> list = new ArrayList<>();
            for(int i=0;i<max;i++){
                for(String word : stringArray){

                    str = str+ String.valueOf(word.charAt(i));

                }
                list.add(str);
                str="";

            }
           // return list;
        }

    }

