package show;

import person.Actor;
import person.Choreographer;
import person.Director;
import person.Person;

import java.util.ArrayList;

public class Ballet extends MusicalShow {
    private Choreographer choreographer;

    public Ballet(String title, int duration, Director director, ArrayList<Actor> listOfActors, Choreographer choreographer) {
        super(title, duration, director, listOfActors);
        this.choreographer = choreographer;
    }
}
