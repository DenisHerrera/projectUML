package ListenMusic;

public class SingMusic {
    private LikeMusic favorites = new LikeMusic();

    public SingMusic() {
    }

    public Music ListenNusic(int index) {
        Music music = (Music)this.favorites.getArrayList().get(index);
        return music;
    }

    public LikeMusic getFavorites() {
        return this.favorites;
    }

    public String sing() {
        return "La La La La La ...La La La La.........";
    }
}
