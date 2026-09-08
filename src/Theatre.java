import person.Actor;
import person.Director;
import person.Gender;
import person.MusicAuthor;
import show.Show;

public class Theatre {
    public static void main(String[] args) {
        Actor loban = new Actor("Антон", "Лобан", Gender.MALE, 1.80);
        Actor falko = new Actor("Алексей", "Фалько", Gender.MALE, 1.78);
        Actor churakova = new Actor("Юлия", "Чуракова", Gender.MALE, 1.65);
        Director mironov = new Director("Михаил", "Миронов", Gender.MALE);
        Director kaluzhanov = new Director("Сергей", "Калужанов", Gender.MALE);
        MusicAuthor fomenko = new MusicAuthor("Николай", "Фоменко", Gender.MALE);
        Show show = new Show("Ничего не бойся, я с тобой", 3.05, mironov)
    }
}
