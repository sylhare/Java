package example;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * For https://openjdk.org/jeps/286 flaws
 */
public class Jep286 {

    /**
     * A String id, should be UUID, but that's to be misleading
     * @return "id"
     */
    String getId() {
        return "id";
    }

    /**
     * IDE warns that the Set<Long> may not contain any String
     * Because the {@code contains} method on the {@code Set} takes an {@code Object} as parameter.
     * @param ids set of ids
     * @return boolean
     */
    boolean hasIdIn(Set<Long> ids) {
        return ids.contains(getId());
    }
}
