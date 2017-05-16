/**
 * Created by Dwape on 5/9/17.
 */
public class Ej2 {

    public static boolean diagonallyDominant(int[][] matrix){
        for (int i=0; i<matrix.length; i++){
            int result = 0;
            for (int j=0; j<matrix[i].length; j++){
                if (i!=j) result += matrix[i][j];
            }
            if (Math.abs(result) >= Math.abs(matrix[i][i])) return false;
        }
        return true;
    }
}
