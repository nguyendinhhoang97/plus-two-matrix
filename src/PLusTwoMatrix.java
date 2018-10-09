import java.util.Scanner;

public class PLusTwoMatrix {
    public static void main(String[] args) {
        int[][] matrix1;
        int[][] matrix2;
        int[][] matrix3;
        int max;
        int row;
        int column;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers row");
        row = scanner.nextInt();
        System.out.println("Enter numbers column");
        column = scanner.nextInt();
        matrix1 = new int[row][column];
        matrix2 = new int[row][column];
        matrix3 = new int[row][column];
        System.out.println("Enter element of matrix 1:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter element of matrix 2:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Total of 2 matrix is ");
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < column ; j++) {
                System.out.print(matrix3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
