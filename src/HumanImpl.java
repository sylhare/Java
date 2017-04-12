/**
 *
 *
 */
public class HumanImpl extends Human {

    /**
     * Constructor to build Human Impl while initiating the variables
     *
     */
    public HumanImpl() {
        //Will take the value of the Human abstract class
    }

    /**
     *
     * Constructor for a basic human
     *
     * @param life
     * @param weight
     * @param strength
     * @param intel
     */
    public HumanImpl(int life, int weight, int strength, int intel){
       this.life = life;
       this.weight = weight;
       this.strength = strength;
       this.intel = intel;
    }

    @Override
    void heal() {
        this.life += Settings.BONUS.getValue();
    }

    @Override
    void eat(Food food) {
        this.weight = food.fat;
        this.life = food.nutrient;
    }

    @Override
    void workout() {
        this.strength += Settings.BONUS.getValue();
        this.life += Settings.BONUS_MID.getValue();
    }

    @Override
    void study() {
        this.intel += Settings.BONUS.getValue();
    }

    @Override
    void fight() {
        this.strength += Settings.BONUS.getValue();
        this.life += Settings.BONUS.getValue();
    }
}
