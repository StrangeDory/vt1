import java.util.Scanner;

//простые числа в массиве

public class task4 {

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

    static boolean isTheNumberSimple(int n)
    {
        if (n < 2)
            return false;

        if (n == 2)
            return true;

        for (int i = 2; i < n / 2 + 1; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    static void findSimple(int[] array) {
        System.out.println("Простые числа:");
        boolean isAnySimple = false;
        for (int i = 0; i < array.length; i++) {
            if(isTheNumberSimple(array[i])) {
                System.out.println((i + 1) + " : " + array[i]);
                isAnySimple = true;
            }
        }
        if (!isAnySimple)
            System.out.println("В массиве нет простых чисел!");
    }

    public static void main(String[] args) {
        int[] array = input();
        findSimple(array);
    }
}
