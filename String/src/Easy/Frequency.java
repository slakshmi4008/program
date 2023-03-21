package Easy;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
	public static void main(String[] args) {
		String string = "asdfasdf";
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < string.length(); i++) {
			map.put(string.charAt(i), map.getOrDefault(string.charAt(i), 0) + 1);
		}
		for (Map.Entry<Character, Integer> e : map.entrySet()) {
			System.out.println(e);
		}
	}
}
