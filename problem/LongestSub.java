package slidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSub {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int ans =lengthOfLongestSubstring(s);
        int ans1 = withMap(s);
        int ans2 =withSet(s);
        System.out.println(ans);
    }
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), longest = 0;
        int[] nextIndex = new int[128];

        for (int r=0, l=0; r<n; r++) {
            l = Math.max(nextIndex[s.charAt(r)], l);
            longest = Math.max(longest, r - l + 1);
            nextIndex[s.charAt(r)] = r + 1;
        }
        return longest;
    }
    public static int withMap(String s) {

        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }
    public static int withSet(String s) {
        int i = 0, j = 0, max = 0;
        Set<Character> set = new HashSet<>();

        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(i++));
            }
        }

        return max;
    }
}
