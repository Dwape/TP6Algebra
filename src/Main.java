/**
 * Created by Dwape on 5/9/17.
 */
public class Main {

    public static void main(String[] args) {

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
    }
}
