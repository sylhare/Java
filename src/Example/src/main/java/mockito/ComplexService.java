package mockito;

import mockito.Dep.*;

public class ComplexService {
    public B depB;
    public C depC;
    public SimpleService simpleService;

    public void complexLogic() {
        depB.doStuff();
        depC.doStuff();
        simpleService.simpleLogic();
    }

    public void set(B b, C c, SimpleService ss) {
        this.depB = b;
        this.depC = c;
        this.simpleService = ss;
    }
}
