package ListenMusic;

public class Mp3Music {
    private SingMusic listMusic;

    public Mp3Music() {
        Music music1 = new Music("COMO AGUA EN EL DECIERTO", "COGRGACIONAL", "CULTA", "GRUPO ESPERANZA");
        Music music2 = new Music("MI TIERRA QUERIDA", "INSTRUMENTAL", "FOLKLORE", "LOS DEL PUEBLO");
        Music music3 = new Music("FREE SWIM IN THE OCEAN", "SWING", "CLASIC", "LOS PICAPIEDRAS");
        Music music4 = new Music("DON'T GET COMFORTABLE", "ROMANTIC", "CLASIC", "BRANDON HEATH KNELL");
        this.listMusic = new SingMusic();
        this.listMusic.getFavorites().addMusic(music1);
        this.listMusic.getFavorites().addMusic(music2);
        this.listMusic.getFavorites().addMusic(music3);
        this.listMusic.getFavorites().addMusic(music4);
    }

    public SingMusic getListMusic() {
        return this.listMusic;
    }
}
