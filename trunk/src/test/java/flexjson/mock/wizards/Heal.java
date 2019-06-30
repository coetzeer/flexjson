package flexjson.mock.wizards;

import java.util.Random;

public class Heal implements Spell {

    int power;
    Random random = new Random();

    protected Heal() {
    }

    public Heal(int power) {
        this.power = power;
    }

    public String getType() {
        return "heal";
    }

    public void cast(Player target) {
        if( target.isAlive() ) {
            target.heal(Math.min(power, random.nextInt(power) + 1));
        }
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
