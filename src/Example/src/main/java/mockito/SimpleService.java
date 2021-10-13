package mockito;

import mockito.Dep.*;

public class SimpleService {

    public A depA;

    public void simpleLogic() {
        System.out.printf("%s do stuff%n", this.getClass().getSimpleName());
        depA.doStuff();
    }
}
