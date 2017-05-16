/**
 * Created by Dwape on 5/9/17.
 */
public class Ej3 {

    public double[] exerciseAI(double[][] matrixA, double[] vectorX, Calculator calculator){
        int n = matrixA.length;
        int m = matrixA[0].length;
        double[] result = new double[n];
        if(m==vectorX.length){
            for (int i=0; i<n;i++){
                result[i]=0;
                for (int j=i;j<m;j++){
                    //System.out.println(matrix[i][j]);
                    //System.out.println(vector[j]);
                    //result[i] += matrixA[i][j] * vectorX[j];
                    result[i] = calculator.sum(result[i],calculator.multiplication(matrixA[i][j],vectorX[j]));
                }
            }
        }
        return result;
    }

    public double[][] exerciseAII(double[][] matrixA, double[][] matrixB, Calculator calculator){
        if ((matrixA.length != matrixB.length) || (matrixA[0].length != matrixB[0].length)){
            throw new RuntimeException(); //check if there is a more elegant solution
        }
        double[][] sum = new double[matrixA.length][matrixA[0].length];
        for (int i=0; i<matrixA.length; i++){
            for (int j=i; j<matrixA[i].length; j++){
                //sum[i][j] = matrixA[i][j] + matrixB[i][j];//use calc
                sum[i][j] = calculator.sum(matrixA[i][j], matrixB[i][j]);
            }
        }
        return sum;
    }

    public double[][] exerciseAIII(double[][] matrixA, double[][] matrixB, Calculator calculator){
        if (matrixA[0].length != matrixB.length){
            throw new RuntimeException();
        }
        double[][] multiplication = new double[matrixA.length][matrixB[0].length];
        for (int i=0; i<multiplication.length; i++){
            for (int j=0; j<multiplication[i].length; j++){
                double result = 0;
                for (int k=i; k<=j; k++){
                    //result += matrixA[i][k] * matrixB[k][j];
                    double product = calculator.multiplication(matrixA[i][k], matrixB[k][j]);
                    result = calculator.sum(result, product);
                }
                multiplication[i][j] = result;
            }
        }
        return multiplication;
    }

    public double[] exerciseBI(double[][] matrixA, double[] vectorX, Calculator calculator){
        int n = matrixA.length;
        int m = matrixA[0].length;
        double[] result = new double[n];
        if(m==vectorX.length && n==m){//has to be squared
            result[0]=0;
            for (int j=0;j<m;j++){
                //result[0]+= matrixA[0][j] * vectorX[j];
                result[0] = calculator.sum(result[0],calculator.multiplication(matrixA[0][j],vectorX[j]));
            }
            for (int i=1; i<n;i++){
                result[i]=0;
                for (int j=0;j<m;j++){
                    //System.out.println(matrix[i][j] * vector[j]);
                    //result[i] += matrixA[i][j] * vectorX[j];
                    result[i] = calculator.sum(result[i],calculator.multiplication(matrixA[i][j],vectorX[j]));
                }
            }
        }
        return result;
    }

    public double[][] exerciseBII(double[][] matrixA, double[][] matrixB, Calculator calculator){
        if ((matrixA.length != matrixB.length) || (matrixA[0].length != matrixB[0].length)){
            throw new RuntimeException();
        }
        double[][] result = new double[matrixA.length][matrixA[0].length];
        for (int i=0; i<matrixA[0].length; i++){
            result[0][i] = calculator.sum(matrixA[0][i], matrixB[0][i]);
        }
        for (int i=1; i<matrixA.length; i++){
            for (int j=i-1; j<matrixA[0].length; j++){
                result[i][j] = calculator.sum(matrixA[i][j], matrixB[i][j]);
            }
        }
        return result;
    }

    public double[][] exerciseBIII(double[][] matrixA, double[][] matrixB, Calculator calculator){
        if (matrixA[0].length != matrixB.length){
            throw new RuntimeException();
        }
        double[][] multiplication = new double[matrixA.length][matrixB[0].length];
        //for (int i=0; i<multiplication.length; i++){
            //for (int j=0; j<)
        //}
        for (int i=0; i<multiplication.length; i++){
            for (int j=0; j<multiplication[i].length; j++){
                double result = 0;
                for (int k=i-1; k<=j+1 && k!=matrixB[0].length; k++){
                    if (k<0) k=0; //fixes first run
                    //if (k==matrixB[0].length) k= matrixB[0].length-1;
                    //result += matrixA[i][k] * matrixB[k][j];
                    double product = calculator.multiplication(matrixA[i][k], matrixB[k][j]);
                    System.out.println(product);
                    result = calculator.sum(result, product);
                }
                multiplication[i][j] = result;
            }
        }
        return multiplication;
    }

    public double[] exerciseCI(double[][] matrixA, double[] vectorX, Calculator calculator){
        int n = matrixA.length;
        int m = matrixA[0].length;
        double[] result = new double[n];
        if(m==vectorX.length && n==m){//has to be squared
            int count =0;
            for (int i=0; i<n;i++){
                result[i]=0;
                for (int j=i;j<m-count;j++){
                    result[i] += matrixA[i][j] * vectorX[j];
                    count++;
                }
            }

        }
        return result;
    }


    public double[] exerciseDI(double[][] matrixA, int k1A, int k2A, double[] vectorX, Calculator calculator){
        int n = matrixA.length;
        int m = matrixA[0].length;
        double[] result = new double[n];
        if(m==vectorX.length && n==m){
            for (int i=0; i<n;i++){
                result[i]=0;
                int j=0;
                while ( j<m){
                    if (j>=i-k1A && j<=i+k2A) result[i] = calculator.sum(result[i],calculator.multiplication(matrixA[i][j],vectorX[j]));
                    //result[i] += matrixA[i][j] * vectorX[j];
                    j++;
                }
                //for (int j=i-k1A;j>m)
            }
        }
        return result;
    }
}
