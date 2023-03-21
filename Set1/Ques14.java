package Set1;

import java.util.Scanner;

public class Ques14 {
    //Area of rectangle
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the length of rectangle");
        float length =sc.nextFloat();
        System.out.println("enter the length of rectangle");
        float breadth =sc.nextFloat();

        float area = length*breadth;

        System.out.println("Area of rectangle is " + area);

    }
}
