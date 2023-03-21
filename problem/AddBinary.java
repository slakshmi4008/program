package math;

public class AddBinary {
    public static void main(String[] args) {
        String a ="1010";
        String b="1011";
        String ans = addBinary(a,b);
        System.out.println(ans);
    }
        public static String addBinary(String a, String b) {

        int len1 = a.length();
        int len2 = b.length();

        int len = Math.max(len1,len2);
        char carry=0;
        char sum=0;
        char jchar =0;
        String ans ="";

        for(int i=len1-1,j=len2-1;i>=0;i--,j--){
            if(j<0) jchar =0;
            else jchar = (char) (b.charAt(j)-'0');

            if(a.charAt(i)-'0'+jchar+carry >1){
                carry='1';
                sum='0';
            }else {
                carry = '0';
                sum = '1';
            }
            ans=sum+ans;
        }
        return carry+ans;
    }
}
