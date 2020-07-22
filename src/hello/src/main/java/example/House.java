package example;

import java.util.ArrayList;
import java.util.List;

public class House {

  String name;
  private List<Room> rooms = new ArrayList<>();

  House() {
    this.name = "house";
  }

  House(String name) {
    this.name = name;
  }

  static void main(String[] args) {
    System.out.println("Hello World");
  }


  public void setDefaultRooms() {
    rooms.add(new Room("Kitchen"));
    rooms.add(new Room("Living room"));
    rooms.add(new Room("Bathroom"));
    rooms.add(new Room("Bedroom"));
  }

  public List openTheDoor() {
    return rooms;
  }
}
