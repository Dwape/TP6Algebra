/**
 * Created by Gianni on 5/20/2017.
 */
public class Main {
    public static void main(String[] args) {
        testEx1();
        testEx2();
        testEx3A();
        testEx3B();
        testEx3C();
        testEx3D();
        testEx3E();
        testEx4();
    }


    private static void testEx1(){
        double[][] matrix1 = new double[2][2];
        matrix1[0][0] = 1;
        matrix1[0][1] = 2;
        matrix1[1][0] = 0;
        matrix1[1][1] = 3;

        double[][] matrix2 = new double[2][1];
        matrix2[0][0] = 4;
        matrix2[1][0] = 5;

        Ej1 ej1 = new Ej1();

        System.out.println(ej1.exerciseA(matrix1,new Calc()));//Ex A
        System.out.println(ej1.exerciseB(matrix1,new Calc()));//Ex B
        double[] excCResult = ej1.exerciseC(matrix1,new Calc());//Ex C
        for (int i=0;i<excCResult.length;i++){
            System.out.println(excCResult[0]);
        }
        System.out.println("");
        double[] vector = {1,2,3};
        double[][] matrix = new double[2][3];

        matrix[0][0]=1;
        matrix[1][0]=2;
        matrix[0][1]=3;
        matrix[1][1]=4;
        matrix[0][2]=5;
        matrix[1][2]=6;

        double[] result = ej1.exerciseD(matrix,vector,new Calc());//Ex D

        for (int i=0; i<result.length;i++){
            System.out.println(result[i]);
        }
        System.out.println("");
        double[][] matrix4 = new double[2][2];

        matrix4[0][0]=1;
        matrix4[1][0]=0;
        matrix4[0][1]=0;
        matrix4[1][1]=4;

        double[][] result2 = ej1.exerciseE(matrix1, matrix4,new Calc());//Ex E
        for (int i=0; i<result2[0].length;i++){
            for (int j=0; j<result2.length;j++){
                System.out.println(result2[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
        double[][] matrix3 = ej1.exerciseF(matrix1, matrix2,new Calc());//Ex F
        System.out.println(matrix3[0][0]);
        System.out.println(matrix3[1][0]);
        System.out.println("");
        double[][] matrixTransposed = ej1.exerciseG(matrix2,new Calc());//Ex G

        System.out.println(matrixTransposed[0][0]);
        System.out.println(matrixTransposed[0][1]);
        System.out.println("");
        double[][] matrixTransposed2 = ej1.exerciseG(matrix1,new Calc());//Ex G

        System.out.println(matrixTransposed2[0][0]);
        System.out.println(matrixTransposed2[0][1]);
        System.out.println(matrixTransposed2[1][0]);
        System.out.println(matrixTransposed2[1][1]);
        System.out.println("");
    }

    private static void testEx2(){
        Ej2 ej2 = new Ej2();

        double[][] matrix1 = new double[3][3];

        matrix1[0][0]=1;
        matrix1[1][0]=2;
        matrix1[0][1]=3;
        matrix1[1][1]=4;
        matrix1[0][2]=5;
        matrix1[1][2]=6;
        matrix1[2][1]=7;
        matrix1[2][2]=8;
        matrix1[2][0]=9;
        System.out.println(ej2.exerciseA(matrix1,new Calc()));
        System.out.println("");
        double[][] matrix2 = new double[3][3];

        matrix2[0][0]=1;
        matrix2[1][0]=2;
        matrix2[0][1]=2;
        matrix2[1][1]=4;
        matrix2[0][2]=5;
        matrix2[1][2]=6;
        matrix2[2][1]=6;
        matrix2[2][2]=8;
        matrix2[2][0]=5;
        System.out.println(ej2.exerciseA(matrix2,new Calc()));
        System.out.println("");
        double[][] matrix3 = new double[2][2];
        matrix3[0][0] = 1;
        matrix3[0][1] = 2;
        matrix3[1][0] = 0;
        matrix3[1][1] = 3;

        System.out.println(ej2.exerciseB(matrix3,new Calc()));
        System.out.println("");
    }

    private static void testEx3A(){

        Ej3 ej3 = new Ej3();

        double[] vector = {1,2,3};
        double[][] matrix1 = new double[3][3];

        matrix1[0][0]=1;
        matrix1[1][0]=0;
        matrix1[0][1]=2;
        matrix1[1][1]=4;
        matrix1[0][2]=5;
        matrix1[1][2]=6;
        matrix1[2][1]=0;
        matrix1[2][2]=8;
        matrix1[2][0]=0;

        double[] result1 = ej3.exerciseAI(matrix1,vector,new Calc());

        for (int i=0; i<result1.length;i++){
            System.out.println(result1[i]);
        }
        System.out.println("");
        double[][] matrix2 = new double[3][3];

        matrix2[0][0]=2;
        matrix2[1][0]=0;
        matrix2[0][1]=-2;
        matrix2[1][1]=6;
        matrix2[0][2]=-7;
        matrix2[1][2]=1;
        matrix2[2][1]=0;
        matrix2[2][2]=3;
        matrix2[2][0]=0;


        double[][] result2 = ej3.exerciseAII(matrix1, matrix2,new Calc());

        for (int i=0; i<result2[0].length;i++){
            for (int j=0; j<result2.length;j++){
                System.out.print(result2[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
        double[][] result3 = ej3.exerciseAIII(matrix1, matrix2,new Calc());

        for (int i=0; i<result3[0].length;i++){
            for (int j=0; j<result3.length;j++){
                System.out.print(result3[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    private static void testEx3B(){
        Ej3 ej3 = new Ej3();
        double[] vector = {1,2,3};
        double[][] matrix1 = new double[3][3];

        matrix1[0][0]=1;
        matrix1[1][0]=4;
        matrix1[0][1]=2;
        matrix1[1][1]=4;
        matrix1[0][2]=5;
        matrix1[1][2]=6;
        matrix1[2][1]=7;
        matrix1[2][2]=8;
        matrix1[2][0]=0;

        double[][] matrix2 = new double[3][3];
        matrix2[0][0]=1;
        matrix2[0][1]=2;
        matrix2[0][2]=3;
        matrix2[1][0]=4;
        matrix2[1][1]=5;
        matrix2[1][2]=6;
        matrix2[2][0]=0;
        matrix2[2][1]=7;
        matrix2[2][2]=8;


        double[] result1 = ej3.exerciseBI(matrix1,vector,new Calc());

        for (int i=0; i<result1.length;i++){
            System.out.println(result1[i]);
        }
        System.out.println("");

        double[][] result2 = ej3.exerciseBII(matrix1, matrix2, new Calc());

        for (int i=0; i<result2[0].length;i++){
            for (int j=0; j<result2.length;j++) {
                System.out.print(result2[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("");

        double[][] result3 = ej3.exerciseBIII(matrix1, matrix2, new Calc());

        for (int i=0; i<result3[0].length;i++){
            for (int j=0; j<result3.length;j++){
                System.out.print(result3[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    private static void testEx3C(){
        Ej3 ej3 = new Ej3();
        double[] vector = {1,2,3,4};
        double[][] matrix1 = new double[4][4];
        matrix1[0][0]=1;
        matrix1[0][1]=4;
        matrix1[0][2]=0;
        matrix1[0][3]=0;
        matrix1[1][0]=3;
        matrix1[1][1]=4;
        matrix1[1][2]=1;
        matrix1[1][3]=0;
        matrix1[2][0]=0;
        matrix1[2][1]=2;
        matrix1[2][2]=3;
        matrix1[2][3]=4;
        matrix1[3][0]=0;
        matrix1[3][1]=0;
        matrix1[3][2]=1;
        matrix1[3][3]=3;

        double[][] matrix2 = new double[4][4];
        matrix2[0][0]=1;
        matrix2[0][1]=7;
        matrix2[0][2]=0;
        matrix2[0][3]=0;
        matrix2[1][0]=1;
        matrix2[1][1]=4;
        matrix2[1][2]=1;
        matrix2[1][3]=0;
        matrix2[2][0]=0;
        matrix2[2][1]=-1;
        matrix2[2][2]=3;
        matrix2[2][3]=9;
        matrix2[3][0]=0;
        matrix2[3][1]=0;
        matrix2[3][2]=1;
        matrix2[3][3]=5;

        double[] result1 = ej3.exerciseCI(matrix1,vector,new Calc());

        for (int i=0; i<result1.length;i++){
            System.out.println(result1[i]);
        }
        System.out.println("");

        double[][] result2 = ej3.exerciseCII(matrix1,matrix2,new Calc());

        for (int i=0; i<result2[0].length;i++){
            for (int j=0; j<result2.length;j++){
                System.out.print(result2[i][j]+"\t");
            }
            System.out.println("");
        }

        System.out.println("");

        double[][] result3 = ej3.exerciseCIII(matrix1,matrix2,new Calc());

        for (int i=0; i<result3[0].length;i++){
            for (int j=0; j<result3.length;j++){
                System.out.print(result3[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    private static void testEx3D(){
        Ej3 ej3 = new Ej3();
        double[][] matrix3 = new double[3][3];
        double[] vector = {1,2,3};

        matrix3[0][0]=1;
        matrix3[1][0]=0;
        matrix3[0][1]=0;
        matrix3[1][1]=4;
        matrix3[0][2]=0;
        matrix3[1][2]=0;
        matrix3[2][1]=0;
        matrix3[2][2]=8;
        matrix3[2][0]=0;

        double[][] matrixB = new double[3][3];
        matrixB[0][0]=1;
        matrixB[0][1]=2;
        matrixB[0][2]=0;
        matrixB[1][0]=4;
        matrixB[1][1]=5;
        matrixB[1][2]=6;
        matrixB[2][0]=0;
        matrixB[2][1]=7;
        matrixB[2][2]=8;

        double[][] matrixC = new double[3][3];
        matrixC[0][0]=1;
        matrixC[0][1]=2;
        matrixC[0][2]=0;
        matrixC[1][0]=0;
        matrixC[1][1]=5;
        matrixC[1][2]=4;
        matrixC[2][0]=0;
        matrixC[2][1]=0;
        matrixC[2][2]=8;

        double[] result1 = ej3.exerciseDI(matrix3,0,0,vector,new Calc());

        for (int i=0; i<result1.length;i++){
            System.out.println(result1[i]);
        }
        System.out.println("");

        double[] result2 = ej3.exerciseDI(matrixB,1,1,vector,new Calc());

        for (int i=0; i<result2.length;i++){
            System.out.println(result2[i]);
        }

        System.out.println("");

        double[][] result3 = ej3.exerciseDII(matrixB, 1, 1, matrixC, 0, 1, new Calc());

        for (int i=0; i<result3[0].length;i++){
            for (int j=0; j<result3.length;j++){
                System.out.print(result3[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("");

        double[][] result4 = ej3.exerciseDIII(matrixB, 1, 1, matrixC, 0, 1, new Calc());

        for (int i=0; i<result4[0].length;i++){
            for (int j=0; j<result4.length;j++){
                System.out.print(result4[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    private static void testEx3E(){
        Ej3 ej = new Ej3();
        Calc calc = new Calc();

        double[][] matrixB = new double[3][3];
        matrixB[0][0]=1;
        matrixB[0][1]=0;
        matrixB[0][2]=0;
        matrixB[1][0]=4;
        matrixB[1][1]=5;
        matrixB[1][2]=0;
        matrixB[2][0]=2;
        matrixB[2][1]=7;
        matrixB[2][2]=8;

        double[][] matrixC = new double[3][3];
        matrixC[0][0]=1;
        matrixC[0][1]=2;
        matrixC[0][2]=3;
        matrixC[1][0]=0;
        matrixC[1][1]=5;
        matrixC[1][2]=4;
        matrixC[2][0]=0;
        matrixC[2][1]=0;
        matrixC[2][2]=8;

        ej.exerciseE(matrixB, matrixC, calc);
        System.out.println("");
    }

    private static void testEx4(){
        Ej4 ej4 = new Ej4();

        double[][] matrixA = new double[3][3];//not used
        matrixA[0][0]=1;
        matrixA[0][1]=7;
        matrixA[0][2]=-2;
        matrixA[1][0]=0;
        matrixA[1][1]=-3;
        matrixA[1][2]=4;
        matrixA[2][0]=0;
        matrixA[2][1]=0;
        matrixA[2][2]=2;

        double[] matrixA1 = {1,7,-2,-3,4,2};

        double[][] matrixB = new double[3][3];//not used
        matrixB[0][0]=2;
        matrixB[0][1]=1;
        matrixB[0][2]=7;
        matrixB[1][0]=0;
        matrixB[1][1]=4;
        matrixB[1][2]=-5;
        matrixB[2][0]=0;
        matrixB[2][1]=0;
        matrixB[2][2]=9;

        double[] matrixB1 = {2,1,7,4,-5,-9};

        double[][] result = ej4.summation(matrixA1,matrixB1,new Calc());
        for (int i=0;i<result.length;i++){
            for (int j=0;j<result.length;j++){
                System.out.print(result[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
