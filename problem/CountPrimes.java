package math;

public class CountPrimes {
    public static void main(String[] args) {
        int n=10;
        countPrimes(n);
    }

    private static void countPrimes(int n) {
        int count=0;
        for(int i=2;i<n;i++){
            if(isPrime(i)){
                count++;
            }
        }
        System.out.println(count);
    }
    private static boolean isPrime(int n){

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }

}
