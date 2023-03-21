package Easy;

public class DuplicateTwoStrings {
	public static void main(String[] args) {
		String str1 = "asdas";
		String str2 = "sdkhk";

		String str11 = "";
		String str12 = "";
		int count = 0;

		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();

		for (int i = 0; i < ch1 .length; i++) {
			if (!str11.contains(ch1[i] + ""))
				str11 += ch1[i];
		}
		System.out.println("str11: " + str11);
		for (int i = 0; i < ch2.length; i++) {
			if (!str12.contains(ch2[i] + ""))
				str12 += ch2[i];
		}
		System.out.println("str12: " + str12);

		char[] ch11 = str11.toCharArray();
		char[] ch12 = str12.toCharArray();

		for (int i = 0; i < ch11 .length; i++) {
			for (int j = 0; j < ch12.length; j++) {
				if (ch11[i] == ch12[j]) {
					count++;
				}
			}
		}
		System.out.println("Duplicate Letters: " + count);
	}
}
