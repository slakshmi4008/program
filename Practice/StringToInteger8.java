package Practice;

public class StringToInteger8 {
    public static void main(String[] args) {

        int result = myAtoi("words and 987");
        System.out.println(result);
    }
    public static int myAtoi(String s) {
        String res ="";
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>47 && s.charAt(i)<58)||(s.charAt(i)==43)||(s.charAt(i)==45)){
                res=res+s.charAt(i);
            }
        }
        return Integer.parseInt(res);
    }
}
