package edu.wpi.niftynymphs.controllers;

import edu.wpi.niftynymphs.navigation.Navigation;
import edu.wpi.niftynymphs.navigation.Screen;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HomeController {

  @FXML ImageView conferenceRoom;
  @FXML ImageView mealDelivery;
  @FXML ImageView flowerDelivery;
  @FXML ImageView furnitureDelivery;
  @FXML ImageView officeDelivery;

  @FXML
  public void initialize() {}

  public void navigateConferenceRoom() {
    Navigation.navigate(Screen.CONFERENCE_SERVICE_REQUEST);
  }

  public void navigateMealDelivery() {
    Navigation.navigate(Screen.CONFERENCE_SERVICE_REQUEST);
  }

  public void navigateSignage() {
    Navigation.navigate(Screen.SIGNAGE);
  }

  // Button color change when mouse move on the
  // button---------------------------------------------------
  public void conferenceRoomLight() throws FileNotFoundException {
    InputStream stream =
        new FileInputStream(
            "src/main/resources/edu/wpi/niftynymphs/images/Conference Room Reservation Request Button Light.png");
    Image newImg = new Image(stream);
    conferenceRoom.setImage(newImg);
  }

  public void conferenceRoomDark() throws FileNotFoundException {
    InputStream stream =
        new FileInputStream(
            "src/main/resources/edu/wpi/niftynymphs/images/Conference Room Reservation Request Button.png");
    Image newImg = new Image(stream);
    conferenceRoom.setImage(newImg);
  }

  public void mealDeliveryLight() throws FileNotFoundException {
    InputStream stream =
        new FileInputStream(
            "src/main/resources/edu/wpi/niftynymphs/images/Meal Delivery Request Light.png");
    Image newImg = new Image(stream);
    mealDelivery.setImage(newImg);
  }

  public void mealDeliveryDark() throws FileNotFoundException {
    InputStream stream =
        new FileInputStream(
            "src/main/resources/edu/wpi/niftynymphs/images/Meal Delivery Request.png");
    Image newImg = new Image(stream);
    mealDelivery.setImage(newImg);
  }

  public void flowerDeliveryLight() throws FileNotFoundException {
    InputStream stream =
        new FileInputStream(
            "src/main/resources/edu/wpi/niftynymphs/images/Flower Delivery Request Light.png");
    Image newImg = new Image(stream);
    flowerDelivery.setImage(newImg);
  }

  public void flowerDeliveryDark() throws FileNotFoundException {
    InputStream stream =
        new FileInputStream(
            "src/main/resources/edu/wpi/niftynymphs/images/Flower Delivery Request.png");
    Image newImg = new Image(stream);
    flowerDelivery.setImage(newImg);
  }

  public void furnitureDeliveryLight() throws FileNotFoundException {
    InputStream stream =
        new FileInputStream(
            "src/main/resources/edu/wpi/niftynymphs/images/Furniture Delivery Request Light.png");
    Image newImg = new Image(stream);
    furnitureDelivery.setImage(newImg);
  }

  public void furnitureDeliveryDark() throws FileNotFoundException {
    InputStream stream =
        new FileInputStream(
            "src/main/resources/edu/wpi/niftynymphs/images/Furniture Delivery Request.png");
    Image newImg = new Image(stream);
    furnitureDelivery.setImage(newImg);
  }

  public void officeDeliveryLight() throws FileNotFoundException {
    InputStream stream =
        new FileInputStream(
            "src/main/resources/edu/wpi/niftynymphs/images/Office Supplies Purchase and Delivery Request Light.png");
    Image newImg = new Image(stream);
    officeDelivery.setImage(newImg);
  }

  public void officeDeliveryDark() throws FileNotFoundException {
    InputStream stream =
        new FileInputStream(
            "src/main/resources/edu/wpi/niftynymphs/images/Office Supplies Purchase and Delivery Request.png");
    Image newImg = new Image(stream);
    officeDelivery.setImage(newImg);
  }
  // Button color change when mouse move on the
  // button---------------------------------------------------
}
