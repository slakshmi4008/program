package SpotTest;

import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the input String");
        String inputString = scanner.nextLine();
        //String inputString = "Hello World Please";
        System.out.println("Enter the reference String");

        String refString = scanner.nextLine();

        //String refString = "Help";
        FindCount(inputString,refString);
    }
    private static void FindCount(String inputString,String refString ){
        //converting to lowercase
        inputString = inputString.toLowerCase();
        refString = refString.toLowerCase();

        for(int refIndex=0;refIndex<refString.length();refIndex++){
            int count=0;
        for(int inputIndex=0;inputIndex<inputString.length();inputIndex++){

            if (refString.charAt(refIndex)== inputString.charAt(inputIndex)) {
                count++;
            }

            }
            System.out.println((refString.charAt(refIndex) + " : "+ count));

        }

    }
}
