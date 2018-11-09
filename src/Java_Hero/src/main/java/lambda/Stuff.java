package lambda;

public class Stuff {

  public Stuff(String parameter) {
    System.out.println("I'm a Stuff from " + parameter);
  }

  public static Stuff createStuff(final String parameter) {
    return new Stuff(parameter);
  }

}
