package edu.wpi.niftynymphs.controllers;

import edu.wpi.niftynymphs.navigation.Navigation;
import edu.wpi.niftynymphs.navigation.Screen;
import io.github.palexdev.materialfx.controls.MFXButton;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MealServiceRequestPizzaController {

    @FXML Button confirmPizza;
    @FXML Button cancelPizza;

    // attribute to hold some indicator of which button you selected


    @FXML
    public void initialize(){

        // Cancel button pressed and navigates back to Meal Service Request Page
        cancelPizza.setOnMouseClicked(event ->{
            Navigation.navigate(Screen.MEAL_SERVICE_REQUEST);
        });

    }


}
