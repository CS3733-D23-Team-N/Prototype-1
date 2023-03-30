package edu.wpi.niftynymphs.controllers;

import edu.wpi.niftynymphs.navigation.Navigation;
import edu.wpi.niftynymphs.navigation.Screen;
import io.github.palexdev.materialfx.controls.MFXComboBox;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MealServiceRequestPastaController {

  @FXML Button confirmPasta;
  @FXML Button cancelPasta;

  // attribute to hold some indicator of which button you selected

  @FXML MFXComboBox pastaRoom;
  @FXML MFXComboBox pastaDeliveryTime;

  @FXML
  public void initialize() {

    // Cancel button pressed and navigates back to Meal Service Request Page
    cancelPasta.setOnMouseClicked(
        event -> {
          Navigation.navigate(Screen.MEAL_SERVICE_REQUEST);
        });

    ObservableList<String> times =
        FXCollections.observableArrayList(
            "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00",
            "17:00", "18:00", "19:00", "20:00");
    pastaDeliveryTime.setItems(times);

    ObservableList<String> rooms =
        FXCollections.observableArrayList("SL105", "SL104", "UH405", "IS203", "IS207", "GL302");
    pastaRoom.setItems(rooms);

    confirmPasta.setOnMouseClicked(
        event -> {
          String deliveryTime;
          String roomNumber;

          deliveryTime = pastaDeliveryTime.getText();
          roomNumber = pastaRoom.getText();
          if (deliveryTime.isEmpty() || roomNumber.isEmpty()) return;
          System.out.println("Pasta " + deliveryTime + " " + roomNumber);
          Navigation.navigate(Screen.HOME);
        });
  }
}
