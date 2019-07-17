package skeleton;

public class Belly {
  public static String GROWLS_SOUND = " Growwwlll !!!";
  public static String REST_SOUND = " ... ";
  private Integer cakesInBelly = 0;
  private Integer cucumbersInBelly = 0;

  /**
   * Each time a cake is eaten the number of cake in the Belly increase
   *
   * @param cakes
   */
  public void eat(int cakes) {
    for (int cake = 0; cake < cakes; cake++) {
      this.cakesInBelly += 1;
    }
  }

  /**
   * The digestion rate is one hour for 42 cakes
   *
   * @param time
   */
  public void wait(int time) {
    this.cakesInBelly -= time * 42;
  }

  /**
   * If there are no cake in cucumber it will return a growl sound
   * equal to the Belly.GROWLS_SOUND
   *
   * @return growling made by cucumber
   */
  public String growl() {
    String growling;

    if (this.cakesInBelly <= 0) {
      growling = Belly.GROWLS_SOUND;
    } else {
      growling = Belly.REST_SOUND;
    }

    return growling;
  }
}