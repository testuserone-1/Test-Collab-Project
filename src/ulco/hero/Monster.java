package ulco.hero;

import java.util.Random;

public class Monster extends Character {

    public Monster(String name, double life, double power) {
        super("Monster", name, life, power);
    }

    public double fight() {
        Random random = new Random();

        return random.nextDouble() * 20 * _power;
    }

    public void update_stats() {
        Random random = new Random();

        if (random.nextBoolean()) {
            _power *= 1.05;
        }
    }
}
