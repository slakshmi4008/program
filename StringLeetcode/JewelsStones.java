package StringLeetcode;

public class JewelsStones {
    public static void main(String[] args) {
       String jewels = "aA";
       String stones = "aAAbbbb";
       System.out.println(stones.replaceAll("[^" + jewels + "]", "").length());
        System.out.println(jewels.charAt(0));
        String res = String.valueOf(jewels.charAt(0));
    }

}
