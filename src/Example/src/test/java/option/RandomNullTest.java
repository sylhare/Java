package option;

import static java.lang.String.format;

import org.junit.jupiter.api.Test;


class RandomNullTest {

    @Test
    public void doStuffTest() {
        RandomNull randomNull = new RandomNull();
        Integer amountOfNull = 0;
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(format("print %s", randomNull.getData().toLowerCase()));
            } catch (Exception e) {
                amountOfNull++;
            }
        }
        System.out.println("It's a bad practice to put try and catch in test :P");
        System.out.printf("Number of time null %s%n", amountOfNull);
    }

}
