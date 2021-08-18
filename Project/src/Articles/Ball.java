package Articles;

public class Ball {
    private String maker;
    private double size, weight;

    public Ball(String maker, double size, double weight) {
        this.maker = maker;
        this.size = size;
        this.weight = weight;
    }

    public String getMaker() {
        return maker;
    }

    public double getSize() {
        return size;
    }

    public double getWeight() {
        return weight;
    }
}
