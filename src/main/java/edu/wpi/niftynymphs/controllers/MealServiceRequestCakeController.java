package edu.wpi.niftynymphs.controllers;

import edu.wpi.niftynymphs.navigation.Navigation;
import edu.wpi.niftynymphs.navigation.Screen;
import io.github.palexdev.materialfx.controls.MFXComboBox;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MealServiceRequestCakeController {

  @FXML Button confirmCake;
  @FXML Button cancelCake;

  // attribute to hold some indicator of which button you selected

  @FXML MFXComboBox<String> cakeRoom;
  @FXML MFXComboBox<String> cakeDeliveryTime;

  @FXML
  public void initialize() {

    // Cancel button pressed and navigates back to Meal Service Request Page
    cancelCake.setOnMouseClicked(
        event -> {
          Navigation.navigate(Screen.MEAL_SERVICE_REQUEST);
        });

    ObservableList<String> times =
        FXCollections.observableArrayList(
            "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00",
            "17:00", "18:00", "19:00", "20:00");
    cakeDeliveryTime.setItems(times);

    ObservableList<String> rooms =
        FXCollections.observableArrayList("SL105", "SL104", "UH405", "IS203", "IS207", "GL302");
    cakeRoom.setItems(rooms);

    confirmCake.setOnMouseClicked(
        event -> {
          String deliveryTime;
          String roomNumber;

          deliveryTime = cakeDeliveryTime.getText();
          roomNumber = cakeRoom.getText();
          if (deliveryTime.isEmpty() || roomNumber.isEmpty()) return;
          System.out.println("Chocolate Cake " + deliveryTime + " " + roomNumber);
          Navigation.navigate(Screen.HOME);
        });
  }
}
