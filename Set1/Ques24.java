package Set1;

import java.util.Scanner;

public class Ques24 {

    //ASCII value of a character

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character");
        char ch = sc.next().charAt(0);
        System.out.println("The ASCII value "+ch +" is " +(int)ch);
    }
}
