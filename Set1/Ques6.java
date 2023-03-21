package Set1;

import java.util.Scanner;

public class Ques6 {
    //splitting the students into groups based on roll number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input");
        int n = sc.nextInt();
        int numOfGroups = n/5;
        int startRoll =101;
        for(int i=1;i<=numOfGroups;i++) {
            group(startRoll++,i,numOfGroups);
        }
    }
    public static void group(int startRoll,int groupNumber,int numOfGroups){
        System.out.println("Group : " + groupNumber);
        int count=0;
        while(count<5){
            System.out.println(startRoll);
            startRoll+=numOfGroups;
            count++;
        }
    }
}
