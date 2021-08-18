package ListenMusic;

public class Music {
    String nameMusic;
    String typeMusic;
    String genreMusic;
    String autorMusic;

    public Music(String nameMusic, String typeMusic, String genreMusic, String autorMusic) {
        this.nameMusic = nameMusic;
        this.typeMusic = typeMusic;
        this.genreMusic = genreMusic;
        this.autorMusic = autorMusic;
    }

    public String getNameMusic() {
        return this.nameMusic;
    }

    public String getTypeMusic() {
        return this.typeMusic;
    }

    public String getGenreMusic() {
        return this.genreMusic;
    }

    public String getAutorMusic() {
        return this.autorMusic;
    }
}
