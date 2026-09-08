package show;

import person.Director;
import person.MusicAuthor;

public class MusicalShow extends Show {
    private MusicAuthor musicAuthor;
    private String librettoText;

    public MusicalShow(String title, double duration, Director director, MusicAuthor musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;

    }

    public String getLibrettoText() {
        return librettoText;
    }

    public void printLibretto() {
        System.out.println("Текст либретто спектакля '" + getTitle() + "': " + getLibrettoText());
    }
}
