package Articles;

import Players.Player;
import Players.Referee;

public class Team {
    private Player[] dreamTeam;
    private Referee[] refereeTeam;
    private String teamName;
    private int point;

    public Team(String teamName) {
        this.teamName = teamName;
        point = 0;

    }

    public void setPoint(int point){
        this.point =this.point + point;
    }

    public int getPoint(){
        return point;
    }

    public String getTeamName() {
        return teamName;
    }

    public Player[] getTeamPlayer(){
        return dreamTeam;
    }

    public Referee[] getTeamReferee(){
        return refereeTeam;
    }

    public void createTeam(int numberPlayers){
        dreamTeam = new Player[numberPlayers];
        for(int i = 1; i<= numberPlayers; i++){
            int position = i -1;
            Player player  = new Player("Player: "+i, 70, 1.80);
            dreamTeam[position] = player;
        }

    }

    public void createRefereeTeam(int numberReferee){
        refereeTeam = new Referee[numberReferee];
        for(int i = 1; i<= numberReferee; i++){
            int position = i -1;
            Referee referee  = new Referee("Referee: " + i,75,1.75);
            refereeTeam[position] = referee;
        }

    }
}
