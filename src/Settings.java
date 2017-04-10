/**
 *
 *
 */
public enum Settings {
    BONUS(10), BONUS_MID(Settings.BONUS.getValue()/2);

    private int value;

    private Settings(int i) {
        value = i;
    }

    public int getValue() {
        return value;
    }
}
