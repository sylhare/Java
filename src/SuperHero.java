import java.util.ArrayList;

/**
 *
 *
 */
public class SuperHero extends Human {
    public ArrayList<Power> powers = new ArrayList<>();
    String heroName = "Super";


    public SuperHero() {
        this.enhance(50, 50, 50, 50);
    }

    public SuperHero(String heroName, String name) {
        this();
        this.heroName = heroName;
        this.name[0] = name;
    }

    private void enhance(int life, int weight, int strength, int intel){
        this.life = this.life + life;
        this.weight = this.weight + weight;
        this.strength = this.strength + strength;
        this.intel = this.intel + intel;
    }

    public void revealPower(String name, int[] effects){
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
    public String toString(){
        return heroName + " - " + this.name[0] + " : " + super.toString();
    }

    public class Power {
        private String name;
        private int[] effects;

        private Power(String name, int[] effects){
            this.name = name;
            this.effects = effects;
        }

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
