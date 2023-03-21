package Set1;

import java.util.Scanner;

public class Ques13 {
    //Area of square
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the side of square");
        float side =sc.nextFloat();

        float area = side*side;

        System.out.println("Area of square is " + area);

    }
}
