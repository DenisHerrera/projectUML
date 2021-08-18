package Sports;

public class Soccer extends Sport{

    private int minutePlay, numberGame;


    public Soccer(String nameTeam1, String nameTeam2) {
        super(2,nameTeam1, nameTeam2);
        minutePlay = 45;
        numberGame = 2 ;

    }

    public void game(){
        for(int i = 1; i <= numberGame; i++){
            play(i);
        }
    }

    private void play(int part){

        for(int i = 0 ; i <= minutePlay; i++){
            possession((int)(Math.random()*2+1), i, part);
        }
    }

    private void possession(int team, int minute, int part){
        int action = (int)(Math.random()*100+1);

        if(action>=87 && action<95){
            addDetails("Team: "+super.getTeamByNumber(team).getTeamName()+" scoring chance", part, minute);
        }else if(action>=95){
            addDetails("GOOOALLL Team: "+super.getTeamByNumber(team).getTeamName(), part, minute);
            super.addPoints(team,1);
        }
    }

    private void addDetails(String detail, int part, int minute){
        switch (part){
            case 1 : super.setDetail(detail+", minute: "+minute); break;
            case 2 : int newMinute = minute+45;
                    super.setDetail(detail+", minute: "+ newMinute); break;
        }
    }

}
