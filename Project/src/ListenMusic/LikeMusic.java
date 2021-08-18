package ListenMusic;

import java.util.ArrayList;

public class LikeMusic {

    private ArrayList<Music> playMusic;

    public LikeMusic() {

        playMusic = new ArrayList();

    }
    public void addMusic(Music music) {
        this.playMusic.add(music);
    }



    public ArrayList getArrayList() {
        return this.playMusic;
    }
}
