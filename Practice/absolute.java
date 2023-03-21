package Practice;

public class absolute {
    public static void main(String[] args) {
        int n=-123;
        int num =Math.abs(n);
        //System.out.println(num);
        int last = n%10;
        //System.out.println(last);

        int a = 120035;
        //int secondLastDigit = (a % 100) / 10;
        //System.out.println(secondLastDigit);
         int secondLastDigit = (a / 10) % 10;
        System.out.println(secondLastDigit);
        System.out.println(0%2);
    }
}
