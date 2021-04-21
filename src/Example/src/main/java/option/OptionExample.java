package option;

import java.util.Optional;

public class OptionExample {

    public RandomNull externalDependency;

    public String optionalOf() {
        return Optional.of(externalDependency.supplyData()).get();
    }

    public String optionalNullOf() {
        return dataWrapper().orElse(null);
    }

    public Optional<String> dataWrapper() {
        return Optional.ofNullable(externalDependency.supplyData());
    }

    public String getData() {
        return dataWrapper()
                .map(String::toUpperCase)
                .orElse(null);
    }
}
