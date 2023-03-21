package leetcode;

public class IndexOfFirstOcc {
    public static void main(String[] args) {
        String s = "sadbutsad";
        String s1 = "sad";
        int ans = strStr(s,s1);
        System.out.println(ans);

    }
    public static int strStr(String haystack, String needle) {
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == needle.length()) return i;
                if (i + j == haystack.length()) return -1;
                if (needle.charAt(j) != haystack.charAt(i + j)) break;
            }
        }
    }
}
