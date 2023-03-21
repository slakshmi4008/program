package logic;

public class Fibo {
    public static void main(String[] args) {
        int n=6;

        int ans = findFib(n);
        System.out.println(ans);
    }
    private static int findFib(int n){
        int a=0;
       int b=1;
       int c;
       int count=0;
       if(n==0){
           return 0;
       }
        for (int i = 2; i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;

            if(isPrime(b)){
                System.out.println(b);
            }
        }
        return b;
        }

    private static boolean isPrime(int b) {
        return true;
    }
}

