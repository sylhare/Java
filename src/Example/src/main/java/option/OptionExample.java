package option;

import java.util.Optional;

public class OptionExample {

    public RandomNull externalDependency;

    public String optionalOf() {
        return Optional.of(externalDependency.getData()).get();
    }

    public String optionalNullOf() {
        return Optional.ofNullable(externalDependency.getData()).orElse(null);
    }
}
