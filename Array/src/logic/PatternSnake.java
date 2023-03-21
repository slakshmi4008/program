package logic;

public class PatternSnake {
    public static void main(String[] args) {
        int n=2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j + " ");
            }
            System.out.println();
            for(int j=n*i+1;j>0;j--){
                System.out.print(j + " ");
            }
        }
    }
}
