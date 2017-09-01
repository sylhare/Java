package javahero;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by sylhare on 2017-04-25.
 *
 * Extending a class from the thread one allow to create a thread
 * The run function will be called when using the "start()" method to start a thread:
 * javahero.Life obj = new javahero.Life();
 * obj.start();
 *
 */
public class Life extends Thread {

    private ArrayList<Object> gifts = new ArrayList<>();

    /**
     * Overrided method from Thread that is called
     * when life.start()
     */
    @Override
    public void run() {
        try {
            lifeEvents();
            System.out.println(String.format("Thread: %s %s", Thread.currentThread().getName()));
        } catch (Exception e) {
            System.out.println(e.getCause());
        }
    }

    private void lifeEvents() {
        Random r = new Random();

        if (r.nextInt(100) < Settings.DISASTER_RATE.getValue()) {
            Thread d = new Thread(new Disaster());
            d.start();
        } else {
            facts(r.nextInt(10));
        }
    }

    private void facts (int i) {
        switch (i) {
            case 1:  this.gifts.add(factsFreeMeal());
                break;
            case 2: factsSayings("Sure is Chilly today");
                break;
            default: factsSayings("Such a peaceful day");
                break;
        }
    }

    /**
     *
     * @return a random javahero.Food Object
     */
    private Food factsFreeMeal() {
        return new Food();
    }

    private void factsSayings(String words){
        System.out.println(words);
    }
}
