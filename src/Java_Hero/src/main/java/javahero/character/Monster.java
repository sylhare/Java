package javahero.character;

import javahero.Food;
import javahero.behaviour.Invincible;

/**
 * Monster subclass from the javahero.events.Disaster class
 */
public class Monster extends Living {
  /**
   * Disaster level
   * God, Dragon, Demon, Tiger, Wolf
   */
  private String disasterLevel;
  private int life = 100;
  private int strength = 100;
  private String name;

  public Monster() {
    this.name = randomName();
    this.disasterLevel = randomDisaster();
    this.healing = new Invincible();
  }

  public Monster(int life, int strength, String name, String disasterLevel) {
    this();
    this.life = life;
    this.strength = strength;
    this.name = name;
    this.disasterLevel = disasterLevel;
  }

  public Monster(String name, String disasterLevel) {
    this.name = name;
    this.disasterLevel = disasterLevel;
  }

  /**
   * Generate a random name for the monster
   *
   * @return a random name
   */
  private String randomName() {
    String name = "Monster";

    return name;
  }

  /**
   * Create a random disaster level
   *
   * @return the disaster level name
   */
  private String randomDisaster() {
    String level = "Tiger";
    return level;
  }

  public void chaos() {
    // do stuff
  }


  @Override
  public void eat(Food food) {

  }

  @Override
  public void workout() {

  }

  @Override
  public void study() {

  }

  @Override
  public void fight() {

  }


}