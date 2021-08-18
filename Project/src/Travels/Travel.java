package Travels;

import java.util.ArrayList;

public class Travel {
    private final int idTravel;
    private Activity[] activities;
    private Hotel[] hotels;
    private int stayDays;
    private static int travelCounter;
    private ArrayList<Activity> selectedActivities;

    public Travel(){
        this.idTravel = ++Travel.travelCounter;
        activities = new Activity[10];
        setActivities();
        selectedActivities = new ArrayList<Activity>();
        setHotel();
    }

    public void addActivities(Activity activities){
        selectedActivities.add(activities);
    }

    public ArrayList getSelectedActivities(){
        return selectedActivities;
    }

    public void setActivities(){
        activities[0] = new Activity("Trecking", 50.0);
        activities[1] = new Activity("Kayak", 80.0);
        activities[2] = new Activity("Rappel", 60.0);
        activities[3] = new Activity("Horse ride", 50.0);
        activities[4] = new Activity("City Tour", 70.0);
        activities[5] = new Activity("Helicopter Tour", 200.0);
        activities[6] = new Activity("paragliding", 150.0);
        activities[7] = new Activity("Museum Visit", 100.0);
        activities[8] = new Activity("Thematic Parks Visit", 120.0);
        activities[9] = new Activity("Church Visit", 50.0);

    }

    public Activity[] getActivities(){
        return activities;
    }

    public double totalPrice(){
        double total =0;
        for (int i =0; i< selectedActivities.size();i++){
            total += selectedActivities.get(i).getPrice();
        }
        return total;
    }

    public void setHotel(){
        hotels = new Hotel [5];
        hotels[0] = new Hotel("Radisson Hotel", 600.0 );
        hotels[1] = new Hotel("HardRock Hotel", 800.0 );
        hotels[2] = new Hotel("Nayara Hotel", 500.0 );
        hotels[3] = new Hotel("Amazing Hotel", 300.0 );
        hotels[4] = new Hotel("Super Hotel", 400.0 );

    }

    public Hotel[] getHotel(){
        return hotels;
    }

    public int getStayDays() {
        return stayDays;
    }

    public void setStayDays(int stayDays) {
        this.stayDays = stayDays;
    }
}
