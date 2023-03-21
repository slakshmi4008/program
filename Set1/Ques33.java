package Set1;

import java.util.Scanner;

public class Ques33 {
    //Alphabet or not
    public static void main(String[] args) {
            Scanner sc =new Scanner (System.in);
            System.out.println("Enter the character");
            char ch = sc.next().charAt(0);

            if(ch>='A'&&ch<='z'){
                System.out.println("The entered input is alphabet");
            }else{
                System.out.println("The entered input is not alphabet");
            }


    }
}
