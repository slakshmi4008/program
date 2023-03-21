package Assessment;

import java.util.ArrayList;
import java.util.List;

public class SubSeq {

    static List<String> list= new ArrayList<>();
    public static void main(String[] args) {
        subSeq("", "abc");
        System.out.println(list);
        subSeq("", "cba");
        System.out.println(list);
        System.out.println(list.contains("ca"));
    }
    public static void subSeq(String p,String up){
        if(up.isEmpty()){
           // System.out.println(p);
            list.add(p);
            return;
        }
        char ch=up.charAt(0);
        subSeq(p+ch,up.substring(1));
        subSeq(p,up.substring(1));
    }
}
