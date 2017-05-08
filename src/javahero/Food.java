package javahero;

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
    private int superEffect;

    public Food(){
        this.name = "javahero.Food";
        this.fat = (int)(Math.random() * 50);
        this.nutrient = (int)(Math.random() * 50);
        this.effect = "nothing special";
        this.superEffect = 0;
        this.yummy();
        // System.out.println(getClass().getName()); --> returns "javahero.Food"
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
     * The superEffect of the food that influence only the super hero
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
        this.superEffect = getSuper(effect);
    }

    /**
     * We generate a random "superEffect" that will affect super heroes
     *
     * @param effect
     * @return superEffect
     */
    private int getSuper(String effect){
        char[] characters;
        int superEffect = 0;
        characters = effect.replace(" ", "").toCharArray();

        for (Character c : characters) {
            superEffect = superEffect + getRandomFactor() * (c - 'a' + 1);
        }

        superEffect = superEffect % (this.nutrient + this.fat);

        return superEffect;
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

    public String getName(){
        return this.name;
    }

    public int getFat(){
        return this.fat;
    }

    public int getNutrient(){
        return this.nutrient;
    }

    public int getsuperEffect() { return this.superEffect; }

    public String getEffect() { return this.effect; }

    @Override
    public String toString(){
        String s = "fat: " + this.getFat() + "% nutrient: " + this.getNutrient() + "% special effects: " +
                this.getEffect();

        if (this.superEffect != 0) {
            s += "  \nPower after effects: " + this.getsuperEffect() + "%";
        }
        return s;
    }

}
