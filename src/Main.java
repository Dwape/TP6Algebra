/**
 * Created by Dwape on 5/9/17.
 */
public class Main {

    public static void main(String[] args) {

        testEx3();
        /*
        int[][] matrix1 = new int[2][2];
        matrix1[0][0] = 1;
        matrix1[0][1] = 2;
        matrix1[1][0] = 0;
        matrix1[1][1] = 3;

        int[][] matrix2 = new int[2][1];
        matrix2[0][0] = 4;
        matrix2[1][0] = 5;


        int[][] matrix3 = Ej1.multiply(matrix1, matrix2);
        System.out.println(matrix3[0][0]);
        System.out.println(matrix3[1][0]);

        System.out.println(Ej2.diagonallyDominant(matrix1));

        int[][] matrix4 = Ej3.multiply(matrix1, matrix2);

        System.out.println(matrix4[0][0]);
        System.out.println(matrix4[1][0]);

        int[][] matrixTransposed = Ej1.transpose(matrix2);

        System.out.println(matrixTransposed[0][0]);
        System.out.println(matrixTransposed[0][1]);

        int[][] matrixTransposed2 = Ej1.transpose(matrix1);

        System.out.println(matrixTransposed2[0][0]);
        System.out.println(matrixTransposed2[0][1]);
        System.out.println(matrixTransposed2[1][0]);
        System.out.println(matrixTransposed2[1][1]);
        */



        //testGianni();
    }
/*
    public static void testGianni(){
        double[] vector = {1,2,3};
        int[][] matrix = new int[2][3];


        matrix[0][0]=1;
        matrix[1][0]=2;
        matrix[0][1]=3;
        matrix[1][1]=4;
        matrix[0][2]=5;
        matrix[1][2]=6;

        int[] result = Ej1.d(matrix,vector);

        for (int i=0; i<result.length;i++){
            System.out.println(result[i]);
        }

        int[][] matrix1 = new int[3][3];

        matrix1[0][0]=1;
        matrix1[1][0]=2;
        matrix1[0][1]=3;
        matrix1[1][1]=4;
        matrix1[0][2]=5;
        matrix1[1][2]=6;
        matrix1[2][1]=7;
        matrix1[2][2]=8;
        matrix1[2][0]=9;
        System.out.println(Ej2.isSymmetric(matrix1));

        int[][] matrix2 = new int[3][3];

        matrix2[0][0]=1;
        matrix2[1][0]=2;
        matrix2[0][1]=2;
        matrix2[1][1]=4;
        matrix2[0][2]=5;
        matrix2[1][2]=6;
        matrix2[2][1]=6;
        matrix2[2][2]=8;
        matrix2[2][0]=5;
        System.out.println(Ej2.isSymmetric(matrix2));



        int[][] matrix3 = new int[3][3];

        matrix3[0][0]=1;
        matrix3[1][0]=4;
        matrix3[0][1]=2;
        matrix3[1][1]=4;
        matrix3[0][2]=5;
        matrix3[1][2]=6;
        matrix3[2][1]=7;
        matrix3[2][2]=8;
        matrix3[2][0]=0;

        int[] result1 = Ej3.ai(matrix3,vector);

        for (int i=0; i<result1.length;i++){
            //System.out.println(result1[i]);
        }

        int[] result2 = Ej3.bi(matrix3,vector);

        for (int i=0; i<result2.length;i++){
            System.out.println(result2[i]);
        }

        */
    /*
        double[][] matrix3 = new double[3][3];

        matrix3[0][0]=1;
        matrix3[1][0]=0;
        matrix3[0][1]=0;
        matrix3[1][1]=4;
        matrix3[0][2]=0;
        matrix3[1][2]=0;
        matrix3[2][1]=0;
        matrix3[2][2]=8;
        matrix3[2][0]=0;

        double[] result2 = Ej3.exerciseDI(matrix3,0,0,vector);

        for (int i=0; i<result2.length;i++){
            System.out.println(result2[i]);
        }
    }
    */

    public static void testEx3(){
        double[][] matrixA = new double[3][3];
        matrixA[0][0]=1;
        matrixA[0][1]=2;
        matrixA[0][2]=3;
        matrixA[1][0]=4;
        matrixA[1][1]=5;
        matrixA[1][2]=6;
        matrixA[2][0]=0;
        matrixA[2][1]=7;
        matrixA[2][2]=8;
        Ej3 ej = new Ej3();
        Calc calc = new Calc();

        ej.exerciseBII(matrixA, matrixA, calc);
    }
}
