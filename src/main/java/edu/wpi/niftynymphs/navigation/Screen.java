package edu.wpi.niftynymphs.navigation;

public enum Screen {
  ROOT("views/Root.fxml"),
  HOME("views/Home.fxml"),
  HELP("views/Help.fxml"),
  SIGNAGE("views/Signage.fxml"),
  MEAL_SERVICE_REQUEST("views/MealServiceRequest.fxml"),
  MEAL_SERVICE_REQUEST_POP_UP_Pizza("views/MealServiceRequestPopUp - Pizza.fxml"),
  MEAL_SERVICE_REQUEST_POP_UP_Pasta("views/MealServiceRequestPopUp - Pasta.fxml"),
  MEAL_SERVICE_REQUEST_POP_UP_Cake("views/MealServiceRequestPopUp - ChocolateCake.fxml");

  private final String filename;

  Screen(String filename) {
    this.filename = filename;
  }

  public String getFilename() {
    return filename;
  }
}
