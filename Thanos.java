import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // 1 : Create an empty heroes list
        ArrayList<Hero> heroes = new ArrayList<Hero>();

        // 2 : Add those heroes to the list
        Hero blackWidow = new Hero("Black Widow", 34);
        Hero captainAmerica = new Hero("Captain America", 100);
        Hero vision = new Hero("Vision", 3);
        Hero ironMan = new Hero("Iron Man", 48);
        Hero scarletWitch = new Hero("Scarlet Witch", 29);
        Hero thor = new Hero("Thor", 1500);
        Hero hulk = new Hero("Hulk", 49);
        Hero doctorStrange = new Hero("Doctor Strange", 42);
        heroes.add(blackWidow);
        heroes.add(captainAmerica);
        heroes.add(vision);
        heroes.add(ironMan);
        heroes.add(scarletWitch);
        heroes.add(thor);
        heroes.add(hulk);
        heroes.add(doctorStrange);

        // 3 : It's Thor birthday, now he's 1501
        thor.setAge(1501);

        // 4 : Shuffle the heroes list
        Collections.shuffle(heroes);

        //  5 : Keep only the half of the list
        int halfSize = heroes.size() / 2;
        for (int i = 0; i < halfSize; i++) {
            heroes.remove(i);
        }

        //  6 : Loop throught the list and display the name of the remaining heroes
        for (Hero hero : heroes) {
            System.out.println(hero.getName());
        }
        }
}
