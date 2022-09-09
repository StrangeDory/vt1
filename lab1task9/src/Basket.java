import java.util.ArrayList;

public class Basket {

    private ArrayList<Ball> Balls;

    public Basket() {
        Balls = new ArrayList<>();
    }

    public ArrayList<Ball> getBalls() {
        return Balls;
    }

    public int getCount() { return Balls.size(); }

    public Ball getByIndex(int index) { return Balls.get(index); }

    public void add(String color, double weight) {
        Ball ball = new Ball(color, weight);
        Balls.add(ball);
    }
}
