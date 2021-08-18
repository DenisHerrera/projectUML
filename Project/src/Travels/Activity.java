package Travels;

public class Activity {
    private final int idActivity;
    private String name;
    private double price;
    private static int activityCounter;

    private Activity() {
        this.idActivity = ++Activity.activityCounter;
    }

    public Activity(String name, double price) {
        this();
        this.name = name;
        this.price = price;

    }

    public int getIdActivity() {
        return this.idActivity;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
}
