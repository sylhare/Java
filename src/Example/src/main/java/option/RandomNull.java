package option;

import java.util.Random;

public class RandomNull {

    String doStuff() {
        return new Random().nextInt() % 2 == 0 ? "Stuff" : null;
    }
}
