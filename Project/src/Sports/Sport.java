package Sports;

import Articles.Ball;
import Articles.SportsField;
import Articles.Team;

import java.util.ArrayList;


public class Sport {

    private int numberGame;
    private Ball ball;
    private SportsField stadium;
    private Team team1, team2, referee;
    private ArrayList<String> gameDetails;


    public Sport(int numberGame, String nameTeam1, String nameTeam2) {
        this.numberGame = numberGame;
        team1 = generateTeam(nameTeam1);
        team2 = generateTeam(nameTeam2);
        referee = generateTeam("Referee");
        gameDetails = new ArrayList<String>();

    }

    public ArrayList getGameDetails(){
        return gameDetails;
    }

    public void setDetail(String detail){
        gameDetails.add(detail);
    }

    public Ball generateBall(String nameBall, double size, double weight){
        ball= new Ball(nameBall, size, weight);
        return ball;
    }

    public SportsField generateStadium(String nameStadium, String location, String characteristic ){
        stadium = new SportsField(nameStadium, location, characteristic);
        return stadium;
    }

    private Team generateTeam(String nameTeam){
        Team team = new Team(nameTeam);
        if(nameTeam.equals("Referee")){
            team.createRefereeTeam(3);
        }else{
            generateTeamPlayers(team);
        }
        return team;
    }

    private void generateTeamPlayers(Team team){
        switch(numberGame){
            case 2 : team.createTeam(11);break;
            case 3 : team.createTeam(2); break;
            case 4 : team.createTeam(5); break;

        }
    }

    public void addPoints(int team, int amountPoint){
        switch (team){
            case 1 : team1.setPoint(amountPoint); break;
            case 2 : team2.setPoint(amountPoint); break;
        }
    }

    public int getNumberGame() {
        return numberGame;
    }

    public Ball getBall() {
        return ball;
    }

    public SportsField getStadium() {
        return stadium;
    }

    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public Team getTeamByNumber(int team){
        Team result;
        if(team == 1){
            result = team1;
        }else{
            result = team2;
        }
        return result;
    }

    public Team getReferee() {
        return referee;
    }
}
