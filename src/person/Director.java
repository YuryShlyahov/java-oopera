package person;

public class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surname, Gender gender) {
        super(name, surname, gender);
        this.numberOfShows = 0;
    }

    @Override
    public String toString() {
        return "Режиссер: " + super.toString();
    }

    public void addShow(){
        numberOfShows++;
    }
}
