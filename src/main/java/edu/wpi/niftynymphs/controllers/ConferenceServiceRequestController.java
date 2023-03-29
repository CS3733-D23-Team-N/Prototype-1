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
import java.time.LocalTime;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;

public class ConferenceServiceRequestController {

  @FXML MFXButton submitButton;
  // @FXML MFXButton filterButton;
  @FXML MFXButton confButton1;
  @FXML MFXButton confButton2;
  @FXML MFXButton confButton3;

  @FXML MFXDatePicker datePicker;
  @FXML MFXComboBox startTimeBox;
  @FXML MFXComboBox endTimeBox;
  @FXML MFXTextField capacityField;

  private ConferenceRoom selectedRoom = new ConferenceRoom("No room selected", "", 0);
  private ArrayList<ConferenceRoom> rooms = new ArrayList<>();
  private ArrayList<ConferenceServiceRequest> serviceRequests = new ArrayList<>();

  @FXML
  public void initialize() {
    ObservableList<String> times =
        FXCollections.observableArrayList(
            "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00",
            "17:00", "18:00", "19:00", "20:00");
    startTimeBox.setItems(times);
    endTimeBox.setItems(times);

    rooms.add(new ConferenceRoom("Anesthesia Conference Room", "L1", 8));
    rooms.add(new ConferenceRoom("Medical Research Conference Room", "L1", 8));
    rooms.add(new ConferenceRoom("Abrams Company Conference Room", "L1", 8));
    confButton1.setOnMouseClicked(event -> confButtonClick(confButton1, rooms.get(0)));
    confButton2.setOnMouseClicked(event -> confButtonClick(confButton2, rooms.get(1)));
    confButton3.setOnMouseClicked(event -> confButtonClick(confButton3, rooms.get(2)));

    submitButton.setOnMouseClicked(event -> submit());
  }

  public void confButtonClick(MFXButton confButton, ConferenceRoom room) {
    confButton1.setStyle("-fx-border-color: #FFFFFF");
    confButton2.setStyle("-fx-border-color: #FFFFFF");
    confButton3.setStyle("-fx-border-color: #FFFFFF");
    confButton.setStyle("-fx-border-color: #0F2C57");
    this.selectedRoom = room;
  }

  public void submit() {
    if (datePicker.getText().isEmpty()
        || startTimeBox.getText().isBlank()
        || endTimeBox.getText().isEmpty()
        || capacityField.getText().isEmpty()
        || selectedRoom.getCapacity() == 0) return;
    LocalDate date = datePicker.getValue();
    LocalTime startTime = LocalTime.parse((CharSequence) startTimeBox.getValue());
    LocalTime endTime = LocalTime.parse((CharSequence) endTimeBox.getValue());
    int capacity = 8;
    ConferenceServiceRequest serviceRequest =
        new ConferenceServiceRequest(date, startTime, endTime, capacity, selectedRoom);
    serviceRequests.add(serviceRequest);
    Navigation.navigate(Screen.HOME);
  }
}
