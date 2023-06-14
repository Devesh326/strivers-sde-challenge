package Day_1;

import java.util.HashSet;
import java.util.Set;

public class Set_Matrix_Zeros {
    public static void setZeroes(int[][] matrix) {
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();

        for(int i=0; i< matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        }

        for(int ele: row){
            for(int i=0; i< matrix[0].length; i++)
                matrix[ele][i]=0;
        }

        for(int ele: col){
            for(int i=0; i< matrix.length; i++)
                matrix[i][ele]=0;
        }
//        System.out.println(Arrays.deepToString(matrix));
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
    }
}
