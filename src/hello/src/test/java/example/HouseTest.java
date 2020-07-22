package example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class HouseTest {

  @Test
  public void houseDifferentName() {
    assertEquals("house", new House().name);
    assertEquals("maison", new House("maison").name);
  }

  @Test
  public void houseGivesOptionsOfRoomsWhenOpeningTheDoor() {
    House testHouse = new House(); // Given you have a house
    testHouse.setDefaultRooms(); // And it has a default set of rooms
    List roomOptions = testHouse.openTheDoor(); // When you open the door of that house
    assertEquals(4, roomOptions.size()); // Then you will be given 4 room options
  }

}