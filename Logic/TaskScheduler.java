package leetcode;

public class TaskScheduler {
    public static void main(String[] args) {
        char[] tasks = {'A','A','A','B','B','B'};
        int[] num  = new int[tasks.length];
        int n=2;
        int idle=0;

        for(int i=0;i<tasks.length;i++){
            for(int j=i+1;j<tasks.length;j++){
                if(tasks[i]==tasks[j] && num[j]!=-1){
                    j++;
                }
                else if (num[j]!=-1 && tasks[i]!=tasks[j]  ){
                    n--;
                    num[j]=-1;
                    if(n==0){
                       break;
                    }
                }
            }
            if(n!=0)idle++;
        }
        System.out.println(idle);
    }
}
