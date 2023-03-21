package Easy;

public class ReverseWords {
public static void main(String[] args) {
	String string ="one two three";
	
	String[] arr = string.split(" ");
	
	for(int i=arr.length-1;i>=0;i--) {
		System.out.print(arr[i] + " ");
	}
}
}
