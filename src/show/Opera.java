package show;

import person.Actor;
import person.Director;

import java.util.ArrayList;

public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(String title, int duration, Director director, ArrayList<Actor> listOfActors, int choirSize) {
        super(title, duration, director, listOfActors);
        this.choirSize = choirSize;
    }
}
