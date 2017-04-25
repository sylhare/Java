/**
 *
 * For Humans to eat()
 *
 */
public class Food {
    private String name;
    private int fat;
    private int nutrient;
    private String effect;
    private int super_effect;

    public Food(){
        this.name = "Food";
        this.fat = (int)(Math.random() * 50);
        this.nutrient = (int)(Math.random() * 50);
        this.effect = "nothing special";
        this.super_effect = 0;
        this.yummy();
        // System.out.println(getClass().getName()); --> returns "Food"
    }

    /**
     * Creating a random food with a set name
     *
     * @param name
     */
    public Food(String name) {
        this();
        this.name = name;
    }

    /**
     * Constructor
     * The super_effect of the food that influence only the super hero
     * gets generated randomly.
     *
     * @param fat
     * @param nutrient
     * @param effect
     */
    public Food(String name, int fat, int nutrient, String effect){
        this.name = name;
        this.fat = fat;
        this.nutrient = nutrient;
        this.effect = effect;
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

    /**
     * Print yummy
     */
    public void yummy(){
        System.out.println("Yummy !");
    }

    public int getFat(){
        return this.fat;
    }

    public int getNutrient(){
        return this.nutrient;
    }

    public int getSuper_effect() { return this.super_effect; }

    public String getEffect() { return this.effect; }

    @Override
    public String toString(){
        String s = "fat: " + this.getFat() + "% nutrient: " + this.getNutrient() + "% special effects: " +
                this.getEffect();

        if (this.super_effect != 0) {
            s += "  \nPower after effects: " + this.getSuper_effect() + "%";
        }
        return s;
    }

}
