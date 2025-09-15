package ulco.hero;

public abstract class Character {

    public Character(String kind, String name, double life, double power) {
        _kind = kind;
        _name = name;
        _life = life;
        _power = power;
    }

    public void apply_damage(double damage) {
        System.out.println("[" + _kind + "] - " + _name + " took " + damage + " damage");
        _life -= damage;
        if (_life < 0) {
            _life = 0;
        }
    }

    public abstract double fight();

    public String get_name() {
        return _name;
    }

    public boolean is_alive() {
        return _life > 0;
    }

    public String to_string() {
        return "[" + _kind + "] - " + _name + " has " + _life + " life and power of " + _power;
    }

    public abstract void update_stats();

    protected String _kind;
    protected String _name;
    protected double _life;
    protected double _power;
}
