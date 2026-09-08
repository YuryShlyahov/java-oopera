package show;

import person.Actor;
import person.Director;

import java.util.ArrayList;

public class Show {
    private final String title;
    private double duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, double duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public String getTitle() {
        return title;
    }

    public Director getDirector() {
        return director;
    }

    public void printDirector() {
        System.out.println(getDirector().toString());
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void printActors() {
        System.out.println("Актеры, участвующие в шоу:");
        for(Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }

    public void addActor(Actor newActor){
        for(Actor actor : getListOfActors()) {
            if(actor.equals(newActor)){
                System.out.println("Добавление невозможно, этот актер уже задействован в этом спектакле.");
                return;
            }
        }
        listOfActors.add(newActor);
        System.out.println("Актер " + newActor.toString() + " добавлен в труппу спектакля " + getTitle());
    }

    public void changeActor(Actor oldActor, Actor newActor){
        if(listOfActors.contains(oldActor) && !listOfActors.contains(newActor)) {
            listOfActors.set(listOfActors.indexOf(oldActor), newActor);
        } else if (!listOfActors.contains(oldActor)){
            System.out.println("Замена невозможна, актер, которого вы хотите заменить не участвует в спектакле");
        } else if (listOfActors.contains(newActor)){
            System.out.println("Замена невозможна, актер, которого вы хотите задействовать, в спектакле уже в нем играет");
        }

    }
}
