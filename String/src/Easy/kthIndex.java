package Easy;

public class kthIndex {
	public static void main(String[] args) {
		int k = 2;
		String str = "geeks";
		char ch = 'a';
		String ans = str.substring(0, 2) + ch + str.substring(2);
		System.out.println(ans);
	}
}
