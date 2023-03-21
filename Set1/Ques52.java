package Set1;

import java.util.Scanner;

public class Ques52 {
    //using recursion reverse the string

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the input string");
        String str=sc.nextLine();
        String [] strArray = str.split(" ");
        String result= "";

        int len = strArray.length-1;
        System.out.println(reverseSentence(strArray,len,result));
        //System.out.println(result);

    }

    private static String reverseSentence(String[] strArray, int len,String result) {
        if(len>=0) {
            result = result + strArray[len--]+" ";
            reverseSentence(strArray,len,result);
        }
return result;
    }
}
