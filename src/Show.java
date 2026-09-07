import java.util.ArrayList;

public class Show {
    private final String title;
    private int duration;
    private Director director;
    private ArrayList<Actor>listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }
}
