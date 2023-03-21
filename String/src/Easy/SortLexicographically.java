package Easy;

import java.util.Arrays;

public class SortLexicographically {
	public static void main(String[] args) {
		String stringArray[] = { "Harit", "Girish", "Gritav", "Lovenish", "Nikhil", "Harman" };
		sort(stringArray);
		//Arrays.sort(stringArray,String.CASE_INSENSITIVE_ORDER);
		//System.out.println(Arrays.toString(stringArray));
	}

	public static void sort(String[] stringArray) {
        for(int i=0;i<stringArray.length-1;i++) {
        	for(int j=i+1;j<stringArray.length;j++) {
        		if(stringArray[i].compareToIgnoreCase(stringArray[j])>0) {
        			String temp = stringArray[i];
        			stringArray[i] =stringArray[j];
        			stringArray[j] =temp;
        		}
        	}
        }
        System.out.println(Arrays.toString(stringArray));
	}
	
}
