package javahero;

/**
 * Created by sylhare on 2017-04-25.
 * Implementing the Runnable Interface makes it possible to call multiple threads
 * with:
 * Thread t = new Thread(new javahero.Disaster());
 * t.start();
 *
 */
public class Disaster implements Runnable {

    /**
     * When disaster.start() the run() method starts;
     * Creates a monster for now.
     */
    @Override
    public void run(){
        System.out.println("Chaos !!");
        Monster M = createMonster();
        M.chaos();
    }

    /**
     * Creates a random Monster
     * @return the created monster
     */
    public Monster createMonster(){
        return new Monster();
    }

    /**
     * Creates a specific Monster
     *
     * @param name
     * @param disasterLevel
     * @return the created Monster
     */
    public  Monster createMonster(String name, String disasterLevel) {
        return  new Monster(name, disasterLevel);
    }


    /**
     *
     * Monster subclass from the javahero.Disaster class
     */
    private class Monster {
        /**
         * Disaster level
         * God, Dragon, Demon, Tiger, Wolf
         */
        private String disasterLevel;
        private int life = 100;
        private int strength = 100;
        private String name;

        public Monster(){
            this.name = randomName();
            this.disasterLevel = randomDisaster();
        }

        public Monster(int life, int strength, String name, String disasterLevel){
            this.life = life;
            this.strength = strength;
            this.name = name;
            this.disasterLevel = disasterLevel;
        }

        public Monster(String name, String disasterLevel){
            this.name = name;
            this.disasterLevel = disasterLevel;
        }

        /**
         * Generate a random name for the monster
         *
         * @return a random name
         */
        private String randomName(){
            String name = "Monster";

            return name;
        }

        /**
         * Create a random disaster level
         * @return the disaster level name
         */
        private String randomDisaster() {
            String level = "Tiger";
            return level;
        }

        public void chaos(){
            // do stuff
        }


    }
}
