/**
 * Created by Dwape on 5/9/17.
 */

/**
 * class Ej1
 * @author Gianluca Scolaro
 * @author Eduardo Lalor
 * @since  5/9/17.
 */
public class Ej1 {

    public Ej1(){
    }

    public double exerciseA(double[][] matrix, Calculator calculator){
        double sum = 0;
        int m = matrix[0].length;
        for (int i=0; i<m; i++){
            //sum += matrix[i][i];
            sum = calculator.sum(sum, matrix[i][i]);
        }
        return sum;
    }

    public double exerciseB(double[][] matrix, Calculator calculator){
        double sum = 0;
        int m = matrix[0].length;
        for (int i=0; i<m; i++){
            //sum += matrix[i][matrix[i].length-1-i];
            sum = calculator.sum(sum, matrix[i][m-1-i]);
        }
        return sum;
    }

    public double[] exerciseC(double[][] matrix, Calculator calculator){
        double[] sum = new double[matrix[0].length];
        for (int i=0; i<sum.length; i++){
            double result = 0;
            for (int j=0; j<matrix.length; j++){ //check if it works.
                //result += matrix[i][j];
                result = calculator.sum(result, matrix[i][j]);
            }
            sum[i]=result;
        }
        return sum;
    }

    public double[] exerciseD(double[][] matrix, double[] vector, Calculator calculator){
        int n = matrix.length;
        int m = matrix[0].length;
        double[] result = new double[n];
        if(m==vector.length){
            for (int i=0; i<n;i++){
                result[i]=0;
                for (int j=0;j<m;j++){
                    result[i]= calculator.sum(result[i],calculator.multiplication(matrix[i][j],vector[j]));
                }
            }
        }
        return result;
    }

    public double[][] exerciseE(double[][] matrix1, double[][] matrix2, Calculator calculator){
        if ((matrix1.length != matrix2.length) || (matrix1[0].length != matrix2[0].length)){
            throw new RuntimeException(); //check if there is a more elegant solution
        }
        double[][] sum = new double[matrix1.length][matrix1[0].length];
        for (int i=0; i<matrix1.length; i++){
            for (int j=0; j<matrix1[i].length; j++){
                //sum[i][j] = matrix1[i][j] + matrix2[i][j];
                sum[i][j] = calculator.sum(matrix1[i][j], matrix2[i][j]);
            }
        }
        return sum;
    }

    public double[][] exerciseF(double[][] matrix1, double[][] matrix2, Calculator calculator){
        if (matrix1[0].length != matrix2.length){
            throw new RuntimeException();
        }
        double[][] multiplication = new double[matrix1.length][matrix2[0].length];
        for (int i=0; i<multiplication.length; i++){
            for (int j=0; j<multiplication[i].length; j++){
                double result = 0;
                for (int k=0; k<matrix2.length; k++){
                    //result += matrix1[i][k] * matrix2[k][j];
                    double product = calculator.multiplication(matrix1[i][k], matrix2[k][j]);
                    result = calculator.sum(result, product);
                }
                multiplication[i][j] = result;
            }
        }
        return multiplication;
    }

    public double[][] exerciseG(double[][] matrix, Calculator calculator){
        double[][] result = new double[matrix[0].length][matrix.length];
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}
