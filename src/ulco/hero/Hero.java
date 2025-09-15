package ulco.hero;

import java.util.Random;

public class Hero extends Character {

    public Hero(String name, int life, int power) {
        super("Hero", name, life, power);
    }

    public double fight() {
        Random random = new Random();

        return (random.nextDouble() * 5 + 5) * _power;
    }

    public void update_stats() {
        _power *= 1.2;
    }
}
