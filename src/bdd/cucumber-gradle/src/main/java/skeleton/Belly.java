package skeleton;

public class Belly {
    public static String GROWLS_SOUND = " Growwwlll !!!";
    private Integer cakesInBelly = 0;

    /**
     * Each time a cake is eaten the number of cake in the Belly increase
     *
     * @param cakes
     */
    public void eat(int cakes) {
        for ( int cake=0; cake < cakes; cake++ ) {
            this.cakesInBelly += 1;
        }
    }

    /**
     * The digestion rate is one hour for 42 cakes
     *
     * @param time
     */
    public void wait(int time) {
        this.cakesInBelly -= time * 42;
    }

    /**
     * If there are no cake in belly it will return a growl sound
     * equal to the Belly.GROWLS_SOUND
     *
     * @return growling made by belly
     */
    public String growl() {
        String growling;

        if (this.cakesInBelly <= 0){
            growling = Belly.GROWLS_SOUND;
        } else {
            growling = " ... ";
        }

        return growling;
    }
}
