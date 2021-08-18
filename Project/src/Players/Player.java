package Players;

public class Player extends Person {

    private String position;

    public Player(String name, double weight, double height) {
        super(name, weight, height);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
