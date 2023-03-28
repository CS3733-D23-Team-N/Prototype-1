package edu.wpi.niftynymphs.controllers;

import edu.wpi.niftynymphs.entities.ConferenceRoom;
import edu.wpi.niftynymphs.entities.ConferenceServiceRequest;
import edu.wpi.niftynymphs.navigation.Navigation;
import edu.wpi.niftynymphs.navigation.Screen;
import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.controls.MFXComboBox;
import io.github.palexdev.materialfx.controls.MFXDatePicker;
import io.github.palexdev.materialfx.controls.MFXTextField;
import java.time.LocalDate;
import java.util.ArrayList;
import javafx.fxml.FXML;

public class ConferenceServiceRequestController {

  @FXML MFXButton submitButton;
  @FXML MFXButton filterButton;
  @FXML MFXButton confButton1;
  @FXML MFXButton confButton2;
  @FXML MFXButton confButton3;

  @FXML MFXDatePicker datePicker;
  @FXML MFXComboBox startTimeBox;
  @FXML MFXComboBox endTimeBox;
  @FXML MFXTextField capacityField;

  private ConferenceRoom selectedRoom;
  private ArrayList<ConferenceRoom> rooms = new ArrayList<>();
  private ArrayList<ConferenceServiceRequest> serviceRequests;

  @FXML
  public void initialize() {
    rooms.add(new ConferenceRoom("", "L1", 8));
    rooms.add(new ConferenceRoom("", "L1", 8));
    rooms.add(new ConferenceRoom("", "L1", 8));
    confButton1.setOnMouseClicked(event -> setSelectedRoom(rooms.get(0)));
    confButton2.setOnMouseClicked(event -> setSelectedRoom(rooms.get(1)));
    confButton3.setOnMouseClicked(event -> setSelectedRoom(rooms.get(2)));
    submitButton.setOnMouseClicked(event -> Navigation.navigate(Screen.HOME));
  }

  public void setSelectedRoom(ConferenceRoom room) {
    this.selectedRoom = room;
  }

  public void submit() {
    LocalDate date = datePicker.getValue();
    // LocalTime startTime = startTimeBox.getValue();
    // LocalTime endTime = endTimeBox.getValue();
    // int capacity = capacityField.getText();
    // ConferenceServiceRequest serviceRequest =
    //    new ConferenceServiceRequest(date, startTime, endTime, capacity, selectedRoom);
    // serviceRequests.add(serviceRequest);
  }
}
