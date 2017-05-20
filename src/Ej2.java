/**
 * class Ej2
 * @author Gianluca Scolaro
 * @author Eduardo Lalor
 * @since  5/9/17.
 */
public class Ej2 {

    public boolean exerciseA(double[][] matrix, Calculator calculator){//calculator not needed.
        int n = matrix.length;
        int m = matrix[0].length;
        if (n!=m)return false;
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (matrix[i][j]!=matrix[j][i])  return false;
            }
        }
        return true;
    }

    public boolean exerciseB(double[][] matrix, Calculator calculator){//calculator not needed.
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
