package edu.wpi.niftynymphs.entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class ConferenceServiceRequest {
  private LocalDate date;
  private LocalTime startTime;
  private LocalTime endTime;
  private int capacity;
  private ConferenceRoom room;

  public ConferenceServiceRequest(
      LocalDate date, LocalTime startTime, LocalTime endTime, int capacity, ConferenceRoom room) {
    this.date = date;
    this.startTime = startTime;
    this.endTime = endTime;
    this.capacity = capacity;
    this.room = room;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public LocalTime getStartTime() {
    return startTime;
  }

  public void setStartTime(LocalTime startTime) {
    this.startTime = startTime;
  }

  public LocalTime getEndTime() {
    return endTime;
  }

  public void setEndTime(LocalTime endTime) {
    this.endTime = endTime;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public ConferenceRoom getRoom() {
    return room;
  }

  public void setRoom(ConferenceRoom room) {
    this.room = room;
  }
}
