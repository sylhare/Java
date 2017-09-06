package javahero.character;

import javahero.behaviour.FirstAid;
import javahero.behaviour.Regeneration;
import javahero.character.Human;

import java.util.ArrayList;

/**
 * Super Hero Class
 */
public class SuperHero extends Human {
    private ArrayList<Power> powers = new ArrayList<>();
    private String heroName = "Super";
    private Boolean isRevealed = false;

    /**
     * Basic Constructor with default values
     */
    public SuperHero() {
        this.enhance(50, 50, 50, 50);
        this.healing = new Regeneration();
    }

    /**
     * Constructor to set the hero's name and his super hero nickname
     *
     * @param heroName
     * @param name
     */
    public SuperHero(String heroName, String name) {
        this();
        this.setHeroName(heroName);
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
    private void enhance(int life, int weight, int strength, int intel) {
        this.life = this.life + life;
        this.weight = this.weight + weight;
        this.strength = this.strength + strength;
        this.intel = this.intel + intel;
    }

    /**
     * Create a super power for the super hero
     *
     * @param name
     * @param effects
     */
    public void revealPower(String name, int[] effects) {
        this.isRevealed = true;
        Power power = new Power(name, effects);
        this.powers.add(power);
        System.out.println(this.powers.get(0).toString());
        this.enhance(power.effects[0], power.effects[1], power.effects[2], power.effects[3]);
    }

    /**
     * @return the hero name
     */
    public String getHeroName() {
        return this.heroName;
    }

    /**
     * Set the hero name
     *
     * @param heroName
     */
    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getPowers() {
        String s = "not discorvered";
        if (hasSuperPower()) {
            s = "";
            for (int i = 0; i < this.powers.size(); i++) {
                s += this.powers.get(i).toString();
            }
        }
        return s + "\n";
    }

    /**
     * To know if the superhero has discovered is power
     *
     * @return isRevealed (boolean)
     */
    public boolean hasSuperPower() {
        return isRevealed;
    }

    @Override
    public void talk(String text) {
        String t = text.toUpperCase();  //Super heroes talk in upper case
        System.out.println(t);
    }

    @Override
    public String toString() {
        return this.getHeroName() + " - " + this.name[0] + " : " + this.getPowers() + " \n" + super.toString();
    }


    /**
     * Inner Class Power of the Super Hero class
     */
    public class Power {
        private String name;
        private int[] effects;

        /**
         * Constructor of Power
         *
         * @param name
         * @param effects
         */
        private Power(String name, int[] effects) {
            this.name = name;
            this.effects = effects;
        }

        /**
         * @return the power name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return a String describing the power
         */
        @Override
        public String toString() {
            String s = this.getName() + ": ";

            for (int i = 0; i < this.effects.length; i++) {
                s += effects[i] + " ";
            }

            return s;
        }
    }

}
