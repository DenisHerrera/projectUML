package Plants;

public class FruitPlant extends Plant{
    String harvested;

    public FruitPlant(String name ){
        super(name);
    }

    public String canPrune(String season ) {
        if ("autumn".equals(season) ) {
            return season = "Can Prunning be done: YES :)";
        } else {
            return season = "Can prunning be done: NO :(";
        }
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
