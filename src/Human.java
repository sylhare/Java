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

    abstract void heal();
    abstract void eat(Food food);
    abstract void workout();
    abstract void study();
    abstract void fight();

    @Override
    public String toString(){
        return "\nlife : " + this.life + "\nweight : " + this.weight + "\nstrenght : "
                + this.strength + "\nintel : " + this.intel;
    }



}
