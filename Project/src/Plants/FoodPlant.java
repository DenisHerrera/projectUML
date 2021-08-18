package Plants;

public class FoodPlant extends Plant{
    private String harvested;

    public FoodPlant(String name) {
        super(name);
    }
    public void canBeHarvested(String season){
        if(season == "summer") {
            harvested = "Can be harvested";
        }else{
            harvested = "Can not  be harvested";
        }
    }
    public String getHarvested() {
        return harvested;
    }
}
