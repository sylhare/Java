/**
 *
 * For Humans to eat()
 *
 */
public class Food {
    private int fat;
    private int nutrient;
    private String special_effect;
    private int super_effect;

    /**
     * Constructor
     * The super_effect of the food that influence only the super hero
     * gets generated randomly.
     *
     * @param fat
     * @param nutrient
     * @param effect
     */
    public Food(int fat, int nutrient, String effect){
        this.fat = fat;
        this.nutrient = nutrient;
        this.special_effect = effect;
        this.super_effect = getSuper(effect);
    }

    /**
     * We generate a random "super_effect" that will affect super heroes
     *
     * @param effect
     * @return super_effect
     */
    private int getSuper(String effect){
        char[] characters;
        int super_effect = 0;
        effect = effect.replace(" ", "");
        characters = effect.toCharArray();

        for (Character c : characters) {
            super_effect = super_effect + getRandomFactor() * (c - 'a' + 1);
        }

        super_effect = super_effect % (this.nutrient + this.fat);

        return super_effect;
    }

    /**
     * @return either + or - 1
     */
    private int getRandomFactor(){
        int range = 3;
        int factor =  (int)(Math.random() * range) - 1;
        return factor;

    }

    @Override
    public String toString(){
        return "fat: " + this.fat + "% nutrient: " + this.nutrient + "% special effects: " + this.special_effect;
    }

    public int getFat(){
        return this.fat;
    }

    public int getNutrient(){
        return this.nutrient;
    }
}
