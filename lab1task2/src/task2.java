import java.util.Scanner;

// координатная плоскость
//        |
//    aaaa|aaaa
//    aaaa|aaaa
//    aaaa|aaaa
//    aaaa|aaaa
//    aaaa|aaaa
//--------|-----------
//  aaaaaa|aaaaaa
//  aaaaaa|aaaaaa
//  aaaaaa|aaaaaa
//        |

public class task2 {

    static boolean isInsideBounds(int x, int y) {
        boolean result = false;
        if (((y > 0) && (x > -5 && x < 5)) || ((y < 0) && (x > -7 && x < 7)))
            result = true;
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите координату x: ");
        int x = scan.nextInt();
        System.out.print("Введите координату y: ");
        int y = scan.nextInt();
        boolean isInside = isInsideBounds(x, y);
        System.out.println(isInside);
        scan.close();
    }
}
