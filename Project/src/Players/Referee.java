package Players;

public class Referee extends Person {

    private String typeOfReferee;

    public Referee(String name, double weight, double height) {

        super(name, weight, height);
    }

    public String getTypeOfReferee() {
        return typeOfReferee;
    }

    public void setTypeOfReferee(String typeOfReferee) {
        this.typeOfReferee = typeOfReferee;
    }
}
