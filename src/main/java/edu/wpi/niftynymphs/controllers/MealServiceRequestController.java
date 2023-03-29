package edu.wpi.niftynymphs.controllers;

import edu.wpi.niftynymphs.navigation.Navigation;
import edu.wpi.niftynymphs.navigation.Screen;
import io.github.palexdev.materialfx.controls.MFXButton;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MealServiceRequestController {

  @FXML MFXButton backButton;

  @FXML Button pizzaButton;
  @FXML Button pastaButton;
  @FXML Button cakeButton;

  @FXML Button submitButton;


  // attribute to hold some indicator of which button you selected
  private int selected = -1;

  @FXML
  public void initialize() {
    backButton.setOnMouseClicked(event -> Navigation.navigate(Screen.HOME));

    pizzaButton.setOnMouseClicked(event -> {
      selected = 0;
    });

    pastaButton.setOnMouseClicked(event -> {
      selected = 1;
    });

    cakeButton.setOnMouseClicked(event -> {
      selected = 2;
    });

    submitButton.setOnMouseClicked(event -> {
      if(selected == 0){
        // Navigate to pizza page
      }
      if(selected == 1){
        // Navigate to pasta page
      }
      if(selected ==2){
        // Navigate to cake page
      }
    });


  }
}
