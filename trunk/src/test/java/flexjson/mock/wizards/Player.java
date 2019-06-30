package flexjson.mock.wizards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Player {

    private String name;
    private int life;
    private int maxHealth;
    private int strength;
    private int mana;

    private List<Spell> spells = new ArrayList<Spell>();

    protected Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public Player stats(int maxLife, int strength, int mana ) {
        this.maxHealth = maxLife;
        this.strength = strength;
        this.mana = mana;
        return this;
    }

    public Player add(Spell... spells ) {
        this.spells.addAll( Arrays.asList(spells) );
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public List<Spell> getSpells() {
        return spells;
    }

    public void setSpells(List<Spell> spells) {
        this.spells = spells;
    }

    public void heal(int heal) {
        this.life = Math.min( this.maxHealth, life + heal);
    }

    public void injure(int injury) {
        this.life = Math.max( this.life + injury, 0 );
    }

    public boolean isAlive() {
        return this.life > 0;
    }
}
