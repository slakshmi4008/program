package Easy;

public class duplicates {
	public static void main(String[] args) {
		String str = "Great responsibility";
		int count;
		char[] string = str.toCharArray();

		for (int i = 0; i < str.length() - 1; i++) {
			count = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (string[i] == string[j] && string[i] != ' ') {
					count++;
					string[j] = '0';
				
				}
			}
//to print repeated characters
			if (count >=1 && string[i] != '0') {
				System.out.print(string[i] + " ");
			}
			/*//to print non repeated characters
			if (count == 1 && string[i] != '0') {
				System.out.println("non repeated : " + string[i] + " ");
			}*/
		}
	}
}
