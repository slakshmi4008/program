package palindrome;

public class ValidPallindrome {
    public static void main(String[] args) {
        String s = "0p";

        s=s.toLowerCase();
        System.out.println(s);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
        for(int i=0,j=sb.length()-1;i<=j;i++,j--){
            if(sb.charAt(i)!=sb.charAt(j)) System.out.println(false);

        }
        System.out.println(true);
    }

}
