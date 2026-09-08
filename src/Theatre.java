import person.*;
import show.Ballet;
import show.Opera;
import show.Show;

public class Theatre {
    public static void main(String[] args) {
        Actor loban = new Actor("Антон", "Лобан", Gender.MALE, 1.80);
        Actor falko = new Actor("Алексей", "Фалько", Gender.MALE, 1.78);
        Actor churakova = new Actor("Юлия", "Чуракова", Gender.FEMALE, 1.65);
        Director mironov = new Director("Михаил", "Миронов", Gender.MALE);
        Director kaluzhanov = new Director("Сергей", "Калужанов", Gender.MALE);
        MusicAuthor fomenko = new MusicAuthor("Николай", "Фоменко", Gender.MALE);
        Choreographer kasatkina = new Choreographer("Наталья", "Касаткина", Gender.FEMALE);
        Show secret = new Show("Ничего не бойся, я с тобой", 3.05, mironov);

        Opera carmen = new Opera("Кармен", 2.05, kaluzhanov, fomenko,
                "В этом нарочито лишённом красивости, почти целиком песочно-белом спектакле с редкими вкраплениями серого " +
                        "и черного — своя поэзия, кое-где ненавязчиво перекликающаяся с итальянским неореализмом.", 10);
        Ballet donKihot = new Ballet("Дон Кихот", 1.55, mironov, fomenko, "Образ незадачливого жениха Китри, дворянина Гамаша, " +
                "стал более забавным и выразительным. Эти детали дополнили историю и добавили в нее новых красок.", kasatkina);
        secret.addActor(loban);
        secret.addActor(falko);
        carmen.addActor(churakova);
        carmen.addActor(loban);
        donKihot.addActor(falko);

        secret.printActors();
        carmen.printActors();
        donKihot.printActors();
        secret.changeActor("Лобан", churakova);
        secret.printActors();
        donKihot.changeActor("Лобан", churakova);
        carmen.printLibretto();
        donKihot.printLibretto();
    }
}
