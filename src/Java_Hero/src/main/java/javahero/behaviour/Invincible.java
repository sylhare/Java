package javahero.behaviour;

/**
 *
 */
public class Invincible implements Heal {

  @Override
  public Integer heal() {
    System.out.println("I'm invincible!");
    return 0;
  }

}
