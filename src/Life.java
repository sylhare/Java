import java.util.ArrayList;
import java.util.Random;

/**
 * Created by sylhare on 2017-04-25.
 *
 * Extending a class from the thread one allow to create a thread
 * The run function will be called when using the "start()" method to start a thread:
 * Life obj = new Life();
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
            life_events();
            System.out.println(String.format("Thread: %s %s", Thread.currentThread().getName()));
        } catch (Exception e) {
            System.out.println(e.getCause());
        }
    }

    private void life_events() {
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
            case 1:  this.gifts.add(facts_freeMeal());
                break;
            case 2: facts_sayings("Sure is Chilly today");
                break;
            default: facts_sayings("Such a peaceful day");
                break;
        }
    }

    /**
     *
     * @return a random Food Object
     */
    private Food facts_freeMeal() {
        return new Food();
    }

    private void facts_sayings(String words){
        System.out.println(words);
    }
}
