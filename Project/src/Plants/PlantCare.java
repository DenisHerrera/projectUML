package Plants;

import java.util.ArrayList;

public class PlantCare {
    private ArrayList<FruitPlant> fruitPlants;
    private ArrayList <FoodPlant> foodPlants;
    private ArrayList <OrnamentalPlant> ornamentalPlants;
    String season;
    boolean water;
    int cantDay = 0;

    public PlantCare(  ) {
        changeSeason();
        fruitPlants = new ArrayList<FruitPlant>();
        foodPlants = new ArrayList<FoodPlant>();
        ornamentalPlants = new ArrayList<OrnamentalPlant>();
        addOrnamentalPlant();
        addFoodPlant();
        addFruitPlant();
    }

    private void addFruitPlant(){
        fruitPlants.add(new FruitPlant("peach"));
        fruitPlants.add(new FruitPlant("apple"));
        fruitPlants.add(new FruitPlant("pineapple"));
        fruitPlants.add(new FruitPlant("avocado"));
        fruitPlants.add(new FruitPlant("orange"));
    }

    private void addFoodPlant(){
        foodPlants.add(new FoodPlant("onion"));
        foodPlants.add(new FoodPlant("carrot"));
        foodPlants.add(new FoodPlant("tomate"));
        foodPlants.add(new FoodPlant("celery"));
        foodPlants.add(new FoodPlant("potato"));
    }

    private void addOrnamentalPlant(){
        ornamentalPlants.add(new OrnamentalPlant("dollar"));
        ornamentalPlants.add(new OrnamentalPlant("Adam rib"));
        ornamentalPlants.add(new OrnamentalPlant("ferns"));
        ornamentalPlants.add(new OrnamentalPlant("Brazil trunk"));
        ornamentalPlants.add(new OrnamentalPlant("bromeliad"));
    }

    public ArrayList<FoodPlant> getFoodPlants() {
        return foodPlants;
    }

    public ArrayList<FruitPlant> getFruitPlants() {
        return fruitPlants;
    }

    public ArrayList<OrnamentalPlant> getOrnamentalPlants() {
        return ornamentalPlants;
    }

    public void sownFruitPlant(FruitPlant fruitPlant){
        fruitPlants.add(fruitPlant);
    }

    public void sownFoodPlant(FoodPlant foodPlant){
        foodPlants.add(foodPlant);
    }

    public void sownOrnamentalPlant(OrnamentalPlant ornamentalPlant){
        ornamentalPlants.add(ornamentalPlant);
    }

    private void changeSeason() {
        int index = (int) (Math.random() * 4 + 1);
        switch (index) {
            case 1:
                season = "spring";
                break;
            case 2:
                season = "summer";
                break;
            case 3:
                season = "autumn";
                break;
            case 4:
                season = "winter";
                break;
        }
    }
    public String getSeason() {
        return season;
    }
}
