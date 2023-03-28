package edu.wpi.niftynymphs.controllers;

import edu.wpi.niftynymphs.navigation.Navigation;
import edu.wpi.niftynymphs.navigation.Screen;
import io.github.palexdev.materialfx.controls.MFXButton;
import java.awt.*;
import javafx.fxml.FXML;

public class HomeController {
  @FXML MFXButton conferenceRoomButton;
  @FXML MFXButton mealDeliveryButton;
  @FXML MFXButton flowerDeliveryButton;
  @FXML MFXButton FurnitureDeliveryButton;
  @FXML MFXButton OfficeDeliveryButton;

  @FXML
  public void initialize() {
    conferenceRoomButton.setOnMouseClicked(event ->
            Navigation.navigate(
                Screen.SERVICE_REQUEST)); // conference room reservation request button
    mealDeliveryButton.setOnMouseClicked(
        event -> Navigation.navigate(Screen.SERVICE_REQUEST)); // meal delivery request button
    flowerDeliveryButton.setOnMouseClicked(
        event -> Navigation.navigate(Screen.SERVICE_REQUEST)); // flower delivery request button
    FurnitureDeliveryButton.setOnMouseClicked(
            event -> Navigation.navigate(Screen.SERVICE_REQUEST)); // furniture delivery request button
    OfficeDeliveryButton.setOnMouseClicked(
            event -> Navigation.navigate(Screen.SERVICE_REQUEST)); // office delivery request button

    // request button

  }
}
