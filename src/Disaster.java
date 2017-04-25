import java.util.HashSet;
import java.util.Set;

/**
 * Created by sylhare on 2017-04-25.
 * Implementing the Runnable Interface makes it possible to call multiple threads
 * with:
 * Thread t = new Thread(new Disaster());
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
     * Monster subclass from the Disaster class
     */
    private class Monster {
        private Set<String> levels = new HashSet<>();
        private int life = 100;
        private int strength = 100;
        private String name;
        private String disasterLevel;

        public Monster(){
            this.name = randomName();
            this.disasterLevel = randomDisaster();
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
