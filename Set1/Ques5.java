package Set1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ques5 {
    //pattern

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the alphabet");
        char input = sc.next().charAt(0);

        for(char i= input;i>='A';i-- ){
            for(char j= i;j>='A';j-- ){
                System.out.print((char)i);
            }
            System.out.println();
        }
    }
}
