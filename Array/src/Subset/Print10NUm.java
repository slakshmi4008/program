package Subset;

public class Print10NUm {
    public static void main(String[] args) {
        int input=10;
        printNum(input,input-1);
    }

    private static void printNum(int input,int current) {
        if(current<0) {
            return;
        }
        System.out.println(input-current);
        printNum(input,current-1);

    }
}
