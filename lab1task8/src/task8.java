import java.util.ArrayList;

public class task8 {

    static ArrayList<Integer> combineArrays(int[] array1, int[] array2) {
        ArrayList<Integer> combination = new ArrayList<Integer>();
        for (int i : array1)
            combination.add(i);
        int j = 0;
        for (int i = 0; i < array2.length; i++) {
            if(j < combination.size()) {
                if (array2[i] < combination.get(j)) {
                    combination.add(j, array2[i]);
                } else {
                    i--;
                    j++;
                }
            } else {
                combination.add(j, array2[i]);
                j++;
            }
        }
        return combination;
    }

    public static void main(String[] args) {
        //int[] array = input();
        int[] array1 = {-1, 2, 4, 8, 9, 10, 15};
        int[] array2 = {0, 7, 16, 25};
        ArrayList<Integer> combination = combineArrays(array1, array2);
        for(int i : combination)
            System.out.print(i + " ");
    }
}
