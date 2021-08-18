package Sports;

public class Tennis extends Sport{

    public Tennis(String nameTeam1, String nameTeam2) {
        super(3, nameTeam1, nameTeam2);
    }

    public void game(){
        int playNumber = 1;
        int team ;
        super.setDetail("Start of set");
        while(getPointsWin()<6){
            takeOut(playNumber,possession(playNumber));
            playNumber++;
        }
    }

    private int possession(int playNumber){
        int team;
        if(playNumber%2 == 0){
            team = 2 ;
        }else{
            team = 1;
        }
        return team;
    }

    private int getPointsWin(){
        int pointA = super.getTeam1().getPoint();
        int pointB = super.getTeam2().getPoint();
        int pointsWinner = 0;
        if(pointA >= pointB){
           pointsWinner = pointA;
        }else {
            pointsWinner = pointB;
        }
        return pointsWinner;
    }

    private void takeOut(int numberSet, int team){
        int point = (int)(Math.random()*10+1);
        if(point<=5){
            super.setDetail("Point to: "+ super.getTeamByNumber(team).getTeamName()+ score());
            super.getTeamByNumber(team).setPoint(1);
        }else{
            pointForRival(team);
        }
    }

    private void pointForRival(int team){
        if(team != 1){
            super.setDetail("Point to: "+ super.getTeamByNumber(1).getTeamName()+ score());
            super.getTeamByNumber(1).setPoint(1);
        }else{
            super.setDetail("Point to: "+ super.getTeamByNumber(2).getTeamName()+ score());
            super.getTeamByNumber(2).setPoint(1);
        }

    }

    private String score(){
        return ". SCORE: " + super.getTeam1().getTeamName()+": "+ super.getTeam1().getPoint()+
                " - "+super.getTeam2().getTeamName()+": "+super.getTeam2().getPoint();
    }
}
