package SpotTest;

import java.util.Arrays;
import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the number of 1,2,5,10 rupee coin");
        int [] denomination = new int[4];

        for(int i=0;i<4;i++){
            denomination[i]=scanner.nextInt();
        }
        //int[] denomination ={1,2,5,10};

        //int sum=123;

        System.out.println("Enter the total sum");
        int sum=scanner.nextInt();

        int output= findFewestCoin(denomination,sum);
        System.out.println("The fewer number of coin is" +output);
    }
    private static int findFewestCoin(int[] denomination,int sum){

        int count10=0;
        int Count5=0;
        int Count2=0;
        int Count1=0;

        //for 10 rupee coin
        if(denomination[3]*10<sum){
        count10= sum/10;
        count10=Math.min(denomination[3],count10);
        sum=sum-(count10*10);}

        //for 5 rupee coin
        if(denomination[2]*5<sum){
        if(sum>=5){
        Count5=sum/5;
        count10=Math.min(denomination[2],count10);
        sum=sum-(Count5*5);}}

        //for 2 rupee coin
        if(denomination[1]*2<sum){
        if(sum>=2){
        Count2=sum/2;
        count10=Math.min(denomination[1],count10);
        sum=sum-(Count2*2);}}

        //for 1 rupee coin
        if(denomination[0]*1<sum){
        Count1=sum;
        sum=sum-Count1;}

        if(sum==0){
            return count10+Count5+Count2+Count1;
        }
       return -1;

    }
}
