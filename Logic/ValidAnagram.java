package anagram;

public class ValidAnagram {
    public static void main(String[] args) {
        String s1 ="anagram";
        String s2 = "nagaram";
        boolean ans = isValidAnagram(s1,s2);
        System.out.println(ans);
    }
    private static boolean isValidAnagram(String s1,String s2){
          int[] alphabet = new int[26];
          for(int i=0;i<s1.length();i++)
          {
             alphabet[s1.charAt(i)-'a'] ++;
          }
        for(int i=0;i<s2.length();i++)
        {
            alphabet[s2.charAt(i)-'a'] --;
        }
        for(int i : alphabet){
            if(i!=0)
                return false;
        }
        return true;
    }
}
