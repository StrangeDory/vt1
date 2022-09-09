import java.util.Scanner;

//F(x)=tg(x) с шагом h

public class task3 {

    static void calculateFunction(int a, int b, double h) {
        double current = a;
        System.out.printf("%5cx%5c|%4cF(x)%3c\n", ' ', ' ', ' ', ' ');
        double result = 0;
        do {
            result = Math.tan(current);
            System.out.printf("%11f|%11.5f\n", current, result);
            current += h;
        } while (current <= b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите начало отрезка: ");
        int start = scan.nextInt();
        System.out.print("Введите конец отрезка: ");
        int end = scan.nextInt();
        if (start > end) {
            System.out.println("Начало отрезка не может быть больше конца!");
            return;
        }
        System.out.print("Введите шаг: ");
        double h = scan.nextDouble();
        calculateFunction(start, end, h);
        scan.close();
    }
}
