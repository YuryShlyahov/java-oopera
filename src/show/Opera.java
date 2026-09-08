package show;

import person.Director;
import person.MusicAuthor;

public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(String title, double duration, Director director, MusicAuthor musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
