package edu.wpi.niftynymphs.entities;

public class Room {
  private String name;
  private String floor;

  public Room(String name, String floor) {
    this.name = name;
    this.floor = floor;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFloor() {
    return floor;
  }

  public void setFloor(String floor) {
    this.floor = floor;
  }
}
