package mockito;

public class SimpleService {

    public Dep.A depA;

    public void simpleLogic() {
        System.out.printf("%s do stuff%n", this.getClass().getSimpleName());
        depA.doStuff();
    }
}
