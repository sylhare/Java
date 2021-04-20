package option;

import java.util.Optional;

public class OptionExample {

    public RandomNull externalDependency;

    public String optionalOf() {
        return Optional.of(externalDependency.doStuff()).get();
    }
}
