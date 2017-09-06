package javahero.events;

import javahero.character.Monster;

/**
 *
 * Implementing the Runnable Interface makes it possible to call multiple threads
 * with:
 * Thread t = new Thread(new javahero.events.Disaster());
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
    public Monster createMonster(String name, String disasterLevel) {
        return  new Monster(name, disasterLevel);
    }

}
