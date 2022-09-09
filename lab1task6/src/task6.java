import java.util.Scanner;

//дан массив а1,а2,...,an
//получить матрицу
//а1,а2,...,an
//а2,...,an,a1
//   ....
//an,a1,a2,...an-1

public class task6 {

    static int[] input() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int amount = scan.nextInt();
        int[] array = new int[amount];
        for (int i = 0; i < amount; i++) {
            System.out.print((i+1) + " : ");
            array[i] = scan.nextInt();
        }
        scan.close();
        return array;
    }

    static int[][] receiveMatrix(int[] array) {
        int[][] matrix = new int[array.length][array.length];
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                temp = (i + j) % array.length;
                matrix[i][j] = array[temp];
            }
        }

        return matrix;
    }

    static void outputMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++)
                System.out.printf("%d\t", matrix[i][j]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //int[] array = input();
        int[] array = {2, 8, 10, 1, 15, 4, 9};
        int[][] matrix = receiveMatrix(array);
        outputMatrix(matrix);
    }

}
