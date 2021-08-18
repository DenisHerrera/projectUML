import ListenMusic.Mp3Music;
import ListenMusic.Music;
import Plants.FoodPlant;
import Plants.FruitPlant;
import Plants.OrnamentalPlant;
import Plants.PlantCare;
import Sports.Basketball;
import Sports.Soccer;
import Sports.Tennis;
import Travels.Activity;
import Travels.Hotel;
import Travels.Travel;

import java.util.Scanner;

public class Hobbie {
    private Scanner sc;
    private Mp3Music wallkman ;
    private Travel travel;
    private int selectedHotel;
    private PlantCare plantCare;

    public Hobbie() {
        sc = new Scanner(System.in);
        wallkman = new Mp3Music();
        plantCare = new PlantCare();
        travel = new Travel();
        selectedHotel = -1;
        viewMenu();

    }

    private void viewMenu(){
        System.out.println("---------------------------------------------");
        System.out.println("Wellcome to the hobbies");
        System.out.println("What do you want to do?");
        System.out.println("---------------------------------------------");
        System.out.println("1: Listen to music");
        System.out.println("2: Sport");
        System.out.println("3: Travel");
        System.out.println("4: Gardening");
        System.out.println("5: Exit");
        chooseHobbit(sc.nextInt());
    }

    private void chooseHobbit(int index){
        switch (index){
            case 1 :
                listenMusic();
                break;
            case 2 :
                sports();
                break;
            case 3 :
                travels();
                break;
            case 4 :
                plantCare();
                break;
            case 5 :
                System.exit(0);
        }
    }

    //Care Plant

    private void plantCare(){
        System.out.println("---------------------------------------------");
        System.out.println("Wellcome to the plant care section!!");
        System.out.println("---------------------------------------------");
        System.out.println("1: View plants");
        System.out.println("2: Sow a plant");
        System.out.println("3: Water plants");
        System.out.println("4: Pruning and harvest plant");
        System.out.println("5: back");
        evaluationPlantCare(sc.nextInt());
    }

    public void evaluationPlantCare(int index){
        switch (index){
            case 1:
                viewPlants();
                break;
            case 2:
                viewSowPlant();
                break;
            case 3:
                waterPlant();
                break;
            case 4:
                pruningAndHarvest();
                break;
            case 5:
                viewMenu();
        }
    }

    private void pruningAndHarvest(){
        switch (plantCare.getSeason()){
            case "spring" :
                System.out.println("---------------------------------------------");
                System.out.println("SPRINT");
                System.out.println("---------------------------------------------");
                plantCare();
                break;

            case "summer":
                System.out.println("---------------------------------------------");
                System.out.println("SUMMER");
                System.out.println("---------------------------------------------");
                for(int i =0 ; i<plantCare.getFruitPlants().size(); i++){
                    FruitPlant fruits = (FruitPlant)plantCare.getFruitPlants().get(i);
                    fruits.canBeHarvested(plantCare.getSeason());
                    System.out.println(fruits.getName()+" :"+fruits.getHarvested());
                }
                for(int i =0 ; i<plantCare.getFoodPlants().size(); i++){
                    FoodPlant foods = (FoodPlant) plantCare.getFoodPlants().get(i);
                    foods.canBeHarvested(plantCare.getSeason());
                    System.out.println(foods.getName()+" :"+foods.getHarvested());
                }
                plantCare();
                break;

            case "autumn" :
                System.out.println("---------------------------------------------");
                System.out.println("AUTUMN");
                System.out.println("---------------------------------------------");
                for(int i =0 ; i<plantCare.getFruitPlants().size(); i++){
                    FruitPlant fruits = (FruitPlant)plantCare.getFruitPlants().get(i);
                    System.out.println(fruits.getName()+": "+fruits.canPrune(plantCare.getSeason()));
                }
                plantCare();
                break;

            case "winter":
                System.out.println("---------------------------------------------");
                System.out.println("WINTER");
                System.out.println("---------------------------------------------");
                plantCare();
                break;
        }
    }

    private void waterPlant(){
        System.out.println("---------------------------------------------");
        System.out.println("Plants that need water");
        System.out.println("---------------------------------------------");
        for(int i =0 ; i<plantCare.getFruitPlants().size(); i++){
            if(plantCare.getFruitPlants().get(i).isWater()== true){
                System.out.println(plantCare.getFruitPlants().get(i).getName()+" -> I need water");
            }else{
                System.out.println(plantCare.getFruitPlants().get(i).getName()+" -> I don't need water");
            }
        }
        for(int i =0 ; i<plantCare.getFoodPlants().size(); i++){
            if(plantCare.getFoodPlants().get(i).isWater()== true){
                System.out.println(plantCare.getFoodPlants().get(i).getName()+" -> I need water");
            }else{
                System.out.println(plantCare.getFoodPlants().get(i).getName()+" -> I don't need water");
            }

        }
        for(int i =0 ; i<plantCare.getOrnamentalPlants().size(); i++){
            if(plantCare.getOrnamentalPlants().get(i).isWater()== true){
                System.out.println(plantCare.getOrnamentalPlants().get(i).getName()+" -> I need water");
            }else{
                System.out.println(plantCare.getOrnamentalPlants().get(i).getName()+" -> I don't need water");
            }

        }
        System.out.println("---------------------------------------------");
        System.out.println("1: Water plants");
        System.out.println("2: Back" );
        switch (sc.nextInt()){
            case 1: waterPlantTheyNeed(); break;
            case 2: plantCare();
        }

    }

    private void waterPlantTheyNeed(){

        for(int i =0 ; i<plantCare.getFruitPlants().size(); i++){
            if(plantCare.getFruitPlants().get(i).isWater()== true){
                plantCare.getFruitPlants().get(i).setWater(false);
            }
        }
        for(int i =0 ; i<plantCare.getFoodPlants().size(); i++){
            if(plantCare.getFoodPlants().get(i).isWater()== true){
                plantCare.getFoodPlants().get(i).setWater(false);
            }
        }
        for(int i =0 ; i<plantCare.getOrnamentalPlants().size(); i++){
            if(plantCare.getOrnamentalPlants().get(i).isWater()== true){
                plantCare.getOrnamentalPlants().get(i).setWater(false);
            }
        }
        waterPlant();
    }

    private void viewSowPlant(){
        System.out.println("What type of plant will sow");
        System.out.println("1: Fruit plant");
        System.out.println("2: Food plant");
        System.out.println("3: Ornamental plant");
        sowPlant(sc.nextInt());
    }

    private void sowPlant(int index){
        switch (index){
            case 1:
                sc.nextLine();
                System.out.println("Enter plant's name");
                plantCare.sownFruitPlant(new FruitPlant(sc.nextLine()));
                plantCare();
                break;
            case 2:
                sc.nextLine();
                System.out.println("Enter plant's name");
                plantCare.sownFoodPlant(new FoodPlant(sc.nextLine()));
                plantCare();
                break;
            case 3: viewMenu();
                sc.nextLine();
                System.out.println("Enter plant's name");
                plantCare.sownOrnamentalPlant(new OrnamentalPlant(sc.nextLine()));
                plantCare();
        }
    }



    private void viewPlants(){
        System.out.println("---------------------------------------------");
        System.out.println("FRUIT PLANTS");
        System.out.println("---------------------------------------------");
        for(int i =0 ; i<plantCare.getFruitPlants().size(); i++){
            System.out.println(plantCare.getFruitPlants().get(i).getName());
        }
        System.out.println("---------------------------------------------");
        System.out.println("FOOD PLANTS");
        System.out.println("---------------------------------------------");
        for(int i =0 ; i<plantCare.getFoodPlants().size(); i++){
            System.out.println(plantCare.getFoodPlants().get(i).getName());
        }
        System.out.println("---------------------------------------------");
        System.out.println("ORNAMENTAL PLANTS");
        System.out.println("---------------------------------------------");
        for(int i =0 ; i<plantCare.getOrnamentalPlants().size(); i++){
            System.out.println(plantCare.getOrnamentalPlants().get(i).getName());
        }
        plantCare();
    }

    //TRAVEL

    private void travels(){
        System.out.println("---------------------------------------------");
        System.out.println("Wellcome to rthe travel section!!");
        System.out.println("---------------------------------------------");
        System.out.println("1: Plan trip");
        System.out.println("2: Travel details ");
        System.out.println("3: back");
        evaluationTravel(sc.nextInt());

    }

    private void evaluationTravel(int index){
        switch (index){
            case 1: viewHotel();
                selectHOtel();
                viewActivity();
                selectActivity();
                viewTotalPrice();
                travels();
                break;
            case 2: details();
                break;
            case 3: viewMenu();
        }
    }

    private void details(){
        System.out.println("---------------------------------------------");
        if(selectedHotel >= 0){
            Hotel hotelSelected = (Hotel)travel.getHotel()[selectedHotel];
            System.out.println("The selected hotel is: "+hotelSelected.getHotelName() + ", Price: " + hotelSelected.getRoomPrice());
            System.out.println("Stay days: "+travel.getStayDays());
            System.out.println("The selected activities are: ");
            viewSlectedActivities();
            viewTotalPrice();
            travels();
        }else{
            System.out.println("Select travel plan please");
            travels();
        }

    }

    private void viewSlectedActivities(){

        for(int i = 0; i < travel.getSelectedActivities().size(); i++){
            Activity var = (Activity)travel.getSelectedActivities().get(i);
            System.out.println(var.getName() +", Price is $ " + var.getPrice());
        }
    }

    private void viewActivity(){
        System.out.println("---------------------------------------------");
        System.out.println(" Activities that can be done in the Trip:");
        for (int i=0; i < travel.getActivities().length;i++){
            System.out.println(travel.getActivities()[i].getIdActivity()+": " + travel.getActivities()[i].getName() + ", Price: $ " + travel.getActivities()[i].getPrice());
        }
        System.out.println("11 : Back");
    }

    private void selectActivity(){
        System.out.println("---------------------------------------------");
        System.out.println("Select the activities to do in the trip: ");
        int index = sc.nextInt()-1;
        while(index != 10){
            Activity selectedActivity = travel.getActivities()[index];
            travel.addActivities(selectedActivity);
            System.out.println("Activity was added: "+selectedActivity.getName());
            index = sc.nextInt()-1;
        }

    }

    private void viewHotel(){
        System.out.println("---------------------------------------------");
        System.out.println("List of Hotels in the Destiny: ");
        for( int i = 0; i < travel.getHotel().length; i++){
            Hotel var = (Hotel)travel.getHotel()[i];
            System.out.println(i+1 + ": " +var.getHotelName() + " , Price: "+ var.getRoomPrice());
        }
    }

    private void selectHOtel(){
        System.out.println("---------------------------------------------");
        System.out.println("Select the Hotel to stay: ");
        selectedHotel = sc.nextInt()-1;
        Hotel var = (Hotel)travel.getHotel()[selectedHotel];
        System.out.println(var.getHotelName() +", Price: "+ var.getRoomPrice());
        System.out.println("---------------------------------------------");
        System.out.println("Enter the number of stay days at the Hotel");
        travel.setStayDays(sc.nextInt());
    }

    private void viewTotalPrice(){
        Hotel hotelSelected = (Hotel)travel.getHotel()[selectedHotel];
        double totalPrice = travel.getStayDays()* hotelSelected.getRoomPrice() + travel.totalPrice();
        System.out.println("---------------------------------------------");
        System.out.println("The Total Price of the Trip: $ "+ totalPrice);
    }

    //SPORTS

    private void sports(){
        System.out.println("---------------------------------------------");
        System.out.println("Wellcome to the sports section!!");
        System.out.println("What sport do you want to do?");
        System.out.println("---------------------------------------------");
        System.out.println("1: Football");
        System.out.println("2: Tennis");
        System.out.println("3: Basketball");
        System.out.println("4: Back");
        evaluationSport(sc.nextInt());
    }

    private void evaluationSport(int index){
        switch (index){
            case 1: playFootball(); break;
            case 2: playTennis(); break;
            case 3: playBasketball(); break;
            case 4: viewMenu();
        }
    }

    private void playFootball(){
        sc.nextLine();
        System.out.println("Enter the name of the first team");
        String nameteam1 = sc.nextLine();
        System.out.println("Enter the name of the second team");
        String nameteam2 = sc.nextLine();
        Soccer game1 = new Soccer(nameteam1, nameteam2);
        game1.game();

        System.out.println("------------------------------------");
        System.out.println("DETAILS");
        System.out.println("------------------------------------");
        for(int i = 0 ; i < game1.getGameDetails().size(); i++){
            System.out.println(game1.getGameDetails().get(i));
        }
        System.out.println("------------------------------------");
        System.out.println("GAME RESULTS");
        System.out.println("------------------------------------");
        System.out.println(game1.getTeam1().getTeamName()+" - "+game1.getTeam1().getPoint());
        System.out.println(game1.getTeam2().getTeamName()+" - "+game1.getTeam2().getPoint());
        System.out.println("------------------------------------");
        sports();
    }

    private void playTennis(){
        sc.nextLine();
        System.out.println("Enter the name of the first player");
        String nameteam1 = sc.nextLine();
        System.out.println("Enter the name of the second player");
        String nameteam2 = sc.nextLine();
        Tennis game1 = new Tennis(nameteam1, nameteam2);
        game1.game();

        System.out.println("------------------------------------");
        System.out.println("DETAILS");
        System.out.println("------------------------------------");
        for(int i = 0 ; i < game1.getGameDetails().size(); i++){
            System.out.println(game1.getGameDetails().get(i));
        }
        System.out.println("------------------------------------");
        System.out.println("GAME RESULTS");
        System.out.println("------------------------------------");
        System.out.println(game1.getTeam1().getTeamName()+" - "+game1.getTeam1().getPoint());
        System.out.println(game1.getTeam2().getTeamName()+" - "+game1.getTeam2().getPoint());
        System.out.println("------------------------------------");
        sports();
    }

    private void playBasketball(){
        sc.nextLine();
        System.out.println("Enter the name of the first team");
        String nameteam1 = sc.nextLine();
        System.out.println("Enter the name of the second team");
        String nameteam2 = sc.nextLine();
        Basketball game1 = new Basketball(nameteam1, nameteam2);
        game1.game();

        System.out.println("------------------------------------");
        System.out.println("DETAILS");
        System.out.println("------------------------------------");
        for(int i = 0 ; i < game1.getGameDetails().size(); i++){
            System.out.println(game1.getGameDetails().get(i));
        }
        System.out.println("------------------------------------");
        System.out.println("GAME RESULTS");
        System.out.println("------------------------------------");
        System.out.println(game1.getTeam1().getTeamName()+" - "+game1.getTeam1().getPoint());
        System.out.println(game1.getTeam2().getTeamName()+" - "+game1.getTeam2().getPoint());
        System.out.println("------------------------------------");
        sports();
    }

    //MUSIC

    private void listenMusic(){
        System.out.println("---------------------------------------------");
        System.out.println("Wellcome to the music section");
        System.out.println("What do you want to do?");
        System.out.println("---------------------------------------------");
        System.out.println("1: Add music to favorites");
        System.out.println("2: View favorites list");
        System.out.println("3: Listen and sing music");
        System.out.println("4: Back");

        evaluationMusic(sc.nextInt());

    }

    private void evaluationMusic(int index){

        switch (index){
            case 1: addNewMusic(); break;
            case 2: viewFavorites(); break;
            case 3: listenToMusic(); break;
            case 4: viewMenu();
        }
    }

    private void addNewMusic(){
        System.out.println("---------------------------------------------");
        System.out.println("Enter music name");
        sc.nextLine();
        String nameMusic = sc.nextLine();
        System.out.println("Enter music type");
        String typeMusic = sc.nextLine();
        System.out.println("Enter music genre");
        String musicGenre = sc.nextLine();
        System.out.println("Enter music author");
        String authorMusic = sc.nextLine();
        Music musicNew = new Music(nameMusic,typeMusic,musicGenre,authorMusic);
        wallkman.getListMusic().getFavorites().addMusic(musicNew);
        listenMusic();
    }

    private void viewFavorites(){
        System.out.println("---------------------------------------------");
        System.out.println("MY FAVORITE MUSIC IS:");
        for(int i = 0; i < wallkman.getListMusic().getFavorites().getArrayList().size(); ++i) {
            System.out.println("---------------------------------------------");
            Music aux = (Music)wallkman.getListMusic().getFavorites().getArrayList().get(i);
            System.out.println("NAME OF MUSIC IS: " + aux.getNameMusic());
            System.out.println("AUTHOR OF MUSIC IS: " + aux.getAutorMusic());
            System.out.println("GENDER OF THE MUSIC IS: " + aux.getGenreMusic());
            System.out.println("TYPE OF THE MUSIC IS : " + aux.getTypeMusic());
        }
        listenMusic();
    }

    private void listenToMusic(){
        System.out.println("---------------------------------------------");
        int index = 0;
        for(int i = 0; i < wallkman.getListMusic().getFavorites().getArrayList().size(); ++i) {
            Music aux = (Music)wallkman.getListMusic().getFavorites().getArrayList().get(i);
            index = i+1;
            System.out.println(index+": " + aux.getNameMusic()+" - " + aux.getAutorMusic());
        }
        System.out.println((index+1)+": Back");
        System.out.println("---------------------------------------------");
        System.out.println("Select a music");
        listenSong(index,sc.nextInt()-1);
    }

    private void listenSong(int index, int listeningSong){
        if(index != listeningSong){
            singSong(listeningSong);
        }else{
            listenMusic();
        }
    }

    private void singSong(int listeningSong){
        System.out.println("---------------------------------------------");
        System.out.println("I am singing and lintening the next song: "+ wallkman.getListMusic().ListenNusic(listeningSong).getNameMusic());
        int minute= 5;
        while (minute != 0){
            System.out.println(wallkman.getListMusic().sing());
            minute--;
        }
        listenToMusic();
    }

}
