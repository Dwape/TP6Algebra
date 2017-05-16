/**
 * Created by Dwape on 5/9/17.
 */
public class Ej3 {

    public static int[][] sum(int[][] matrix1, int[][] matrix2){
        if ((matrix1.length != matrix2.length) || (matrix1[0].length != matrix2[0].length)){
            throw new RuntimeException(); //check if there is a more elegant solution
        }
        int[][] sum = new int[matrix1.length][matrix1[0].length];
        for (int i=0; i<matrix1.length; i++){
            for (int j=i; j<matrix1[i].length; j++){
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sum;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2){
        if (matrix1[0].length != matrix2.length){
            throw new RuntimeException();
        }
        int[][] multiplication = new int[matrix1.length][matrix2[0].length];
        for (int i=0; i<multiplication.length; i++){
            for (int j=0; j<multiplication[i].length; j++){
                int result = 0;
                for (int k=i; k<=j; k++){
                    result += matrix1[i][k] * matrix2[k][j];
                }
                multiplication[i][j] = result;
            }
        }
        return multiplication;
    }
}
