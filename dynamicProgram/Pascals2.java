package dynamicProgram;

import java.util.ArrayList;
import java.util.List;

public class Pascals2 {
    public static void main(String[] args) {
        List<Integer> ans = new ArrayList<>();
        ans =getRow(3);
        System.out.println(ans);
    }


        public static List<Integer> getRow(int rowIndex) {
            List<List<Integer>> ans = new ArrayList<>();

            for(int i=0;i<rowIndex+2;i++){
                List<Integer> list = new ArrayList<>();
                for(int j=0;j<=i;j++){
                    if(j==0||j==i)
                        list.add(1);
                    else{
                        if(j!=0)
                            list.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
                    }
                }
                ans.add(list);
            }
            return ans.get(rowIndex);
        }
    }

