package Easy;

public class Ques8 {
	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silen";
		
		if(str1.length()!=str2.length())
		{
			System.out.println("false");
		}

		int[] strArray1 = new int[26];

		for (int i = 0; i < str1.length(); i++) {
			strArray1[str1.charAt(i) - 'a']++;
		}

		for (int j = 0; j < str2.length(); j++) {
			strArray1[str2.charAt(j) - 'a']--;
		}
		for (int k = 0; k < 26; k++) {
			if (strArray1[k] != 0) {
				System.out.println("Not anagram");
			} else {
				System.out.println("anagram");
			}

		}

	}
}
