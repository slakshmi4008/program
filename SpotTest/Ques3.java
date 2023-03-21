package SpotTest;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        //get input
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the length of the first array");
        int len1=scanner.nextInt();

        String[] X= new String[len1];

        System.out.println("Enter the length of the second array");
        int len2=scanner.nextInt();

        String[] Y= new String[len2];

        //receiving input from the user
        System.out.println("Enter the elements for first array");
        for(int i=0;i<len1;i++){
            X[i]=scanner.next();
        }
        System.out.println("Enter the elements for second array");
        for(int i=0;i<len2;i++){
           Y[i]=scanner.next();
        }
        //String[] X= {"ceo","alco","caaeio","ceai"};
        //String[] Y= {"ec","oc","ceo"};
        FindSuperStringCount(X,Y);
    }
    private static void FindSuperStringCount(String[] X,String[] Y){

        int outputCount=0;
        boolean[] boolArray = new boolean[26];
        int count=0;

        for(String word:Y) {
            for (int i = 0; i < word.length(); i++) {
                int index = word.charAt(i) - 'a';

                if (boolArray[index] != true) {
                    boolArray[index] = true;
                    count++;
                }
            }
        }
            char[] uniqueCharArray= new char[count];
            int uniqueCharArrayIndex=0;

            for(int i=0;i<boolArray.length;i++){
                if(boolArray[i]){
                    uniqueCharArray[uniqueCharArrayIndex++]=(char)('a'+i);
            }
        }

            int charCount=0;

            for(String words:X){

                char[]  temp = words.toCharArray();
                for(int index=0;index<uniqueCharArray.length;index++){

               for(int i=0;i<temp.length;i++){
                if(uniqueCharArray[index]==words.charAt(i)){
                    charCount++;
                    break;
                }
                   if(charCount==uniqueCharArray.length){outputCount++;}
            }

            }
        }
        System.out.println("output is " +outputCount);
    }
}
