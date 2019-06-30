package flexjson.mock.wizards;

import java.util.Random;

public class Fireball implements Spell {

    private int power;
    private Random random = new Random();

    protected Fireball() {
    }

    public Fireball(int power) {
        this.power = power;
    }

    public String getType() {
        return "fireball";
    }

    public void cast(Player target) {
        if( target.isAlive() ) {
            target.injure(Math.min(random.nextInt(power) + 1, power));
        }
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
