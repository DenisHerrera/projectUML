package Articles;

public class SportsField {
    private String name, location, characteristic;

    public SportsField(String name, String location, String characteristic) {
        this.name = name;
        this.location = location;
        this.characteristic = characteristic;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getCharacteristic() {
        return characteristic;
    }
}
