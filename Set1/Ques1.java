package Set1;
import java.util.*;

public class Ques1 {
    //Program for multiplication table and subtraction table
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= sc.nextInt();
        System.out.println("enter the operand");
        int ch = sc.next().charAt(0);

        switch(ch){
            case '*' : for(int i=1;i<=10;i++){
                int res = i*n;
                System.out.println(i +" * " +n +" = " +res );
            }
            break;

            case '-': for(int i=n;i<=10;i++){
                int res = i-n;
                System.out.println(i+" - "+ n+ " = " +res);
            }
            break;
            default:
                System.out.println("Enter valid operand");
        }



    }
}
