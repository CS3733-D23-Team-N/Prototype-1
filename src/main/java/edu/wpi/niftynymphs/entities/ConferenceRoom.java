package edu.wpi.niftynymphs.entities;

public class ConferenceRoom extends Room {
    private int capacity;

    public ConferenceRoom(String name, String floor, int capacity) {
        super(name, floor);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
