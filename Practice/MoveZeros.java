package Practice;

public class MoveZeros {
    public static void main(String[] args) {
        int [] nums ={1,0,1};
        int i=0;
        int j=0;

        while(j<nums.length){
            if((nums[i]==0)&& nums[j]!=0){
                nums[i]=nums[j];
                nums[j]=0;
                i++;
                j++;
            }else{

                j++;
            }
        }
    }
}
