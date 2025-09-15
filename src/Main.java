import ulco.hero.Character;
import ulco.hero.Hero;
import ulco.hero.Monster;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Hero hero = new Hero("Zeus", 200, 2);
        Monster monster = new Monster("Kraken", 400, 1);

        System.out.println("Let's the fight begin!!");

        int turn_number = 0;

        while (hero.is_alive() && monster.is_alive()) {
            System.out.println("-----------");
            System.out.println("Begin of turn " + (turn_number + 1) + ":");

            // hero starts
            monster.apply_damage(hero.fight());

            // monster gives answer
            hero.apply_damage(monster.fight());

            Thread.sleep(500);

            System.out.println("-----------");
            System.out.println("End of turn " + (turn_number + 1) + ":");
            System.out.println(" - " + hero.to_string());
            System.out.println(" - " + monster.to_string());
            System.out.println("-----------");

            hero.update_stats();
            monster.update_stats();

            turn_number += 1;
        }

        Character winner = null;

        if (hero.is_alive()) {
            winner = hero;
        } else {
            winner = monster;
        }
        System.out.println("Winner is " + winner.get_name());
    }
}