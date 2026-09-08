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
        director.addShow();
        listOfActors = new ArrayList<>();
        System.out.println("Создан спектакль '" + getTitle() + "'.");
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
        System.out.println("Список актеров спектакля '" + getTitle() + "':");
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }

    public void addActor(Actor newActor) {
        for (Actor actor : getListOfActors()) {
            if (actor.equals(newActor)) {
                System.out.println("Добавление невозможно, этот актер уже задействован в спектакле '" + getTitle() + "'.");
                return;
            }
        }
        listOfActors.add(newActor);
        System.out.println("Актер " + newActor.toString() + " добавлен в труппу спектакля '" + getTitle() + "'.");
    }

    public int searchActorBySurname(String surname) {
        for (Actor actor : listOfActors) {
            if (actor.getSurname().equalsIgnoreCase(surname)) {
                return listOfActors.indexOf(actor);
            }
        }
        return -1;
    }

    public void changeActor(String oldActorSurname, Actor newActor) {
        int index = searchActorBySurname(oldActorSurname);
        Actor oldActor = listOfActors.get(index);
        if (index < 0) {
            System.out.println("Замена невозможна, актер c такой фамилией не участвует в спектакле '" + getTitle() + "'.");
            return;
        } else if (listOfActors.contains(newActor)) {
            System.out.println("Замена невозможна, актер, которого вы хотите задействовать, в спектакле уже в нем играет");
            return;
        }
        listOfActors.set(index, newActor);
        System.out.println("Актер " + oldActor + " заменен на актера " + newActor.toString() + " в спектакле '" + getTitle() + "'.");
    }
}

