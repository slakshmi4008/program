package Practice;

public class SecondDigit {
    public static void main(String[] args) {
        int n=523;

        int digits = (int) Math.max(1,Math.log10(n));
        System.out.println(digits);

        int firstdigit = n/(int)Math.pow(10,digits);

        System.out.println(firstdigit);



        n= n-((int) (firstdigit*(Math.pow(10,digits))));
        System.out.println("number " +n);

        digits--;
        int seconddigit = n/(int)Math.pow(10,digits);

        System.out.println(seconddigit);


    }
}
