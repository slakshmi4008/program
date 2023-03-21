package Set1;

import java.util.Scanner;

public class Ques16 {
    //Concentric circles
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius of larger circle");
        float r1 = sc.nextFloat();
        System.out.println("enter the radius of smaller circle");
        float r2 = sc.nextFloat();

        float area = (float)3.14 *((r1*r1)-(r2*r2));

        System.out.println("Area between two concentric circle is " + area);

    }
}
