package Practice;

public class REvEachWord {
    public static void main(String[] args) {
        String s ="Let's take LeetCode contest";
        reverseWords(s);

    }
    public static String reverseWords(String s) {
        String[] resArray = new String[s.length()];
        resArray = s.split(" ");
        String res ="";
        for(int i=0;i<resArray.length;i++){
            res = "" + reverseWord(resArray[i]);
        }
        System.out.println(res);
        return res;
    }
    private static String reverseWord(String str){
        int i=0;
        int j=str.length()-1;
        char[] arr = str.toCharArray();

        while(i<j){
            char temp = arr[j];
            arr[j]=arr[i];
            arr[i]=arr[j];
            i++;
            j--;

        }
        return String.valueOf(arr);
    }
}

