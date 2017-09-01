package javahero;

import java.util.ArrayList;

/**
 *
 * Living abstract class, to describe what a normal Living can do
 *
 *
 */
public abstract class Living {
    public int slot = 5;
    public int life = 100;
    public int weight = 70;
    public int strength = 25;
    public int intel = 115;

    public String[] name = new String[2];
    public ArrayList<String> belongings = new ArrayList<>(slot);

    /**
     * 
     * Should increase health
     * 
     */
    public abstract void heal();

    /**
     * 
     * Should raise health, might have weird effects depending on the food
     * for intel, weight and strength
     * 
     * @param food
     */
    public abstract void eat(Food food);

    /**
     * Should raise Strength and diminish weight
     * 
     */
    public abstract void workout();

    /**
     * Should raise intel, but might diminish strength and health
     */
    public abstract void study();

    /**
     * Should raise Strength, but might diminish health and intel
     */
    public abstract void fight();

    @Override
    public String toString(){
        return "\nlife : " + this.life + "\nweight : " + this.weight + "\nstrenght : "
                + this.strength + "\nintel : " + this.intel;
    }



}
