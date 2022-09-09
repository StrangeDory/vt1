import java.util.Scanner;

public class task9 {

    public static void checkWeightColor(Basket basket) {
        double weight = 0;
        int countBlue = 0;
        for(int i = 0; i < basket.getCount(); i++) {
            weight += basket.getByIndex(i).getWeight();
            String color = basket.getByIndex(i).getColor().toLowerCase();
            countBlue += (color.equals("blue")) ? 1 : 0;
        }
        System.out.println("Вес мячей в корзине: " + weight);
        System.out.println("Количество синих мячей: " + countBlue);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Basket basket = new Basket();
        do{
            System.out.print("Введите вес мяча: ");
            double weight = scan.nextDouble();
            System.out.print("Введите цвет мяча: ");
            String color = scan.next();
            basket.add(color, weight);
            System.out.print("Хотите добавить мяч? y/n ");
        }while (scan.next().charAt(0) == 'y');
        checkWeightColor(basket);
        scan.close();
    }
}
