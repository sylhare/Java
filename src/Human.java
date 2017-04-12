import java.util.ArrayList;

/**
 *
 * Human abstract class, to describe what a normal human can do
 *
 *
 */
abstract class Human {
    int slot = 5;
    int life = 100;
    int weight = 70;
    int strength = 25;
    int intel = 115;

    String[] name = new String[2];
    ArrayList<String> belongings = new ArrayList<>(slot);

    /**
     * 
     * Should increase health
     * 
     */
    abstract void heal();

    /**
     * 
     * Should raise health, might have weird effects depending on the food
     * for intel, weight and strength
     * 
     * @param food
     */
    abstract void eat(Food food);

    /**
     * Should raise Strength and diminish weight
     * 
     */
    abstract void workout();

    /**
     * Should raise intel, but might diminish strength and health
     */
    abstract void study();

    /**
     * Should raise Strength, but might diminish health and intel
     */
    abstract void fight();

    @Override
    public String toString(){
        return "\nlife : " + this.life + "\nweight : " + this.weight + "\nstrenght : "
                + this.strength + "\nintel : " + this.intel;
    }



}
