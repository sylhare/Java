package mockito;

public abstract class Dep {

    public void doStuff() {
        System.out.printf("%s do stuff%n", this.getClass().getSimpleName());
    }

    public static class A extends Dep {
    }
    public static class B extends Dep {
    }
    public static class C extends Dep {
    }
}
