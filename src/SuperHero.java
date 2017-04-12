import java.util.ArrayList;

/**
 * Super Hero Class
 *
 */
public class SuperHero extends Human {
    public ArrayList<Power> powers = new ArrayList<>();
    public String heroName = "Super";
    private Boolean isRevealed = false;

    /**
     * Basic Constructor
     */
    public SuperHero() {

        this.enhance(50, 50, 50, 50);
    }

    /**
     * Constructor for the hero and his name
     *
     * @param heroName
     * @param name
     */
    public SuperHero(String heroName, String name) {

        this();
        this.heroName = heroName;
        this.name[0] = name;
    }

    /**
     * Enhance the superhero characteristics
     *
     * @param life
     * @param weight
     * @param strength
     * @param intel
     */
    private void enhance(int life, int weight, int strength, int intel){
        this.life = this.life + life;
        this.weight = this.weight + weight;
        this.strength = this.strength + strength;
        this.intel = this.intel + intel;
    }

    /**
     *
     * Create a super power for the super hero
     *
     * @param name
     * @param effects
     */
    public void revealPower(String name, int[] effects){
        this.isRevealed = true;
        Power power = new Power(name, effects);
        this.powers.add(power);
        System.out.println(this.powers.get(0).toString());
        this.enhance(power.effects[0], power.effects[1], power.effects[2], power.effects[3]);
    }

    @Override
    void heal() {

    }

    @Override
    void eat(Food food) {

    }

    @Override
    void workout() {

    }

    @Override
    void study() {

    }

    @Override
    void fight() {

    }

    @Override
    public String toString()
    {
        return heroName + " - " + this.name[0] + " : " + super.toString();
    }

    /**
     * Sub Class Power
     */
    public class Power {
        private String name;
        private int[] effects;

        /**
         * Constructor of Power
         * @param name
         * @param effects
         */
        private Power(String name, int[] effects){
            this.name = name;
            this.effects = effects;
        }

        /**
         *
         * @return a String decribing the power
         */
        @Override
        public String toString(){
            String s = "";

            for (int i = 0; i < this.effects.length; i++){
                s += effects[i] + " ";
            }

            return s;
        }
    }

}
