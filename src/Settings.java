/**
 *
 * With the intent to have global int to set the value of the heroes
 *
 */
public enum Settings {
    BONUS(10), BONUS_MID(Settings.BONUS.getValue()/2);

    private int value;

    /**
     * Constructor
     *
     * @param i
     */
    Settings(int i) {

        value = i;
    }

    /**
     * Getter
     *
     * @return value
     */
    public int getValue() {

        return value;
    }
}
