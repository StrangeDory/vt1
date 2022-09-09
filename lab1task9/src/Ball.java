public class Ball {

    private String color;
    private double weight;

    public Ball(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return this.color;
    }

    public double getWeight() {
        return this.weight;
    }
}
