package task1;

import java.util.Scanner;

// (1 + sin^2(x+y))/(2 + |x - 2x/(1+x^2y^2)|) + x

public class task1 {

    static double calculate(double x, double y) {
        double sin = Math.sin(x + y);
        double numerator = 1 + sin * sin;
        double num = x - (2 * x - (1 + x*x * y*y));
        double denominator = 2 + Math.abs(num);
        double result = numerator / denominator + x;
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите x: ");
        double x = scan.nextDouble();
        System.out.print("Введите y: ");
        double y = scan.nextDouble();
        double result = calculate(x, y);
        System.out.printf("Результат: %.5f", result);
        scan.close();
    }
}
