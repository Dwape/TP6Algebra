/**
 * Created by Gianni on 5/17/2017.
 */
public class Ej4 {

    double[][] summation(double[] matrixA, double[] matrixB, Calculator calculator){
        double[][] result = new double[getMatrixSize(matrixA.length)][getMatrixSize(matrixA.length)];
        if (matrixA.length==matrixB.length){
            int l=0;
            for (int i=0; i<3; i++){
                for (int j=i; j<3; j++){
                    result[i][j] = matrixA[l] + matrixB[l];
                    l++;
                }
            }
        }
        return result;
    }

    private int getMatrixSize(int amountOfElements){
        return (int) (0.5*(Math.sqrt((8*amountOfElements)+1)-1));
    }
    /*
    for (int i=0; i<matrixA.length; i++){
            for (int j=i; j<matrixA[i].length; j++){
                //sum[i][j] = matrixA[i][j] + matrixB[i][j];//use calc
                sum[i][j] = calculator.sum(matrixA[i][j], matrixB[i][j]);
            }
        }
     */
}
