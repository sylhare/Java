package option;

import java.util.Random;

public class RandomNull {

    public static String DATA = "Data";

    String supplyData() {
        return new Random().nextInt() % 2 == 0 ? DATA : null;
    }
}
