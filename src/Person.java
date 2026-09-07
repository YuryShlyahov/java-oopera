public class Person {

    private final String name;
    private final String surname;
    private Gender gender;
    private double height;

    public Person(String name, String surname, Gender gender, double height) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.height = height;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }
}
