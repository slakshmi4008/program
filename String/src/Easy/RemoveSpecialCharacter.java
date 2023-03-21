package Easy;

public class RemoveSpecialCharacter {
	public static void main(String[] args) {
		String string = "This#string%contains^special*characters&.";

		string = string.replaceAll("[^a-zA-Z-0_9]", "");

		System.out.println(string);
	}
}
