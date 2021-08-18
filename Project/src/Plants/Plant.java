package Plants;

public class Plant {
    private String name;
    private boolean water;

    public Plant(String name) {
        this.name = name;
        needWater();
    }

    public String getName() {
        return name;
    }

    public void needWater(){
        int index = (int)(Math.random()*2+1);
        switch (index){
            case 1: water = true; break;
            case 2: water = false; break;
        }
    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }
}
