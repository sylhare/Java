package mockito;

public class ComplexService {
    public Dep.B depB;
    public Dep.C depC;
    public SimpleService simpleService;

    public void complexLogic() {
        depB.doStuff();
        depC.doStuff();
        simpleService.simpleLogic();
    }

    public void set(Dep.B b, Dep.C c, SimpleService ss) {
        this.depB = b;
        this.depC = c;
        this.simpleService = ss;
    }
}
