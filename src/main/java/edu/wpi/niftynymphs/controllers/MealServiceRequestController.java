package edu.wpi.niftynymphs.controllers;

import edu.wpi.niftynymphs.navigation.Navigation;
import edu.wpi.niftynymphs.navigation.Screen;
import io.github.palexdev.materialfx.controls.MFXButton;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MealServiceRequestController {

  @FXML Button pizzaButton;
  @FXML Button pastaButton;
  @FXML Button cakeButton;

  @FXML Button submitButton;

  // attribute to hold some indicator of which button you selected
  private int selected = -1;

  @FXML
  public void initialize() {

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
        Navigation.navigate(Screen.MEAL_SERVICE_REQUEST_POP_UP_Pizza);
      }
      if(selected == 1){
        Navigation.navigate(Screen.MEAL_SERVICE_REQUEST_POP_UP_Pasta);
      }
      if(selected ==2){
        Navigation.navigate(Screen.MEAL_SERVICE_REQUEST_POP_UP_Cake);
      }
    });


  }
}
