package edu.wpi.niftynymphs.controllers;

import edu.wpi.niftynymphs.navigation.Navigation;
import edu.wpi.niftynymphs.navigation.Screen;
import io.github.palexdev.materialfx.controls.MFXButton;
import javafx.fxml.FXML;

public class HomeController {

  @FXML MFXButton navigateButton;

  @FXML
  public void navigateConferenceRoom() {
    Navigation.navigate(Screen.SERVICE_REQUEST);
  }

  public void navigateMealDelivery() {
    Navigation.navigate(Screen.SERVICE_REQUEST);
  }

  public void navigateFlowerDelivery() {
    Navigation.navigate(Screen.SERVICE_REQUEST);
  }

  public void navigateFurnitureDelivery() {
    Navigation.navigate(Screen.SERVICE_REQUEST);
  }

  public void navigateOfficeSupply() {
    Navigation.navigate(Screen.SERVICE_REQUEST);
  }

  public void navigateSignage() {
    Navigation.navigate(Screen.SERVICE_REQUEST);
  }
}
