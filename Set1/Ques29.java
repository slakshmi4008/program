package Set1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ques29 {
    //Vowel or Consonent
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the input character");
        char ch = sc.next().charAt(0);

        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':{
                System.out.println("The character is vowel");
                break;
            } default:{
                if(ch>='A' && ch<='z'){
                    System.out.println("The chracter is consonent");
                }else{
                    System.out.println("Enter valid input");
                }
            }


        }
    }
}
