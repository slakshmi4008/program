package Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CommonChar {
	public static void main(String[] args) {
		String str = "geeks";
		String str1 = "ee";

		//boolean ans = freq(str, str1);
		commonChar(str,str1);
		//System.out.println(ans);

	}

	private static void commonChar(String str, String str1) {
		 int[] strArray = new int[26];
		 int[] strArray1 = new int[26];
		 int count=0;
		 
		 for(int i=0;i<str.length();i++) {
			
			 strArray[str.charAt(i)-'a']++;
		 }
		 System.out.println(Arrays.toString(strArray));
		 
		 for(int i=0;i<str1.length();i++) {
			 strArray1[str1.charAt(i)-'a']++;
		
		 }
		 
		 System.out.println(Arrays.toString(strArray));
		 
		 for(int i=0;i<26;i++) {
			 
			// System.out.print(strArray[i]+" ");
			// System.out.println(strArray1[i]);
			 
			 if(strArray[i]>0 && strArray1[i]>0) {
				 count++;
			 }
		 }
		 
		 System.out.println(count);
		
	}

	private static boolean freq(String str, String str1) {
		Map<Character, Integer> map = new HashMap<>();
		int countCommon=0;
		

		for (int i = 0; i < str.length(); i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
		}

		for (int i = 0; i < str1.length(); i++) {
			if (map.get(str1.charAt(i)) !=null) {
				countCommon++;
				//return true;
			}
		}
		System.out.println(countCommon);
		return false;
	}
}
