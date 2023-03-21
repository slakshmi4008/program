package SpotTest;

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        //get input from the user
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the input string");
        //String string=scanner.nextLine();

        String string= "(ab)(a+b)";

        char[] charArray = string.toCharArray();

        int countOpenBrace=0;
        int countCloseBrace=0;
        boolean flag=false;

        for(int i=0;i<charArray.length;i++){
            if(charArray[i]=='(') countOpenBrace++;
            if(charArray[i]==')') countCloseBrace++;
            if(charArray[i]=='a'){
                if(charArray[i+1]=='+'||charArray[i+1]=='-'||charArray[i+1]=='/'||charArray[i+1]=='*'){
                    flag=true;
                }else{
                    break;
                }
            }
        }
        if((countOpenBrace==countCloseBrace)&&(flag==true)){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }

    }
}
