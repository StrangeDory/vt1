import java.util.Scanner;

//в массиве выкинуть min кол-во элементов, чтобы получилась возрастающая последовательность

public class task5 {

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

    static int findCountMaxSubseq(int[] array) {
        if (array.length == 1)
            return 1;
        int[] additionalArr = new int[array.length];
        for (int i = 0; i < additionalArr.length; i++)
            additionalArr[i] = 1;
        for (int j = 1; j < array.length; j++) {
            for (int k = 0; k < j; k++) {
                if (array[j] > array[k]) {
                    if (additionalArr[j] <= additionalArr[k]) {
                        additionalArr[j] = additionalArr[k] + 1;
                    }
                }
            }
        }
        int maxValue = 0;
        for (int i : additionalArr) {
            if (i > maxValue)
                maxValue = i;
        }

        return maxValue;
    }

    public static void main(String[] args) {
        //int[] array = input();
        int[] array = {2, 8, 10, 1, 15, 4, 9};
        int maxSubsequence = findCountMaxSubseq(array);
        int canRemove = array.length - maxSubsequence;
        System.out.println("Можем убрать " + canRemove + " элементов");
    }
}
