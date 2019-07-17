package javahero.character;

import javahero.Food;
import javahero.Settings;
import javahero.behaviour.Heal;

/**
 *
 */
public class Human extends Living {

  /**
   * Constructor to build Human while initiating the variables from the Living abstract class
   */
  public Human() {
    //Will take the value of the Living abstract class
  }

  /**
   * Create a default human changing its healing
   *
   * @param healing
   */
  public Human(Heal healing) {
    super(healing);
  }

  /**
   * Constructor for a basic human
   *
   * @param life
   * @param weight
   * @param strength
   * @param intel
   */
  public Human(int life, int weight, int strength, int intel, Heal healing) {
    super(life, weight, strength, intel, healing);
  }

  /**
   * Print the text
   *
   * @param text
   */
  public void talk(String text) {
    System.out.println(text);
  }

  public void hello(String text) {
    System.out.println(text);
  }

  @Override
  public void eat(Food food) {
    this.weight = food.getFat();
    this.life = food.getNutrient();
  }

  @Override
  public void workout() {
    this.strength += Settings.BONUS.getValue();
    this.life += Settings.BONUS_MID.getValue();
  }

  @Override
  public void study() {
    this.intel += Settings.BONUS.getValue();
  }

  @Override
  public void fight() {
    this.strength += Settings.BONUS.getValue();
    this.life += Settings.BONUS.getValue();
  }
}
