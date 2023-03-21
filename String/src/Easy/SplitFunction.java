package Easy;

import java.util.Arrays;

public class SplitFunction {
	public static void main(String[] args) {
		String string = "One two       three\n four\tfive ";

		//String[] ar = string.split(" ");
		
		String[] ar = string.split("\\s+");
		System.out.println(Arrays.toString(ar));
		
		System.out.println(ar.length);
	}

}
