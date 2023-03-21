package Easy;

public class InsertString {
	public static void main(String[] args) {
          String str = "Computer Portal";
          String str1 = "Science ";
        		  int index=8;
          
          String ans= str.substring(0, index+1)+str1+str.substring(index+1);
          System.out.println(ans);
          
	}
}
