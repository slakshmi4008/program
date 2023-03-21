package Set1;

import java.util.Scanner;

public class Ques15 {
    //Area of cylinder
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("enter the radius of cylinder");
        float r=sc.nextFloat();
        System.out.println("enter the height of cylinder");
        float h=sc.nextFloat();

        float area = (float) ((2*3.14*r*h)+(2*3.14*r*r));

        System.out.println("Area of cylinder is " + area);

    }
}
