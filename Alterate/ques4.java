package Assessment;

public class ques4 {
    public static void main(String[] args) {
          int[] coins ={0,2,5,0};
          int amount=23;
          int out=coinChange(coins,amount);
          System.out.println(out);

    }
    public static int coinChange(int[] coins, int amount) {
        if(amount<1) return 0;
        int[] dp = new int[amount+1];
        int sum = 0;

        while(++sum<=amount) {
            int min = -1;
            for(int coin : coins) {
                if(sum >= coin && dp[sum-coin]!=-1) {
                    int temp = dp[sum-coin]+1;
                    min = min<0 ? temp : (temp < min ? temp : min);
                }
            }
            dp[sum] = min;
        }
        return dp[amount];
    }
}
