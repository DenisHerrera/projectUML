package Sports;

public class Basketball extends Sport {

    private int numberGame, minutePlay;

    public Basketball(String nameTeam1, String nameTeam2) {
        super(4, nameTeam1, nameTeam2);
        this.minutePlay=12;
        this.numberGame= 4;
    }


    public void game(){
        for(int i = 1; i <= numberGame; i++){
            super.setDetail("Number fourth: "+i + score());
            play(i);
        }
    }

    private void play(int part){
        for(int i = 0 ; i <= minutePlay*8; i++){
            possession((int)(Math.random()*2+1));
        }
    }

    private void possession(int team){
        int action = (int)(Math.random()*100+1);

        if(action>=70 && action<90){
            addPointsAndDetails(team,2);
        }else if(action>=95){
            addPointsAndDetails(team,3);
        }
    }

    private void addPointsAndDetails(int team, int point){
        super.setDetail("Team: "+super.getTeamByNumber(team).getTeamName()+" scored two points..."+score());
        super.addPoints(team,point);
    }

    private String score(){
        return ". SCORE: " + super.getTeam1().getTeamName()+": "+ super.getTeam1().getPoint()+
                " - "+super.getTeam2().getTeamName()+": "+super.getTeam2().getPoint();
    }
}
