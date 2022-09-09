public class task7 {

    static int[] ShellSort(int[] array) {
        int i = 0;
        int temp;
        while (i < array.length - 1) {
            if (array[i] <= array[i + 1]) {
                i++;
            } else {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                i = i == 0 ? 0 : i - 1;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        //int[] array = input();
        int[] array = {2, 8, 10, 1, 15, 4, 9};
        array = ShellSort(array);
        for (int i : array)
            System.out.print(i + " ");
    }

}
