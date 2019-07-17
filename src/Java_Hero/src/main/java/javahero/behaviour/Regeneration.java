package javahero.behaviour;

/**
 *
 */
public class Regeneration implements Heal {

  @Override
  public Integer heal() {
    System.out.println("Self healing");
    return 50;
  }

}

