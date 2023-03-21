package Set1;

import java.util.Scanner;

public class Ques2 {
    //Print alphabets until z without using string
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabet:");
        char ch = sc.next().charAt(0);

        for(char i = ch;i>=ch && i<='Z';i++){
            System.out.print(i);
        }
    }
}
