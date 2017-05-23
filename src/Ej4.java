/**
 * class Ej4
 * @author Gianluca Scolaro
 * @author Eduardo Lalor
 * @since  5/9/17.
 */
public class Ej4 implements Exercise4{

    public double[][] summation(double[] matrixA, double[] matrixB, Calculator calculator){
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
}
