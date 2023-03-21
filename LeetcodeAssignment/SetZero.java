package LeetcodeAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetZero {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        setZeroes(matrix);
    }
            public static void setZeroes(int[][] matrix) {
                List<Integer> rowColumn = new ArrayList<>();

                for(int i=0;i<matrix.length;i++){
                    for(int j=0;j<matrix[i].length;j++){
                        if(matrix[i][j]==0){
                            rowColumn.add(i);
                            rowColumn.add(j);
                        }
                    }
                }
                for(int i=0;i<rowColumn.size();i++){
                    if (i%2==0){
                        rowZero(matrix,i);
                    }else{
                        columnZero(matrix,i);
                    }
                    System.out.println(Arrays.deepToString(matrix));

                }
            }
            private static void rowZero(int[][] matrix ,int row){

                for(int j=0;j<matrix[row].length;j++){
                    matrix[row][j]=0;
                }
            }
            private static void columnZero(int[][] matrix,int column){

                for(int j=0;j<matrix.length;j++){
                    matrix[j][column]=0;
                }
            }
        }

